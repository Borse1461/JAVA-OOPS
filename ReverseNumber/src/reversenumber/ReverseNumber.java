/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reversenumber;

import java.util.Scanner;

/**
 *
 * @author aarti
 */
public class ReverseNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to reverse ");
        int num=sc.nextInt();       //1234  4321
        
        //1 using algorithm
        int rev=0;
        while(num!=0)
        {
            rev=rev*10+num%10;          //0*10+1234/10=4  last digit return
            num=num/10;                 //1234/10=123     last digit will removek
        }
        System.out.println("1 Reverse Number is "+rev);
        
        //2 Using String buffer class method
        int num2=sc.nextInt();
        StringBuffer sb=new StringBuffer(String.valueOf(num2));
        StringBuffer revs=sb.reverse();
        System.out.println("2 Reverse Number is "+revs);

        
        
        //3  Using StringBuilder class
        String num3=sc.nextLine();
        StringBuilder sb1=new StringBuilder();
        sb1.append(num3);
        StringBuilder revers=sb1.reverse();
        System.out.println(" 3 Reverse Number is : "+revers);
        
    }
    
}
