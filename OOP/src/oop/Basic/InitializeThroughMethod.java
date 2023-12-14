package oop.Basic;

class Student1{
        int rollno;
        String name;
        void insertRecord(int r, String n){
            rollno = r;
            name = n;
        }
        void displayInfo(){System.out.println(rollno + " " + name);}
}
class TestStudent1 {
        public static void main(String[] args) {
            Student1 s1 = new Student1();
            Student1 s2 = new Student1();
            Student1 s3 = new Student1();
            Student1 s4 = new Student1();
            s1.insertRecord(100, "John");
            s2.insertRecord(102,"Dummy");
            s3.insertRecord(101, "Doe");
            s4.insertRecord(103, "Micky");
            s1.displayInfo();
            s2.displayInfo();
            s3.displayInfo();
            s4.displayInfo();
        }
}

