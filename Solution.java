import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
              Scanner sc=new Scanner(System.in);
              int T=sc.nextInt();
              while(T-->0){
                  int ele=sc.nextInt();

                  boolean result = true;

                  if ((ele!=2 && ele%2==0) || ele==1) result = false;
                  {
                    for (int i = 2; i <= Math.sqrt(ele); i++) {
                          if (ele % i == 0) result = false;
                     }
                  }
                   if (result) {System.out.println("Prime");}
                   else {System.out.println("Not prime");}
              }
       }
}