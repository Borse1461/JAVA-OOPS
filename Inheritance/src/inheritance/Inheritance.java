/*
There are mainly 4 types of Inheritance in java
1) Single Inheritance
2) Multilevel Inheritance
3)Hirarchical Inheritance
4)Hybrid Inheritance

Note java have no Multiple Inheritance 
C++ have 5 types of inheritance
*/
package inheritance;
//combination of all types of inheritance is Hybrid Indheritance
class Parent{
    //Parent Class
}
class Child extends Parent{
    //child class which is extends Parent class properties such as functions subclasses variables
}
class Child_child extends Child{
    //Multilevel Inheritance 
    //It will extends all properties of Child class
}
class Child2 extends Parent{
    //Extend parent class properties only
    //Hybrid Inheritance
    
}
public class Inheritance {
    public static void main(String[] args) {
            
    }
    
}
