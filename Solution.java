import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String[] users = new String[N];
        int c = 0;
        for (int i = 0; i < N; i++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");
            String firstName = firstNameEmailID[0];
            String emailID = firstNameEmailID[1];            
            String myRegExString = "^(.+)@gmail(.+)$";
            Pattern p = Pattern.compile(myRegExString);
            Matcher m = p.matcher(emailID);
            if( m.find() ) {
                users[c] = firstName;
                c++;                    
            }
        }
        
        //bubble sort to sort without 'Array' imported
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < c - 1; j++) {
                if (users[j].compareTo(users[j+1]) > 0) {
                    String tmp = users[j];
                    users[j] = users[j + 1];
                    users[j + 1] = tmp;
                }
            }
        }        
        for (int i = 0; i < c; i++) {
            System.out.println( users[i] );
        }        
        scanner.close();
    }
}
