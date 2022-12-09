import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionProblem {
    List<Integer> A1 = new ArrayList<>();	//creating A1 arrayList to store even numbers
    List<Integer> A2 = new ArrayList<>();	//creating A2 arrayList to store 2*even numbers


    public void storeEvenNumbers(int n){

        for(int i=2; i<=n; i=i+2) {   //logic
            A1.add(i);
        }
        System.out.println("traversing A1 array list: ");
        A1.forEach(System.out::println); 	//internal iteration
    }


    public void printEvenNumbers(){

        A2=A1.stream().map(i->i*2).collect(Collectors.toList());	//using stream,here map method is modifing and collect is converting my stream to list

        System.out.println("traversing A2 array list: ");
        A2.forEach(System.out::println); 							//internal iteration
    }


    public int retriveEvenNumbers(int n){

        for (Integer i : A1) {    //logic
            A1.contains(n);
            return 1;
        }
        return 0;
    }
    public static void main(String[] args) {
     CollectionProblem obj = new CollectionProblem(); 						//creating object
        obj.storeEvenNumbers(10);									//invoking method
        obj.printEvenNumbers();										//invoking method

        if(obj.retriveEvenNumbers(4)==1) {							//invoking method and passing 4 as arument to search in A1
            System.out.println("4 is present");
        }else {
            System.out.println("element is not present");
        }
    }
}
