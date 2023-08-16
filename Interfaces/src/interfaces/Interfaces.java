/*
Interfaces
-> Interfaces declared with interface keyword
-> Interfaces don't have constructor
-> Interfaces classes can't extend
-> so we implements interface class properties into anoter class
-> All the fields in interfaces are public static and final by default
-> All methods are public, abstract by default
-> A class that implements on interface must implement all the methods delcared in the interface
-> * Multiple Inheritance is implement by using interface
-> Interface abstract methods cant have body
*/
package interfaces;

interface Animal{       //1st interface
    int eyes=2;        //public static final (by default)
    void walk();
}
interface Human{        //2nd interface
    void walk();
}
class Horse implements Animal, Human{       //Inherit interface animal and human
    public void walk(){
        System.out.println("walk on 4 legs");
    }
}

public class Interfaces {


    public static void main(String[] args) {
        Horse horse=new Horse();
        horse.walk();
    }
    
}
