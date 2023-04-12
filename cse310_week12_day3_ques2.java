import java.io.*;
import java.util.*;


public class Solution {
    public static void main(String[] args) {
         /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();

        if(n<=1){
            System.out.println("Invalid");
            return;
        }

        String[] s = new String[n];
        obj.nextLine(); 
        for(int i = 0; i < n; i++){
            s[i] = obj.nextLine();
        }

        for (String str : s) {
            if (str.endsWith("g")) {
                System.out.println(str);
            }
        }
    }
}
