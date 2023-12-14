package oop.Basic;
//Initialize object by References variables
class Student { //Object
    int id;
    String name;
}
class TestStudent{
    public static void main(String[] args){ //main method
        Student s1 = new Student(); //Reference variable
        Student s2 = new Student();
        s1.id = 100;
        s1.name = "John";
        s2.id = 101;
        s2.name = "Doe";
        System.out.println(s1.id+ " "+ s1.name);
        System.out.println(s2.id+ " "+ s2.name);
    }
}
