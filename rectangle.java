/*2 you will make a class ‘Rectangle’ and declare the variable length and breadth as private.
One Constructor will be used for initializing the value of variables. When an object is created,
the constructor will be called and the default value of the instance variables will be assigned.
Now create another new class ‘RectangleTest’ & create an object of class Rectangle and
assign values of the parameter used in constructor. Calculate area of the rectangle and print
it on the console. Let’s update the new value of variable. And then read the updated value.*/




import java.util.Scanner;
public class rectangle {
    private int length = 0;
    private int breadth = 0;
    rectangle(int a, int b) {
        length = a;
        breadth = b;

    }int calculatearea() {
        int area = length * breadth;
        return area;
    }}class rectangleTest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        rectangle obj1 = new rectangle(8, 7);
        int oldArea = obj1.calculatearea();
        System.out.println("The old area is " + oldArea);
        System.out.println("Enter the new length");
        int c = sc.nextInt();
        System.out.println("Enter the new breadth");
        int d = sc.nextInt();
        rectangle obj = new rectangle(c, d);
        int newArea = obj.calculatearea();
        System.out.println("The old area is " + newArea);
    }}






