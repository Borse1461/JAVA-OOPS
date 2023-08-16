/*
 A series of numbers in which each number (Finonacci number ) is the sum of the two precending numbes
 0 1 2 3 5 8 13 . . .
 */
package fibonacci;
class Fib{
    Fib(){
        int n1=0;
        int n2=1;
        int sum=0;
        System.out.print(n1+ " "+n2 +" ");
        for(int i=3;i<=10;i++)
        {
            sum=n1+n2;
            System.out.print(" "+sum);
            n1=n2;
            n2=sum;
        }
    }

}
public class Fibonacci {
  
    public static void main(String[] args) {
        Fib f=new Fib();
    }
    
}
