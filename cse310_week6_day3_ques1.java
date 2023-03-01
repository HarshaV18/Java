import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Student {
private String name;

          public Student(String name){
                if(name.matches("[a-zA-Z]+")){
                 this.name=name;
                }
                 else{
                this.name="Unknown";
                     }
          }

          public String get(){
             return name;
}

          public static void main(String[] args) {
           Scanner obj=new Scanner(System.in);
          String name=obj.nextLine().trim();
          Student a=new Student(name);
          System.out.println(a.get());
          String other=obj.nextLine().trim();
          Student b=new Student(other);
          System.out.println(b.get());
          obj.close();
}
}
