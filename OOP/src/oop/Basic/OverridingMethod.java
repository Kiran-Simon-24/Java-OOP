package oop.Basic;

// Overriding Method
public class OverridingMethod {
    public static void main (String[] args){

        SBI b1 =  new SBI();
        ICICI b2  =  new ICICI();
        AXIS b3 = new AXIS();
        System.out.println("The Interest rate of SBI Bank is " + b1.getRateOfInterest());
        System.out.println("The Interest rate of ICICI Bank is " + b2.getRateOfInterest());
        System.out.println("The Interest rate of AXIS Bank is " + b3.getRateOfInterest());
    }
}

// Example of Bank
class Bank{
   int getRateOfInterest(){return 0;}
}
class SBI extends Bank{
     int getRateOfInterest(){return 8; }
}
class ICICI extends Bank{
     int getRateOfInterest(){return 9; }
}
class AXIS extends Bank{
     int getRateOfInterest(){return 7; }
}
