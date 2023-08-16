/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digit;

/**
 *
 * @author aarti
 */
class num {
    public static void main(String[]args)
    {
         int num = 4573984;
        int count = 0;
        int even = 0;
        int odd = 0;
        while (num > 0) {

            int checknum = num % 10;
            if (checknum % 2 == 0) {
                even++;
            } else {
                odd++;
            }

        }
        System.out.println("Even number are " + even);
        System.out.println("Odd Numbers are " + odd);
    }
    
}
