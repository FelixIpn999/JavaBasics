/**
 * Created by FELIX on 25/03/2017.
 */

public abstract class Shape{

    private String shapeName = "";

    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    public String getShapeName(){return shapeName;}

    @Override
    public String toString() {
        return "Shape is a "+ shapeName;
    }

    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract void readShapeData();
}
