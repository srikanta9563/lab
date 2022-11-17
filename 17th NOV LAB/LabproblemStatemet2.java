//Problem statement 1
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class LabproblemStatemet2 {
    List<Integer> A1 = new ArrayList<>();	//creating A1 arrayList to store even numbers
        List<Integer> A2 = new ArrayList<>();	//creating A2 arrayList to store 2*even numbers
    //statement 1:
        public void storeEvenNumbers(int n){
            //logic
            for(int i=2; i<=n; i=i+2) {
                A1.add(i);
            }
            System.out.println("traversing A1 array list: ");
            A1.forEach(System.out::println); }	//internal iteration
    // Statement 2:
        void printEvenNumbers() {
            for(int i:A1) {
                A2.add(i*2);
            }
            for(int i:A2) {
                System.out.println(i);
            }
        }
        // //statement 3 :
        public int retriveEvenNumbers(int n){
            //logic
            for (Integer i : A1) {
                A1.contains(n);
                return 1;}
            return 0;
        }
        public static void main(String[] args) { 						//main method
            LabproblemStatemet2 obj = new LabproblemStatemet2(); 						//creating object
            System.out.println( "Executing storeEvenNumbers method: ");
            obj.storeEvenNumbers(12);                              //invoking method
            System.out.println(" Executing print EvenNumbers -");
            obj.printEvenNumbers();										//invoking method

            if(obj.retriveEvenNumbers(4)==1) {							//invoking method and passing 4 as arument to search in A1
                System.out.println("4 is present");
            }else {
                System.out.println("element is not present");
            }
        }}

