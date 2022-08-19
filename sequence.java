//Write a java program to break a integar  a sequence of individual digits.

import java.util.Scanner;
public class sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter six digit: ");
        int a = sc.nextInt();

        int d1= a/100000 % 10;
        int d2= a/10000 % 10;
        int d3= a/1000 % 10;
        int d4= a/100 % 10;
        int d5= a/10 % 10;
        int d6= a % 10;

        System.out.println(d1+" "+d2+" "+d3+" "+d4+" "+d5+" "+d6);
    }
}
