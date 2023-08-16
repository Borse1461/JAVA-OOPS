/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reversestring;

/**
 *
 * @author aarti
 */
public class ReverseString {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        //1 Using String concatination operator
        String str="aarti";
        String rev=" ";
        int len=str.length();   //5
        for(int i=len-1;i>=0;i--) //i=4 3 2 1 0 -1
        {
            rev=rev+str.charAt(i); //i t r a a
        }
        System.out.println("Reverse String is "+rev);
        
        //2. Using character array
        String str1="ABCD";
        String rev1="";
        char a[]=str1.toCharArray(); //convert string into multiple characters
        int len1=str1.length();
        for(int j=len1-1;j>=0;j--)
        {
            rev1=rev1+a[j];
        }
        System.out.println("Reverse using array "+rev1);
        
        //3. Using StringBuffer Class
        String str2="HELLO";
        StringBuffer sb=new StringBuffer(str2);
        System.out.println("Reverse string is "+sb.reverse());
        
    }
    
}
