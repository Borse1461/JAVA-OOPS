/*
1)Number should be greater than 1
2)Number have only 2 factor which are 1 and number itself
*/
package primenum;

import java.util.Scanner;

class PrimeNum{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number to check prime or not ");
        int num=sc.nextInt();
        int count=0;
        if(num>1){
            for(int i=1;i<=num;i++){
                if(num%i==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println("Number is prime");
            }
            else{
                System.out.println("Number is not prime");
            }
            
        }
        else{
            System.out.println("Number is not prime");
        }
    }
}