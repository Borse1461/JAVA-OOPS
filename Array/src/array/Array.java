package array;

class SumOfArrayElements{
    SumOfArrayElements(){
        int a[]={4,5,2,52,4,2};
        int sum=0;
        
        for(int i=0; i<=a.length-1; i++){
            sum=sum+a[i];
        }
        System.out.println(sum);
    }
    //second approach
    public void SumOfArrayElement2(){
        int a[]={34,45,65,32,5,2};
        int sum=0;
        for(int value:a){       //first value will gate 1st index of vlaue of array a then second loop take 2 value so on
            sum=sum+value;
        }
        System.out.println(sum);
    }
}

class PrintOddEvenFromArray{
    PrintOddEvenFromArray(){
        int a[]={23,43,5,2,46,32,53,53,6};
        //extracting even numbers
        System.out.println("Even Numbers in Array");
        for(int i=0;i<a.length-1;i++){
            if(a[i]%2==0){
                System.out.println(a[i]);
            }
        }
        System.out.println("Odd Number in Array ");
        for(int i=1;i<=a.length-1;i++){
            if(!(a[i]%2==0)){
            } else {
                System.out.println(a[i]);
            }
        
        }
    }
    //Second Approach
    public void PrintEvenOddFromArray2(){ 
        int a[]={23,43,5,2,46,32,53,53,6};
        for(int value:a){
            if(value%2==0){
                System.out.println(value);
            }
            else{
                System.out.println(value);
            }
        }
    }

public class Array {

    public static void main(String[] args) {
        SumOfArrayElements s=new SumOfArrayElements();
        s.SumOfArrayElement_2();
    }
    
}
