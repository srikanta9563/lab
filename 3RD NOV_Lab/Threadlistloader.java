//Develop threads using Runnable interface.
import java.util.ArrayList;
public class Threadlistloader implements Runnable{

    ArrayList<Integer> numbers = new ArrayList<Integer>(10000000);	//instance member

    public void run() {
        //loop
        for (int i = 0; i <= 10000000; i++)
        {
            numbers.add(i);
            System.out.println(numbers.get(i));
        }
        //total time
        System.out.println("total time:"+System.currentTimeMillis ());
    }

    public static void main(String[] args) {
        Runnable r= new Threadlistloader();	//instantiating the object

        Thread t=new Thread(r);	//instantiating thread using runnable
        t.start();				//activating the thread

    }

}