package oop.Basic;
     class Employee1 {
        float salary = 40000;
    }

     class Developer1 extends Employee1 {
        float bonus = 10000;
        public static void main(String[] args) {
            Developer1 d1 = new Developer1();
            System.out.println("Employee salary is" + " "+ d1.salary);
            System.out.println("Employee salary is" + " "+ d1.bonus);

        }
    }

