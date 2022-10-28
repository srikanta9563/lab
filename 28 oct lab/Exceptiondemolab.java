/*Write a method called addTwoPositive that takes two int parameters, and if either value is not positive, throw an ArithmeticException ,passing the String
 * " Non-positive integer sent" to the constructor of the Exception. If the values are both positive, then return the sum of them.Under what the circumstances
 * will the finally code blockbe executed in a try/catch/finally segments.
 *
 */
import java.util.Scanner; //importing scanner class
public class Exceptiondemolab {//creating new class
        public int addnum(int a,int b) {//method which takes two parameters as integer
            if(a<0||b<0) {//logic for negative number
                throw new ArithmeticException("m and n is not positive");//user defined exception
            }
            else {
                return a+b;//returning the sum
            }
        }
        public static void main(String[] args) {
            Scanner Scan=new Scanner(System.in);//creating object of scanner class
            Exceptiondemolab a =new Exceptiondemolab();//creating object of ExceptionDemo class
            System.out.println("enter the  values of m and n : ");
            int m=Scan.nextInt();//taking input for m
            int n=Scan.nextInt();//taking input for n
            try {
                System.out.println("the result of product is : "+a.addnum(m, n));// to get the result
            } catch (Exception e) {
                e.printStackTrace();//printing the Exception message
            }
            finally {
                System.out.println("finally block executed");
            }
        }
    }
    class NewException extends Exception{//extending Exception class
    String str;
    public NewException(String str) {
        super("Non-positive integer sent");//passing argument according to the question
        this.str = str;
    }
}

