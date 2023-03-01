import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

             public class Solution{
           public static void main(String[] args) {
            Scanner obj=new Scanner(System.in);
            int[] height= new int[10];
           for(int i=0;i<10;i++){
           height[i]=obj.nextInt();
}
obj.close();

            for(int i=0;i<9;i++){
             for (int j=0;j<9-i;j++){
          if(height[j]>height[j+1]){
            int temp=height[j];
          height[j]=height[j+1];
            height[j+1]=temp;
}
}
}

for (int i=0;i<10;i++){
System.out.print(height[i]+" ");
}
}
}
