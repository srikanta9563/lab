
// WAP to find of a factorial number
import java.util.Scanner;

 class Factorial {
    public static void main(String[] args) {
        int number = 1;
        int A = 1;
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the number: ");
        int num = sc.nextInt();


        while (A <= num) {
            number = number* A;
            A++;
        }
        System.out.println("Factorial of " + num + " is: " + number);


    }}