
package generaterandom_num_str;

import java.util.Random;

public class GenerateRandom_num_str {
    public static void main(String[] args) {
    //Approach1 - Random Class
        Random rand=new Random();
        int rand_int=rand.nextInt(1000);
        System.out.println(rand_int);
        
        double rand_dbl=rand.nextDouble();
        System.out.println(rand_dbl);
        
    //Approach2 - Math class
        System.out.println(Math.random());      //by defult float type number generate
        
    /*Approach3 - Apache common-lang API
    link http://commons.apache.org/
        String randNum=RandomStringUtils.randomNumberic(5);
        System.out.println(randNum);
        
        String randStr=RandomStringUtils.randomAlphabetic(5);       It will generate alphabets
        System.out.println(randStr);
    */
    }
    
}
