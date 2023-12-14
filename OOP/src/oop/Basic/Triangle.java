package oop.Basic;

 class Triangle {
     double area, a, b,c,perimeter;
     Triangle(){
         this.a = 3;
         this.b = 4;
         this.c = 5;
     }
     void Per(){
         perimeter = a + b + c;
     }
     void Area(){
         double s = (a+b+c)/2;
         area = Math.sqrt(s * (s-a) * (s-b) * (s-c));
     }
     void display(){System.out.println("The perimeter is: " +" " + perimeter + "\n" + "The area is: " + " " + area);}
}
class Triangle_main{
     public static void main(String []args){
         Triangle t1 = new Triangle();
         t1.Per();
         t1.Area();
         t1.display();
     }
}
