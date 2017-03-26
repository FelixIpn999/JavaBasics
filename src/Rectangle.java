import sun.security.provider.SHA;
import java.util.Scanner;

/**
 * Created by FELIX on 25/03/2017.
 */
public class Rectangle extends Shape {
    private double width = 0;
    private double height = 0;
    public Rectangle(){
        super("Rectangle");
    }

    public Rectangle(String shapeName, double width, double height) {
        super(shapeName);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return (height *width);
    }

    @Override
    public double getPerimeter() {
        return ((2*width)+(2*height));
    }

    @Override
    public void readShapeData() {
        Scanner in = new Scanner(System.in);
        System.out.println("Add the info to the rectangle");
        System.out.println("Enter the width");
        width = in.nextDouble();
        System.out.println("Enter the height");
        height = in.nextDouble();

    }

    @Override
    public String toString() {
        return super.toString() + ": width is "+ width + ": height is "+ height;
    }
}
