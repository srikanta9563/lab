//write a java program to print sum of odd numbers upto to n
import java.util.Scanner;

import java.util.Scanner;
public class oddnumbersum {



    public static void main(String args[]) {
        int N, i, sum = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        N = in.nextInt();

        for(i = 0; i <= N; i++){
            if((i%2) == 1){
                sum += i;
            }
        }

        System.out.print("Sum of all odd numbers between 0 to "
                + N + " = " + sum);
    }
}
