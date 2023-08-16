package constructor;
class Student
{
    String name;
    int age;
    public void printInfo()
    {
    System.out.println(this.name);
    System.out.println(this.age);
    }
    
    Student(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
}
class Pen
{
    String color;
    String type;
    
    public void printPen()
    {
        System.out.println(color+" "+type);
    }
    Pen(Pen pen2)       //this is copy constructor....which is copy 1 object into another object
    {
        this.color=pen2.color;
        this.type=pen2.type;
    }
    Pen(){
        
    }
}
class Constructor
{
    public static void main(String[] args)
    {
        //parameterise constructor
        Student stud1=new Student("aarti",22);  //parameterise constructor
        stud1.printInfo();
        
        //copy constructor
        Pen pen1=new Pen();
        pen1.color="red";
        pen1.type="gel";
        
        Pen pen2=new Pen(pen1);         //pass object 1 as argument to the constructor
        pen2.printPen();
    }
}
