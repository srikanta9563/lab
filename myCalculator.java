package com.company;
import java.util.*;
public class myCalculator {
     int divisior_sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }
}
 class Programlab1{
    public static void main(String[] args) {
        myCalculator obj = new myCalculator();
        Scanner sc = new Scanner(System.in);
        int c =0;
        System.out.println("Enter the number");
        int a = sc.nextInt();
        if(a<=1000) {
            c = obj.divisior_sum(a);
            System.out.println("The divisior sum is " + c);
        }else{
            System.out.println("ERROR!!enter the number below 1000!");
        }}}




