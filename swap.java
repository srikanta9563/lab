//swaping two variables refers t muttually exchangeing the values of the variables.


public class swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("The numbers a and b are "+a+","+b);
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("The numbers after swapping a and b are "+a+","+b);
    }
}
