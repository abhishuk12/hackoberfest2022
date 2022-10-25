import java.util.Scanner;
public class MatrixAddition {
    public static void main(System.in) {
        Scanner sc=sc.nextInt();
        System.out.println("enter the number of row ");
        int row=sc.nextInt();
        System.out.println("enter the number of column ");
        int column=sc.nextInt();
        int a[][]=new int[row][column]; //the first matrix is created 
        int b[][]=new int[row][column]; // the second matrix is created 
//  from here the user is entering the value in matrix a 
        for(int i=0; i<row;i++){
            for (int j=0; j<column;j++){
                a[row][column]=sc.nextInt();
            }
        }
        //from here the user is entering the value in the second matrix 
        for(int i=0; i<row;i++){
            for (int j=0; j<column;j++){
                b[row][column]=sc.nextInt();
            }
        }
        //from here the addition of matrixx take place 
        int c[][]=new int [row][column];
        for(int i=0; i<row;i++){
            for (int j=0; j<column;j++){
                c[row][column]=a[row][column]+b[row][column];
            }
        }
        //now we are priting the new matrix 
        for(int i=0; i<row;i++){
            for (int j=0; j<column;j++){
           System.out.printl(c[i][j]+ " ");
            }

        }
        System.out.println();
    }
    
}
