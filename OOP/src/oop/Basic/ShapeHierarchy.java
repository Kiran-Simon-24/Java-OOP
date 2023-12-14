package oop.Basic;

public class ShapeHierarchy {
    public static void main(String[] args) {

        Circle c = new Circle();
        Square s = new Square();
        Triangle1 t = new Triangle1();
        Shape[] shapes = {c,s,t};

        /*shapes[0] = new Circle();
        shapes[1] = new Square();
        shapes[2] = new Triangle1();*/

        for (Shape shape : shapes) {
            System.out.println("Area " + shape.calculateArea());
        }
    }
}
class Shape{
   public double calculateArea(){
       return 0.0;
   };
}
class Circle extends Shape{
    private double radius = 2;
    public double calculateArea(){
        return Math.PI * radius * radius;
    }
}
class Square extends Shape{
    private double side = 4.5;
    public double calculateArea(){
        return side * side;
    }
}
class Triangle1 extends Shape{
    double a = 5, b = 4, c = 3;
    private double s =  (a+b+c)/2;
    public double calculateArea(){
        return Math.sqrt(s * (s-a) * (s-b) * (s-c));
    }
}
