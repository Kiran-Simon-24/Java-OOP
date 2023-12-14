package oop.Basic;

class AnonymousObject {
    void fact(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("factorial is" + " " + fact);
    }
    public static void main(String[] args){
        new AnonymousObject().fact(5);
        new AnonymousObject().fact(6);
        new AnonymousObject().fact(9);
    }
}
