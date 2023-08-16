package swap;
public class Swap{
    public static void main(String[]args){
        int a=10,b=20;
        System.out.println("Before swapping vlaues are.. "+a+" "+b);
        //Logic 1 - Third variable
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("Logic 1...  : "+a+" "+b);
        
        //Logic 2 - use + and - operator , without using third variable
        a=a+b; //10+30
        b=a-b; //30-20
        a=a-b; //30-10
        System.out.println("Logic 2...  : "+a+" "+b);
        
        //Logic 3 - use * and / without using 3rd variable
        //here a and b value should not be 0
        a=a*b;  //10*20=200
        b=a/b;  //200/20=10
        a=a/b;  //200/10=20
        System.out.println("Logic 3...  : "+a+" "+b);
        
        //Logic 4 - bitwise XOR operator(^)
        a=a^b; //
        b=a^b;
        a=a^b;
        System.out.println("Logic 4...  : "+a+" "+b);
        
        //Logic 5 - Single statement to swap 2 numbers
        b=a+b-(a=b); //a=10 b=20  solve from right
                        //1st a=b means a=20 then  //a=20
                        //a+bm=30
                        //30-20=10                 //b=10
        System.out.println("Logic 5...  : "+a+" "+b);


    }
}