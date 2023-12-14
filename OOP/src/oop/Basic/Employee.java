package oop.Basic;

class Employee {
    int id;
    String name;
    float salary;
    void insert(int i, String n, float s){
        id = i;
        name = n;
        salary = s;
    }
    void display(){
        System.out.println(id + " " + name + " " + salary);
    }
}
class EmployeeFact{
    public static void main(String[] args) {
        Employee e1 = new Employee(), e2 = new Employee(), e3 = new Employee();
        e1.insert(101, "Bruno", 250000);
        e2.insert(102,"Case", 300000);
        e3.insert(103, "Mount", 250000);
        e1.display();
        e2.display();
        e3.display();

    }
}