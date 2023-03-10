import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Solution{
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner obj=new Scanner(System.in);

        String str=obj.nextLine().trim();
        int n=obj.nextInt();

        if(n<1||n>10){
            System.out.println("Invalid Input");
        } 
        else{
            
            String[] words=str.split("\\s+");
            int count=0;
            for(String word : words){
                if (word.length()==n){
                    count++;
                }
            }

            System.out.println(count);
        }

    }
}




