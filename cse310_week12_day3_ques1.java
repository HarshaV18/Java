import java.io.*;
import java.util.*;



public class Solutin {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner obj=new Scanner(System.in);
        String[] medicines = new String[3];
        
        medicines[0] = obj.nextLine();
        medicines[1] = obj.nextLine();
        medicines[2] = obj.nextLine();
        
        Arrays.sort(medicines, String::compareToIgnoreCase);
    
        for (String medicine : medicines) {
            System.out.println(medicine);
        }
    }
}
