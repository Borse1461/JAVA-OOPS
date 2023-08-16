package pen;
class PenBluePrint
{
    String color;
    String type;
    public void write()
    {
        System.out.println("Writing Something");
    }
    public void printcolor()
    {
        System.out.println(this.color); //this shows which object are calling the method
    }
}

class Student
{
    String name;
    int age;
    
    public void printInfo()
    {
        System.out.println(this.name);
        System.out.println(this.age);

    }
    Student()
    {
        System.out.println("Studnet Constructor called");
    }
}
public class Pen
{
    public static void main(String[] args){
        PenBluePrint pen1=new PenBluePrint(); //new keyword create the space in memory for objects
                                              //PenBluePrint() this is constructor in java
        pen1.color="blue";
        pen1.type="gel";
        
        pen1.write();
        
        PenBluePrint pen2=new PenBluePrint();
        pen2.color="red";
        pen2.type="boal pen";
        pen2.write();
        
        pen1.printcolor();
        pen2.printcolor();
        
        Student stud1=new Student();
        stud1.name="Aarti";
        stud1.age=23;
        stud1.printInfo();
        
        
    }
    
}
