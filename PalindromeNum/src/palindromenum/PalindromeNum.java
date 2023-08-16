/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromenum;

import java.util.Scanner;

/**
 *
 * @author aarti
 */
class Palindrom{
    public void checkNumPalindrome()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number ");
        int num=sc.nextInt();
        
        int org_num=num;
        int rev=0;
        while(num!=0)
        {
            rev=rev*10+num%10;
            num=num/10;
        }
        if(org_num==rev)
        {
            System.out.println("Number is palindrom");
        }
        else{
            System.out.println("Number is not palindrome");
        }
    }
    public void checkStringPalindrome(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string ");
        String str=sc.next();
        String org_str=str;
        String rev="";
        int len=str.length();
        for(int i=len-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
            
        }
        if(rev.equals(org_str))
        {
            System.out.println("String is palindrom");
        }
        else{
            System.out.println("String is not palindrome");
        }
    }
}
public class PalindromeNum {

    public static void main(String[] args) {
       Palindrom p=new Palindrom();
       p.checkStringPalindrome();
       p.checkNumPalindrome();
        
    }
    
}
