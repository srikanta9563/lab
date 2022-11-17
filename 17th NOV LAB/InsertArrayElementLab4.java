//write a java program to insert specific element at the front of a linked list
import java.util.LinkedList;
public class InsertArrayElementLab4 { //main class
        public static void main(String[] args) {	//main method
            //creating linkedlist object
            LinkedList<Integer> l1 = new LinkedList<>();
            //adding elements
            l1.add(10);
            l1.add(20);
            l1.add(30);
            l1.add(40);
            l1.add(50);
            l1.add(60);

            System.out.println("Traversing before adding element");
            System.out.println(l1);

            l1.addFirst(1); 	//adding element at the first position
            System.out.println("Traversing after adding element");
            System.out.println(l1);

        }
    }

