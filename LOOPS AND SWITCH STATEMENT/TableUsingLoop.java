
import java.util.Scanner;

public class TableUsingLoop {
    public static void main(String args[]){
        System.out.println("table of any number enter by user");
        Scanner sc=new Scanner(System.in);
        sc.close();
        int num=sc.nextInt();
        for(int i=1;i<=10;i++ ){
            System.out.println(num*i );
        }

    }


    
}
