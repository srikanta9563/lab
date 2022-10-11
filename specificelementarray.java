import java.util.Scanner;

public class specificelementarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++)
        {
            a[i]= sc.nextInt();
        }
        System.out.println("enter the remove element");
        int b= sc.nextInt();
        for (int i=0;i<n;i++){
         if(a[i]==b){
             for ( int j=i;j<n-1;j++) {
                 a[j] = a[j + 1];
             }
             }
        }
        System.out.println("new array element");
         for (int i =0;i<n-1;i++){
             System.out.println(a[i]);

        }
    }}


