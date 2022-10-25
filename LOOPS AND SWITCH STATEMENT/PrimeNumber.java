import java.util.Scanner;
public class PrimeNumber {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    for(int i=2;i<num;i++){
        if(num%i==0){
            break;
        }
        System.out.println("its a prime number")
        System.out.println(num);
        
    }
    
}    
}
