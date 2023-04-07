import java.io.*;
import java.util.*;



public class Solution 
{
    static boolean isNumber(String s)
    {
        for(int x=0;x<s.length();x++)
        {
            if(s.charAt(x)-'0'>=0&&s.charAt(x)-'9'<=0){}
            else
                return false;
        }
        return true;
    }
    public static void main(String[] args) 
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    {
        Scanner obj=new Scanner(System.in);
        int y=obj.nextInt(),c=0;
        String s[]=new String[y];
        for(int x=0;x<y;x++)
        {
            s[x]=obj.next();
            if(isNumber(s[x]))
                c++;
        }
        System.out.println(c);
        System.out.println(y-c);
    }
}
