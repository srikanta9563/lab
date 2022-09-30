 class Library {
    private String bookId;
     private String bookName;
     private String bookAuthor;
    public void addBook(String bookId, String bookName, String
            bookAuthor) { // for adding book
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
    }
    public void dispenseBook(String bookId, String bookName, String bookAuthor) { // for dispense book

// checking is book details is matched or not
        if ((bookId==bookId)&&(bookName==bookName)){
            System.out.println("book found");
        }}}
 class LibraryBookManagement {
    public static void main(String[] args) {
        Library l = new Library(); // creating library
        l.addBook("123BB", "Java", "IDK");
        l.dispenseBook("87565FF", "Python", "IT");
    }
}
