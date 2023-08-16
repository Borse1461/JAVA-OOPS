/*
Java has 4 types of Access Modifiers
Public
Protected
Default
Private
*/
package accessmodifiers;
class School{
    public String name=" ";             //name variable can be access holl current package & also another package
    protected String studentName="";     //studentName variable can Access holl current package & another package subclasses only
    int rollNo=0;                        /*This variable is type of private modifier cause we dont defined its modifier so whenever modifier is not defined in the program then this will automatically defined as Default modifier
                                            Which can we access only our current package*/
    private int studMarks=0;            //this is private type of modifier which is can be accessible only current class    If we want to get its value from main method then we have to use get & set method then we can use it out of the class using public methods
    
    public Integer get(){
        return this.studMarks;
        
    }
    public void set(int studMarks){
        this.studMarks=studMarks;
    }
    public void Info(){
        System.out.println(this.name);
        System.out.println(this.studentName);
        System.out.println(this.rollNo);
        
    }
}
public class AccessModifiers {

    public static void main(String[] args) {
        School s=new School();
        s.name="Pratap School";
        s.studentName="Aarti Borse";
        s.rollNo=10;
        s.Info();
        s.set(81);

        System.out.println(s.get());
    }
    
}
