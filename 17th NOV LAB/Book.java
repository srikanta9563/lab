import java.util.ArrayList;
import java.util.Scanner;
public class Book {
    //encapsulating all data members
    private String bookID, title, author, category;
    private float price;

    public Book(String bookID, String title, String author, String category, float price)  {//parameterized constructor

        //validations
        try {
            //conditon for bookID
            if((bookID.startsWith("B") && (bookID.length()==4))) {	//condition
                this.bookID=bookID;	//if condition meets
            }
			else {
                throw new InvalidBookException("book id should be start with 'B' and lenght of 4");		//throws exception
            }


            //conditon for category
            if((category.equalsIgnoreCase("Science")) || (category.equalsIgnoreCase("Fiction")) || (category.equalsIgnoreCase("Technology")) || (category.equalsIgnoreCase("Others"))) {	//conditon
                this.category=category;	//if condition meets
            }
            else {
                throw new InvalidBookException("category should be Science,Fiction,Technology and Others");	//throws exception
            }

            //conditon for price
            if(price>0) {	//conditon
                this.price=price; //if condition meets
            }
            else {
                throw new InvalidBookException("negative price can not be accepted");				//throws exception
            }
            this.title=title;
            this.author=author;
        }
        catch(Exception e) {	//exception handling
            System.out.println(e);
        }
    }

    //getters for all private data members
    public String getBookID() {
        return bookID;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getCategory() {
        return category;
    }

    public float getPrice() {
        return price;
    }

    @Override
    public String toString() {	//for printing all details of Book objects
        String s = "Book [bookID='" + bookID + "', title='" + title + "', author='" + author + "', category='" + category + "', price='" + price + "']";


        return s;
    }}
//creating custom exception clas
    class InvalidBookException extends Exception {
      //overloading InvalidBookException class
        public InvalidBookException(String s) {    //parameterized constructor
            super(s);    //passing 's' argument to Exception super class
        }
    }
 class BookStore {	//main class
    ArrayList<Book> bookList = new ArrayList<>(); 			//creating arrayList object to store book objects

    //operation #1
    public void addBook(Book b) {					//passing book object as argument
        bookList.add(b);					//adding new book object to bookList Collection
    }

    //operation #2
    public void xyz(String title) {			//passing title string as argument to search
        for (Book b : bookList) {
            if(title.contains(b.getTitle())) {		//condition
                System.out.println(b);
                break;
            }else {
                System.out.println("not found");
                break;
            }}}

   // operation #3
     public void setAuthor(String author) {			//passing author string as argument to search
       for (Book b : bookList) {
           if(author.contains(b.getAuthor())) {		//condition
               System.out.println(b);
                break;
            }else {
               System.out.println("not found");
                break;
            }
       }
   }

    //operation #4
    public void displayAll() {					//displayAll method with traverse and print all the elements of bookList collection
        //traversing
        for(Book b : bookList) {				//enhanced foreach loop
            System.out.println(b);
        }
    }
}
 class BookUtil {
    public static void main(String[] args){									//main method
        BookStore obj = new BookStore();								//instantiating BookStore object
        Scanner s  = new Scanner(System.in);								//instantiating scanner object



        for(int i=1; i<=3; i++) {									//running for loop three times to add 3 book instances
            //taking inputs from user

            System.out.println("For book-"+i);
            System.out.println("\n Enter bookID:");
            Scanner a = new Scanner(System.in);								//instantiating scanner object
            String bookID = a.nextLine();									//taking input for bookID

            System.out.println("Enter title:");
            Scanner b  = new Scanner(System.in);								//instantiating scanner object
            String title = b.nextLine();									//taking input for title

            System.out.println("Enter author:");
            Scanner c  = new Scanner(System.in);								//instantiating scanner object
            String author = c.nextLine();									//taking input for author

            System.out.println("Enter category:");
            Scanner d  = new Scanner(System.in);								//instantiating scanner object
            String category = d.nextLine();									//taking input for category

            System.out.println("Enter price:");
            Scanner scanPrice  = new Scanner(System.in);								//instantiating scanner object
            float price = scanPrice.nextFloat();									//taking input for price


            obj.addBook(new Book(bookID,title,author,category,price));						//adding Book instances into BookStore
            obj.displayAll();

            if(i!=4) {	//condition for close scanner input stream
                continue;
            }
            //closing all scanner input streams
            a.close();
            b.close();
            c.close();
           d.close();
            scanPrice.close();
        }	//for loop end

        System.out.println("\nEnter title to search book: ");
        String a = s.nextLine();									//taking input for price
        System.out.println("\nSearched by title");
        obj.xyz("title: " +a);									//searching book by book title

        System.out.println("\nEnter author name to search book");
        String b = s.nextLine();									//taking input for price
        System.out.println("\nSearched by author");
      //  obj.searchByAuthor("Author "+ b );									//searching book by author name
obj.setAuthor("Author " +b);
        System.out.println("\nPrinting all books:");
        obj.displayAll(); 										//displaying all books with details

        s.close(); 											//closing input stream
    }}
