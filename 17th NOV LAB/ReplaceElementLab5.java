//Write a java program to replace an element in a linked list
import java.util.LinkedList;
public class ReplaceElementLab5 { //main class
        public static void main(String[] args) { //main method
            //creating linkedlist object
            LinkedList<String> l1 = new LinkedList<>();
            //adding elements
            l1.add("Srikanta");
            l1.add("sourav");
            l1.add("Arko");
            l1.add("Subhashis");

            System.out.println("Traversing before replacing element");
            System.out.println(l1);

            l1.set(3, "Subhadip"); 	//replacing element arko with subhashis
            System.out.println("Traversing after replacing element");
            System.out.println(l1);

        }
    }

