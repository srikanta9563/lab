//take two numbers x and y throw the exception if the numbers are negative else print the product x and y
import java.util.Scanner; //importing Scanner class{
public class Exceptionproblem {
    public int value(int x,int y) throws Exception{
            if (  x==0 && y==0)//condition checking according to question
                throw new Exception("a and b should not be zero ");//throwing user define exception
            else  if(x < 0 || y < 0)//condition checking according to question
                throw new Exception("a or b should not be zero ");//throwing user define exception

            else
                return x+y;//returning the result of product
        }
        public static void main(String[] args) {//main method
            Scanner scan=new Scanner(System.in);//object of Scanner class
            Exceptionproblem a=new Exceptionproblem();//creating object of ExceptionNew class
            System.out.println("enter the  values of x and y : ");
            int x=scan.nextInt();//taking input for a
            int y=scan.nextInt();//taking input for b
            try {
                System.out.println("the result of product is : "+a.value(x, y));// to get the result
            } catch (Exception e) {
                System.out.println(e);//printing the Exception message
            }
	}
}
