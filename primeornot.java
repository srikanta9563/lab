// WAP to check prime number
import java.util.Scanner;

class primeornumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean p = true;
        System.out.println("Enter a number to checak");
        int a = sc.nextInt();
        for(int i=2;i<a;i++){
            if(a%i==0){
               p =false;
            }
        }
        if(p==false){
            System.out.println(a+" is not a prime number");
        }
        else{
            System.out.println(a+" is a prime number");
        }

        }
    }

