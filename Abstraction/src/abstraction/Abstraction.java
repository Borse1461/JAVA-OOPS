/*
 Abstraction is concept of Data Hiding
 Abstraction can be achieved in 2 ways
1) Abstraction Class
2) Interfaces (Pure Abstraction
 
Abstraction Class
-> Abstract class must be declared with abstract keyword
-> It can have abstract and non-abstract methods
-> It can't be instantiated...means we cant create object of abstract class and call their instances
-> It can have static methods and constructor also
-> It can have final method which will force the subclass not be change the body of the method.
*/

package abstraction;

abstract class Animal{
    abstract void walk();
    Animal(){
        System.out.println("Animal eats");
    }
}
class Horse extends Animal{
    Horse(){
        System.out.println("Horse eats");
    }
    public void walk(){
        System.out.println("walk on 4 legs");
    }
}
public class Abstraction {
 
    public static void main(String[] args) {
        Horse h=new Horse();
        h.walk();
       
    }
    
}
