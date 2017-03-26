/**
 * Created by FELIX on 25/03/2017.
 */
import java.util.Scanner;
public class Triangle extends  Shape {
    private double size1 , size2,size3 =0;

    public Triangle(String shapeName) {
        super(shapeName);
    }

    public Triangle(String shapeName, double size1) {
        super(shapeName);
        this.size1 = size1;
    }

    @Override
    public double getArea() {
        return ((size1+size2+size3)/2);
    }

    @Override
    public double getPerimeter() {
        return size1+size2+size3;
    }

    @Override
    public void readShapeData() {
Scanner reader =  new Scanner(System.in);
System.out.println("Enter the data");
System.out.println("Enter the first size");
size1 = reader.nextDouble();
        System.out.println("Enter the second size");
        size2 = reader.nextDouble();
        System.out.println("Enter the third size");
        size3 = reader.nextDouble();
    }
}
