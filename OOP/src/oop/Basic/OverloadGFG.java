package oop.Basic;

public class OverloadGFG {
    OverloadGFG(String name){
        System.out.println("User name is:" + " " + name);
    }
    OverloadGFG(int id, String name){
        System.out.println("ID and username is: " +" "+ id + "," +" "+ name);
    }
    public static void main(String[] args){
        OverloadGFG g1 = new OverloadGFG("Bobby");
        OverloadGFG g2 = new OverloadGFG(101, "Daniel");
    }
}
