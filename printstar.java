import java.util.Scanner;

// print the pattern(user input)
public class printstar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a digit");
        int a = sc.nextInt();
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a-i; j++) {
                    System.out.print(" ");
                }
            for (int k = 1;k<=2*i-1;k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

