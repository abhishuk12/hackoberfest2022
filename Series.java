// in this we have to find the sum of the series 1+1/2+1/3+1/4+1/5 ........ upto n enter by user 
import java.util.Scanner;
public class Series {
    public public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int range=sc.nextInt();
        int result=0;
        for(float i=1; i<=range;i++){
            result+=1/i;
        }
     System.out.println(result);   
    }
    
}
