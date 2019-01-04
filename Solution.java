import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        if (s.length()>0) 
        {
            String[] sS = s.split("[ !,?._'@]+");
            System.out.println(sS.length);
            for (int i = 0; i < sS.length; i++) {  
                System.out.println(sS[i]);
            }   
        }
        else System.out.println("0");
        scan.close();
    }
}


