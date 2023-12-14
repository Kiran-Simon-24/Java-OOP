package oop.Basic;
class Address{
    String city,state,country;
    Address(String city, String state, String country){
        this.city = city;
        this.state = state;
        this.country = country;
    }
}
public class Aggregation {
    int id;
    String name;
    Address address;
    public Aggregation(int id, String name,Address address){
            this.id = id;
            this.name = name;
            this.address = address;
    }
    void display(){
        System.out.println("ID" + " " +  id + " " + "Name" + " "+ name);
        System.out.println(address.city + " " + address.state + " " + address.country);
    }
    public static void main(String[] args) {
        Address add1 = new Address("New York,", "Washington DC,","USA");
        Aggregation emp1 = new Aggregation(101 , "Jonny", add1);
        emp1.display();

    }
}
