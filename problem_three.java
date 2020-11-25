import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class problem_three {

    /*
     * Complete the getMoneySpent function below.
     */
   public static void main(String[] args) {
       scanner input = new Scanner (System.in);
       int x,y,z;
       x = input.nextInt();
       y = input.nextInt();
       z = input.nextInt();
       
       int[] keyboard = new int[y];
       for (int keyboard_i=0; keyboard_i < y; keyboard_i++)
        keyboard[keyboard_i] = in.nextInt();
   }
   int[] drives = new int[z];
        for (int drives_i=0; drives_i < z; drives_i++){
            drives[drives_i] = in.nextInt();
        }
        
        int ans = -1;
        for (int i=0; i<y; i++)
            {
            for(int j=0;j<z;j++)
                {
                int q = keyboard[i]+drives[j];
                if(q>ans && q<= x)
                    {
                    ans = q;
                }
            }
        }
        
        System.out.println(ans);
}
