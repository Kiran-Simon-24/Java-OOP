package oop.Basic;

class CopyConstructor {
    int id;
    String name;
    CopyConstructor(int i, String n){
        id = i;
        name = n;
    }
    CopyConstructor(CopyConstructor cp){ //Copy constructor
        id = cp.id;
        name = cp.name;
    }
    public static void main(String[] args){
        CopyConstructor c1 = new CopyConstructor(101, "John");
        System.out.println(c1.id + " " + c1.name);

        System.out.println();

        CopyConstructor c2 = new CopyConstructor(c1);
        System.out.println(c2.id + " " + c2.name);
    }
}
