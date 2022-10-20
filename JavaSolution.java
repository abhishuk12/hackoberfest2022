
import java.util.*;
import java.io.*;
public class JavaSolution
{


  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
      System.out.println ("enter your number ");
    int num = sc.nextInt ();	//number is inserted
    String text = String.valueOf (num);	//number is converted to string 

      try
    {
      Integer.parseInt (text);
      System.out.println ("Good Work");
    } catch (NumberFormatException e)
    {
      System.out.println ("Wrong Answer");
    }
thsifr a


  }

}

// this is acosaifh
