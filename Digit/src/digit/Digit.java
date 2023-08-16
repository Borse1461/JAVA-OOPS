package digit;

import java.util.Scanner;

class Count {

    //Number of Digits in a Number
    //Number=146678 -> Number of Digits:6
    public void NumberOfDigit() {
        int num = 2347984;
        int cou = 0;
        while (num > 0) {
            num = num / 10;
            cou++;
        }
        System.out.println("Number of Digits are " + cou);
    }

    //Number=145678
    //Even Digit:3 Odd digit:3
    public void EvenOddNum() {
        int num = 1234;
        int count = 0;
        int even = 0;
        int odd = 0;
        while (num > 0) {           //1234 123 12 1

            int checknum = num % 10;    //4 3  2 1
            if (checknum % 2 == 0) {
                even++;                 //2
            } else {
                odd++;                  //2
            }
            num=num/10;                 //123   12  1    0
         }
        System.out.println("Even number are " + even);
        System.out.println("Odd Numbers are " + odd);
    }
    
    //Sum of digits in a number
    // num=1234 sum=10
    public void addOfDigit(){
        int num=1234;
        int sum=0;
        int digit=0;
        while(num>0)
        {
            sum=sum+num%10;         //4  +  3 + 2 + 1
            num=num/10;             //123   12  1   0
        }
     
        System.out.println("Addition of digits in Number "+sum);
    }
    
    public void LargestNum(){
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        System.out.println("Enter third number");
        int c = sc.nextInt();
        if (a > b && a > c) {
            System.out.println("a is greater");
        }
        else if (b > a && b > c) {
                System.out.println("b is largest number");
        } 
        else{
                System.out.println("C is largest number");
        }
        
         /*using ternary operator
        a=10 b=20
        largest=a>b?a:b
        a>b if condition becomes true
        ans is a(lasgest digit)
        of false ans will be b(largest number
        */
       
        /*int largest=a>b?a:b;
        int largest2=c>largest?c:largest;
        */
        int largest=c>(a>b?a:b)?c:(a>b?a:b);
        System.out.println("Largest number is  -> "+largest);
    
    }
}

class Digit {

    public static void main(String[] args) {
        Count c = new Count();
        c.NumberOfDigit();
        c.EvenOddNum();
        c.addOfDigit();
        c.LargestNum();
    }
}
