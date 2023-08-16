/*Polymorphism
polymorphism make with 2 different word poly(bohat jyada) and morphism(many form)
when we do 1 work in different forms it's calls polymorphism

There are two types of polymorphism
1)Function Overloading...Compile time polymorphism
2)Function Overriding... Runtime polymorphism

Overloading Compile time
*/

//Compile Time polymorphism
package polymorphism;
class Student
{
    String name;
    int age;
    
    //method overloading printInfo() method is declare 3 times
    public void printInfo(String name)
    {
        System.out.println(name);
    }
    public void printInfo(int age)
    {
        System.out.println(age);
    }
    public void printInfo(String name, int age)
    {
        System.out.println(name+"\n"+age);
    }
}
class Polymorphism
{
    public static void main(String[]args)
    {
        Student stud1=new Student();
        stud1.name="Aarti";
        stud1.age=22;
        stud1.printInfo(stud1.age);
    }
}