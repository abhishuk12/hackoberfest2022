import java.util.Scanner;
public class AverageMarksOfStudent {
  public static void main(String [] args) {
      Scanner sc=new Scanner(System.in);
    System.out.println("enter the number of studnet ");
    int n=sc.nextInt();

      int marks[]=new int[n]; // array is created here 
          System.out.printl("enter the marks now ");
      for(int i=0; i<marks.length;i++){
          marks[i]=sc.nextInt();
      }
      int average=0;
      for(int j=0;j<marks.length;j++){
          average+=i;
      }
      
      average/=n;


  }  
    
}
