package cg.vsu.model;

import cg.vsu.math.Vector2f;
import cg.vsu.math.Vector3f;

import java.util.ArrayList;
import java.util.List;

/**
 * Updated and redependencied to math library by Alexander Laptev
 * @author Pertsev Roman (Alexander Laptev, Ivan Kosenko)
 */
public class Model {

    public ArrayList<Vector3f> vertices = new ArrayList<Vector3f>();
    public ArrayList<Vector2f> textureVertices = new ArrayList<Vector2f>();
    public ArrayList<Vector3f> normals = new ArrayList<Vector3f>();
    public ArrayList<Polygon> polygons = new ArrayList<Polygon>();
}