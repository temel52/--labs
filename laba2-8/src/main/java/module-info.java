module com.example.laba28 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.laba28 to javafx.fxml;
    exports com.example.laba28;
}