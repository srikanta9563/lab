//Develop threads using Runnable interface.
import java.util.ArrayList;
public class Threadlistloader {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> numbers = new ArrayList<>();

        double startTime = 0, endTime = 0;
        startTime = System.currentTimeMillis(); //strat time
        for (int i = 0; i <= 10000000; i++) {
            numbers.add(i);
        }
        endTime = System.currentTimeMillis(); ///end time
        System.out.println("Total Required Time for Storing: " + (endTime - startTime));

        for (int i = 0; i < 10000000; i++) { //loop logic
            numbers.add(i);
        }
        Thread t1 = new Thread(new Runnable() { //create thread 1
            public void run() {
                for (int i = 0; i <= 5000000; i++) {
                    System.out.println(numbers.get(i));
                }
            }
        });
        Thread t2 = new Thread(new Runnable() { //create thread 2
            public void run() {
                for (int i = 5000000; i <= 10000000; i++) {
                    System.out.println(numbers.get(i));
                }
            }
        });
        startTime = 0; endTime = 0;
        startTime = System.currentTimeMillis();
        t1.start();// activating the thread 1
        t2.start();//activating the thread 2
        t1.join();
        t2.join();
        startTime = System.currentTimeMillis();
        System.out.println("Total Required time using thread: " + (startTime - endTime));
}
}