// can you creat oject of a class from inside the scope of another class constrator
public class test { //creating a class

}
 class question3{ //creating a different class to call the previous class
    question3(){
        test t=new test();// creat the object of 1st class

    }

    public static void main(String[] args) {
        question3 obj= new question3();// creat the object of 2nd class
        System.out.println(" YES THIS IS POSSIBLE:");
    }
}