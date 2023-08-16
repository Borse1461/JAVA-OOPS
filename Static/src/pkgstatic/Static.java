/*
Static variables can access using class name direct without creating object of class
Static take memory only one time
static also save memory
Static can be class,method,variables,block,nexted class
static store common information
*/
package pkgstatic;
class Student{
    String name;
    static String school;           //all student school name will be same cuase this is static variable it can change for all student at a time
    
}   
public class Static {

    public static void main(String[] args) {
        Student.school="Sarvajanik Vidyalay Sarbete kh";
        Student stud1=new Student();
        stud1.name="Tony";
        System.out.println(stud1.school+"\n"+stud1.name);       //it will print stud1 school name
    }
    
}
