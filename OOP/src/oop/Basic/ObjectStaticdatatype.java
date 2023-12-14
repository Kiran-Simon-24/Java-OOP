package oop.Basic;

class ObjectStaticdatatype {
    static String employee_name;
    static float employee_salary;

    static void insert(String n, float s) {
        employee_name = n;
        employee_salary = s;
    }

    static void display() {
        System.out.println(employee_name + " " + employee_salary);
    }

    public static void main(String[] args) {
        ObjectStaticdatatype.insert("John", 250000);
        ObjectStaticdatatype.display();
    }
}