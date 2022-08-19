// 2. write a java program  to convert minutes into a numbers  of years and days
import java.util.Scanner;
public class programtwo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the minutes:");
        int a = sc.nextInt();
        int day= a/1440;
        int year = day/365;
        int remainder = day%365;
        System.out.println("The output is "+year+" years "+remainder+" days ");



    }
}
