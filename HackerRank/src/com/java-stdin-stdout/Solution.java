import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inumber = scan.nextInt();
        double dnumber = scan.nextDouble();
        scan.nextLine(); 
        String string = scan.nextLine();
        // Write your code here.
        System.out.println("String: " + string);
        System.out.println("Double: " + dnumber);
        System.out.println("Int: " + inumber);
    }
}