package oop.Basic;

public class Animal {
    void eat(){
        System.out.println("eating...");
    }
}
//Single Inheritance
class Dog extends Animal{
    void bark(){System.out.println("barking...");}
}
// Multi level
class BabyDog extends Dog{
    void weep(){System.out.println("weeping...");}
}

//Hierarchical Inheritance
class Cat extends Animal{
    void bark(){System.out.println("Meow");}
}

class TestInheritance{
    public static void main(String[] args){
        BabyDog d =new BabyDog();
        Cat c = new Cat();
        c.bark();
        d.bark();
        d.eat();
        d.weep();
    }
}
