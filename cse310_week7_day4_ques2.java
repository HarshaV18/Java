import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Solution{
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner obj=new Scanner(System.in);
        String str=obj.nextLine();

        if(str==null||str.matches(".*\\d.*")){
            System.out.println("Invalid input");
            return;
        }

        String[] words=str.split(" ");
        StringBuilder reversedString=new StringBuilder();

        for(String word : words){
            String reversedWord =new StringBuilder(word.toLowerCase()).reverse().toString();
            reversedString.append(reversedWord).append(" ");
        }

        System.out.println(reversedString.toString().trim());
    }
}

