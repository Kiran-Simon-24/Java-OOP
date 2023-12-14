package oop.Basic;

class ParameterizedConstructor {
    int id;
    String name;
    ParameterizedConstructor(int i,String n){
        id = i;
        name = n;
    }
    void display(){System.out.println(id + " " + name);}
}
class Test{
    public static void main(String[] args){
        ParameterizedConstructor p1 = new ParameterizedConstructor(101, "Bob");
        ParameterizedConstructor p2 = new ParameterizedConstructor(102, "Jenny");
        p1.display();
        p2.display();
    }
}
