

import java.util.Scanner;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        if (s.length() <= 5) {
            System.out.println("Invalid Input");
        } else {
            TreeMap<Character, Integer> tm = new TreeMap<>();
            for (char c : s.toCharArray()) {
                tm.put(c, tm.getOrDefault(c, 0) + 1);
            }
            for (char k : tm.keySet()) {
                System.out.print(k + "" + tm.get(k));
            }
            System.out.println();
        }
    }
}
