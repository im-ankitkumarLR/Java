import java.util.Scanner;
import java.util.*;
public class Myclass {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        String s =scan.nextLine();
         double d = scan.nextDouble();
         scan.close();
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}