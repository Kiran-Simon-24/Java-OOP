package oop.Basic;

public class ConstructoOverload {
    int id, age ;
    String name;

    ConstructoOverload(int i, String n){
        id = i;
        name =n;
    }
    ConstructoOverload(int i, String n, int a ){
        id = i;
        name =n;
        age = a;
    }
    void display(){System.out.println(id+" " + name + " " + age);}
}
class S {
    public static void main(String[] args){
        ConstructoOverload c1 = new ConstructoOverload(111, "Bobby");
        ConstructoOverload c2 = new ConstructoOverload(112 , "Dummy", 15);
        c1.display();
        c2.display();
    }
}
