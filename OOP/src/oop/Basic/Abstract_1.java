package oop.Basic;
abstract class Shape_1{
    abstract void draw();
}
class Rectangle_1 extends Shape_1{
    void draw(){System.out.println("drawing rectangle");}
}
class Circle_1 extends Shape_1{
    void draw(){System.out.println("drawing circle");}
}

public class Abstract_1 {
    public static void main(String[] args) {
        Shape_1 s = new Circle_1();
        s.draw();
    }
}
