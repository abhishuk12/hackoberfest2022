import java.util.Scanner;
public class MarksToCgpa {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your marks in maths ")
        float mark1=sc.nextInt();
        System.out.println("enter your marks in physics ")
        float mark2=sc.nextInt();
        System.out.println("enter your marks in chemistry  ")
        float mark3=sc.nextInt();
        float percantage;
        percantage=(mark1+mark2+mark3)/300*100;
        float cgpa;
        cgpa=percantage/9.4;
        System.out.println("the cgpa of the student is "+cgpa);
    }
}
