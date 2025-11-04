import java.util.Scanner;
abstract class Shape
{
    double dim1,dim2;
    Scanner s=new Scanner(System.in);
    abstract void input();
    abstract void printArea();
}
class Rectangle extends Shape
{
    void input()
    {
        System.out.println("Enter dimensions of Rectangle(length and breadth):");
        dim1=s.nextDouble();
        dim2=s.nextDouble();

    }
    void printArea()
    {
        System.out.println("Area of Rectangle:"+(dim1*dim2));
    }
}
class Triangle extends Shape
{
    void input()
    {
        System.out.println("Enter dimensions of Triangle(base and height):");
        dim1=s.nextDouble();
        dim2=s.nextDouble();
    }
    void printArea()
    {
        System.out.println("Area of Triangle:"+(0.5*dim1*dim2));
    }
}
class Circle extends Shape
{
    void input()
    {
        System.out.println("Enter dimensions of Circle(radius):");
        dim1=s.nextDouble();
    }
    void printArea()
    {
        System.out.println("Area of Circle:"+(3.14*dim1*dim1));
    }
}
class AbstractArea
{
    public static void main(String args[])
    {
        Rectangle r=new Rectangle();
        Triangle t=new Triangle();
        Circle c=new Circle();
        r.input();
        t.input();
        c.input();
        r.printArea();
        t.printArea();
        c.printArea();
    }
}