package oop.Basic;

public class SuperKeyWord {
    public static void main(String[] args){
        emp p1 = new emp(1, "Jonny" , 50000);
        p1.display();
    }
}
class person{
    int id;
    String name;
    person(int id, String name){
        this.id = id;
        this.name = name;
    }
}
class emp extends person{
    float salary;
    emp(int id, String name, float salary){
        super(id,name);
        this.salary = salary;
    }
    void display(){
        System.out.println(id + " " + name + " " + salary);
    }
}
