import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class problem_two {

    public static void main(String[]args) {
        int i,j,row;
        
        Scanner input = new Scanner(System.in);
        row = input.nextInt();
        
        for (i=0; i<row; i++){
            for (j=row-1; j>i; j--){
                System.out.print (" ");
            }
            for (int y=0; y<=i; y++)
                System.out.print("#");
            System.out.println();
        } 
    }
}
