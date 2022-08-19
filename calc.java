// 3. Write a java program that accept two integars from users and then that prints the sum,
// the differnce ,the product ,the average ,the distance, the maximum,and the minimum.
import java.util.Scanner;
public class calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        int sum  = a+b;
        int diff  = a-b;
        int product  = a*b;
        int average  = (a+b)/2;
        int distance = a-b;
        int max = Math.max(a,b);
        int min = Math.min(a,b);
        System.out.println("The sum of the two numbers: "+sum);
        System.out.println("The difference of the two numbers: "+diff);
        System.out.println("The product of the two numbers: "+product);
        System.out.println("The average of the two numbers: "+average);
        System.out.println("The distance of the two numbers: "+distance);
        System.out.println("The max of the two numbers: "+max);
        System.out.println("The min of the two numbers: "+min);


    }
}
