//write a method to check whwther every digit of a given integer is given integer is even return
//true if every digit is odd otherwise false
import java.util.Scanner;
public class evenoddinteger {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n= sc.nextInt();
        System.out.println("check whether every digit of your integer is even or not\n");
        System.out.println(result (n));
    }
    public static boolean result(int n) {
        final int a = 10;
        if (n == 0) {
            return false;
        }
        while (n != 0) {
            if ((n % a) % 2 != 0) {
                return false;
            }
            n /= 10;
        }
        return true;
    }}

