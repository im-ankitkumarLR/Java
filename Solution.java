import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.Scanner;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args){
        Scanner myobj= new Scanner(System.in);
        // System.out.println("Enter a Number");
        int a =myobj.nextInt();
        if (a%2!=0) {
            System.out.println("Weird");
        }else if (a%2==0 && (a>=2 && a<=5)){
            System.out.println("Not Weird");
            
            
        }else if(a%2==0 && (a>=6 && a<=20)){

            System.out.println("Weird");
        }else if(a%2==0 && a>20){
            System.out.println("Not Weird");
        }
    }
}