package oop.Basic;

public class Exercise {
    static class Employee {
        String name;
        int year_of_joining;
        float salary;
        String address;

        Employee(String n, int y, String add) {
            name = n;
            year_of_joining = y;
            address = add;
        }

        void display() {
            System.out.println(name + " " + year_of_joining + " " + address);
        }}
        public static void main(String[] args){
        Employee e1 = new Employee("Robert", 1994, "64C- WallsStreet");
        Employee e2 = new Employee("Sam", 2000, "68D- WallsStreet");
        Employee e3 = new Employee("John", 1999, "26B- WallsStreet");
        e1.display();
        e2.display();
        e3.display();
    }
}
