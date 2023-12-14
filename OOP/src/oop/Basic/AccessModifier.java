package oop.Basic;

class AccessModifier {
     int id;
     String name;
     void AccessModifier1(int i, String n){
         id = i;
         name = n;
     }
    void display(){System.out.println(id + " " + name);}
}

class main {
    public static void main(String[] args) {
        AccessModifier c1 = new AccessModifier();
        c1.AccessModifier1(1, "YOLO");
        c1.display();
    }
}
