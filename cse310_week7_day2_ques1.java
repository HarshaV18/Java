import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner obj=new Scanner(System.in);
        String pw=obj.nextLine();
        if(pw.length()<=1){
            System.out.println("Wrong Input");
            return;
        }
        String pwl=pw.replace(" ","$");
        System.out.println(pwl.toLowerCase());
    }
}
