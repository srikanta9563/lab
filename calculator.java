//write a java program to print the sum,multiply,substract,divideand remainder oftwo numers.

public class calculator {
    public static void main(String[] args) {
        int a = 125;
        int b = 24;
        int c = a+b;
        int d = a-b;
        int e = a/b;
        int f = a*b;
        int r = a%b;

        System.out.println("The two numbers are:"+a+","+b);
        System.out.println("the sum is "+ c);
        System.out.println("the subtraction is "+ d);
        System.out.println("the divison is "+ e);
        System.out.println("the multiplicaton is "+ f);
        System.out.println("the remainder is "+ r);
    }
}
