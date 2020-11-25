import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class problem_one {

      public static void main(String args[]){
      Scanner s = new Scanner(System.in);
      int[] array = new int[6];
      int sum = 0;
      System.out.println("Enter the elements of the array:");
      for (int i=0; i<6; i++)
      {
          array[i] = s.nextInt();
      }
      for( int num : array) {
          sum = sum+num;
      }
      System.out.println("The Sum of the array elements' is:"+sum);
   }
}
