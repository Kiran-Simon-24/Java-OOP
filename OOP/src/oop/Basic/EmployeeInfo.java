package oop.Basic;

public class EmployeeInfo {
    static class Employee {
        int work_day;
        float salary;

        void getIfo(int d, float s) {
            work_day = d;
            salary = s;
        }

        void AddSal() {
            if (salary < 500) {
                salary += 10;
            }
        }

        void AddWork() {
            if (work_day > 6) {
                salary += 5;
            }
        }
        void display(){System.out.println("Salary is" + " " + salary);}
    }
    public static void main(String [] args){
        Employee e1 = new Employee();
        e1.getIfo(7, 400);
        e1.AddWork();
        e1.AddSal();
        e1.display();
    }
}
