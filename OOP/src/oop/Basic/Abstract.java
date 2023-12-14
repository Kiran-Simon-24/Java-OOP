package oop.Basic;
abstract class Bank_1{
    abstract int getRateOfInterest();
}
class UBO extends Bank_1{
     int getRateOfInterest(){return 7;}
}
class PNB extends Bank_1{
     int getRateOfInterest(){return 8;}
}

public class Abstract {
    public static void main(String[] args) {
        Bank_1 b;
        b = new UBO();
        System.out.println("Rate of Interest is:" + b.getRateOfInterest() + "%");
        b = new PNB();
        System.out.println("Rate of Interest is:" + b.getRateOfInterest() + "%");
    }
}
