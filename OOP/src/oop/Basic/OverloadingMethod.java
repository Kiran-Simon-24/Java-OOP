package oop.Basic;
// Method Overloading
public class OverloadingMethod {
    public static void main(String[] args){
    System.out.println(Adder.add(12 ,13));
    System.out.println(Adder.add(11.1,22.5,5.7));
    }

}
class Adder{
    static int add(int a, int b){
        return a+b;
    }
    static double add(double a, double b, double c){
        return a+b+c;
    }

}

