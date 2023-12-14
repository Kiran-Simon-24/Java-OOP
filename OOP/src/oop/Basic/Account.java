package oop.Basic;

class Account {
    int acc_id;
    String name;
    float amount;
    void insert(int i, String n,float amt){
        acc_id = i;
        name = n;
        amount = amt;
    }
    void deposit(float amt){
        amount = amount + amt;
        System.out.println(amount + " " + "deposited");
        System.out.println("Your new account balance is"+ " "+ amount);
    }
    void checkBalance(){
        System.out.println(amount);
    }
    void withdraw(float amt){
        if(amount<amt){
            System.out.println("Insufficient balance");
        }
        else{
            amount -= amt;
            System.out.println(amt +" "+ "Withdraw");
            System.out.println("Your account balance is"+ " "+ amount);

        }
    }
    void display(){System.out.println(acc_id+ " "+ name + " " + amount);}
}
class ATM{
    public static void main(String[] args){
        Account a1 = new Account(), a2 = new Account();
        a1.insert(1,"Daniel", 1000);
        a1.display();
        a1.checkBalance();
        a1.deposit(50000);
        a1.withdraw(30000);
        System.out.println();
        a2.insert(2,"John", 10000);
        a2.display();
        a2.checkBalance();
        a2.deposit(40000);
        a2.withdraw(60000);

    }
}
