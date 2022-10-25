import java.util.Scanner;
public class SumOfDigit {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter any number to know the sum 0f the digits of that number ");
        int digit=sc.nextInt();

        // to check the number of digit in any number 
        int noofdigit=Math.log10(digit)+1;
        System.out.println("noofdigit");


        // now lets find the sum of the digits of that number

        int temp=digit;
        int lastdigit;
        int sum=0;
        while(temp>0){
            
            lastdigit=temp%10;
            temp/=10;
            sum+=lastdigit;

        }
        System.out.println("the sum of  "+digit+"is"+sum);
    }
    
}
