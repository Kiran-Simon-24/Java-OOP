package oop.Basic;

class Base {
    int x ;
    Base(int x){
        this.x = x;
    }
}
class Derived extends Base{
    int y;
    Derived(int x, int y){
        super(x);
        this.y = y;
    }
    void display(){System.out.println("x = "+ x + ","+" " + "y = " + y);}
}
class Answer{
    public static void main(String []args ){
        Derived d = new Derived(11,12);
        d.display();
    }
}
