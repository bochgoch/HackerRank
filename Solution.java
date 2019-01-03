import java.util.Scanner;
import java.util.Arrays;

public class Solution {

    static boolean isAnagram(String a, String b) {
        String aA[] = a.split("");
        String bA[] = b.split("");
     
        Arrays.sort(aA);
        Arrays.sort(bA);
        
        if (Arrays.toString(aA).compareTo(Arrays.toString(bA))==0) return true;
        return false;

    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}