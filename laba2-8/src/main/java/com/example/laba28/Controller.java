package com.example.laba28;


import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.PixelWriter;
import javafx.scene.paint.Color;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private Canvas mainCanvas;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        GraphicsContext ctx = mainCanvas.getGraphicsContext2D();
        drawTriangle(ctx, 0, 200, 100, 0, 500, 100, Color.RED, Color.GREEN,Color.BLUE);
    }

    void drawTriangle(GraphicsContext graphicsContext, int x1, int y1, int x2, int y2, int x3, int y3, Color color1, Color color2, Color color3) {

        PixelWriter pixelWriter = graphicsContext.getPixelWriter();

        int minX = min(x1, x2, x3);
        int minY = min(y1, y2, y3);
        int maxX = max(x1, x2, x3);
        int maxY = max(y1, y2, y3);

//Переменные minX, minY, maxX и maxY используются для определения границ области, в которой будет производиться рисование.
//Эти переменные вычисляются на основе координат вершин треугольника, который будет закрашен.

        for (int x = minX; x <= maxX; x++) {
            for (int y = minY; y <= maxY; y++) {
                if (isPointInTriangle(x, y, x1, y1, x2, y2, x3, y3)) {//где x и y - координаты текущего пикселя, x1, y1, x2, y2, x3, y3 - координаты вершин треугольника
                    // вычисляются значения барицентрических координат alpha, beta и gamma с помощью формул,
                    // которые используются для вычисления площадей подтреугольников,
                    // образованных вершинами треугольника и координатами пикселя.

                    double alpha = (double) ((y2 - y3) * (x - x3) + (x3 - x2) * (y - y3)) / ((y2 - y3) * (x1 - x3) + (x3 - x2) * (y1 - y3));
                    double beta = (double) ((y3 - y1) * (x - x3) + (x1 - x3) * (y - y3)) / ((y2 - y3) * (x1 - x3) + (x3 - x2) * (y1 - y3));
                    double gamma = 1.0 - alpha - beta;


                    double red = (alpha * color1.getRed() + beta * color2.getRed() + gamma * color3.getRed());
                    double green = (alpha * color1.getGreen() + beta * color2.getGreen() + gamma * color3.getGreen());
                    double blue = alpha * color1.getBlue() + beta * color2.getBlue() + gamma * color3.getBlue();
                    red = Math.max(0.0, Math.min(1.0, red));
                    green = Math.max(0.0, Math.min(1.0, green));
                    blue = Math.max(0.0, Math.min(1.0, blue));

                    Color pixelColor = Color.color(red, green, blue);

                    pixelWriter.setColor(x, y, pixelColor);

                }

            }

        }

    }


    boolean isPointInTriangle(int x, int y, int x1, int y1, int x2, int y2, int x3, int y3) {

        double d1 = sign(x, y, x1, y1, x2, y2);
        double d2 = sign(x, y, x2, y2, x3, y3);
        double d3 = sign(x, y, x3, y3, x1, y1);
        boolean hasNeg = (d1 < 0) || (d2 < 0) || (d3 < 0);
        boolean hasPos = (d1 > 0) || (d2 > 0) || (d3 > 0);
        return !(hasNeg && hasPos);

    }

    double sign(int x1, int y1, int x2, int y2, int x3, int y3) {

        return (x1 - x3) * (y2 - y3) - (x2 - x3) * (y1 - y3);

    }
    //Данный код проверяет, находится ли заданная точка внутри треугольника, заданного координатами своих вершин.
    // Для этого используется формула, основанная на вычислении знака площади треугольника,
    // образованного заданными вершинами и заданной точкой. Если знаки площадей треугольников,
    // образованных заданными вершинами и заданной точкой, разные, то точка находится внутри треугольника.
    // Функция sign вычисляет знак площади треугольника, образованного тремя заданными точками. Функция
    // isPointInTriangle использует функцию sign для вычисления знаков площадей треугольников,
    // образованных заданными вершинами и заданной точкой, и проверяет, разные ли знаки у этих треугольников.
    // Если знаки разные, то точка находится внутри треугольника.

    int min(int point1, int point2, int point3) {
        int min = Math.min(point1, point2);

        return Math.min(min, point3);
    }
    int max(int point1, int point2, int point3) {
        int max = Math.max(point1, point2);

        return Math.max(max, point3);
    }
}
