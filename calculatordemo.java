//write a java program to illustrate clculator class with addition,sub & multi
import java.util.Scanner;
public class calculatordemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1nd numbers");
        int x=sc.nextInt();
        System.out.println("Enter the 2nd numbers");
        int y=sc.nextInt();
        System.out.println("the answer addition is" +add(x,y));
        System.out.println("the answer substraction is" +sub(x,y));
        System.out.println("the answer multipication is" +multi(x,y));}
    public static int add(int x,int y) {
       int n;
       n=x+y;
       return n;}
    public static int sub(int x,int y) {
        int n;
        n=x-y;
        return n;}
    public static int multi(int x,int y){
        int n;
        n=x*y;
        return n;}}
