import java.util.Scanner;
public class Palindrome {
    public static void main(String [] args ) {
        Scanner sc=new Scanner(System.in)
        int number=sc.netInt();
        int temp=number;
        int lastDigit;
        int reversedNumber=0;
        while(temp>0){
            lastDigit=temp%10;
            reversedNumber=reversedNumber*10+lastDigit;
            temp=temp/10;
        }
        
        if(reversedNumber==number){
            System.out.println("it's a palindrome number:")
        }
        else{
            System.out.println("it's not palindrome ")
        }

        
    }
    
}
