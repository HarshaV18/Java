import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner obj = new Scanner(System.in);
        String str1 = obj.next();
        String str2 = obj.next();
        char ch1[] =str1.toCharArray();
        char ch2[] = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        boolean ana = true;
        if(ch1.length==ch2.length && ch1.length>2){
            for(int i=0;i<ch1.length;i++){
                if(ch1[i]!=ch2[i]){
                    ana = false;
                    break;
                }
            }
            if(ana==true){
                System.out.println("ANAGRAM");
            }
            else
            System.out.println("NOT ANAGRAM");
        }
        else{
            System.out.print("Invalid Input");
        }
    }
}
