/**
 * Created by FELIX on 25/03/2017.
 */
import java.util.Scanner;
public class Circle extends Shape {
    private double radious = 0;

    public Circle(String shapeName) {
        super(shapeName);
    }

    public Circle(String shapeName, double radious) {
        super(shapeName);
        this.radious = radious;
    }

    public double getRadious() {
        return radious;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radious,2);
    }

    @Override
    public double getPerimeter() {
        return ((2*Math.PI)*(2*radious));
    }

    @Override
    public void readShapeData() {
Scanner lector = new Scanner(System.in);
System.out.println("Enter data to the circle");
System.out.println("Enter data to the Radious");
radious = lector.nextDouble();

    }
}
