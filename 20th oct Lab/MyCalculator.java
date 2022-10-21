//Create a class MyCalculator which consists of a single method long power(int, int).
// This method takes two integers, n and p, as parameters and finds n^p . If either n or
// p is negative, then the method must throw an exception which says "n or p should
//  not be negative.". Also, if both n and p are zero, then the method must throw an
//  exception which says "n and p should not be zero."
import java.util.Scanner;
class MyCalculator {
    public int power(int n, int p) throws Exception { //method may have exception

        if (n < 0 || p < 0) { //condition checking
            throw new Exception("n or p should not be negative.");
        } else if (n == 0 && p == 0) { //condition checking
            throw new Exception("n and p should not be zero.");
        } else {
            return (int) Math.pow(n, p); //logic n^p
        }}}
class ABC {
    public static final MyCalculator my_calculator = new MyCalculator(); //main method
    public static final Scanner in = new Scanner(System.in); //object of scanner class
    public static void main(String[] args) {
        System.out.println("Enter the input - ");
        while(in.hasNextInt())
        {
            int n = in .nextInt();
            int p = in .nextInt();
            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e); //printing exception message
            }
        }
    }}
