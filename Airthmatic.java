public class Airthmatic {
    int a, b;
    int  add(int a,int b){
        return (a+b);

    }

}
class adder extends Airthmatic{
    public static void main(String[] args) {
        adder a=new adder();
        System.out.println("the result of sum is : "+a.add(4,5));
    }
}
