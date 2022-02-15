import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution3 {
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     System.out.println("Enter the Number");
      int N=scan.nextInt();
     int result;
     for(int i=1;i<=10;i++){
         
         result=N*i;
         System.out.println(N+ " x "+i+" = "+result);
         
     }
     
     
     
    }
}
