/*
    You have to implement a library using java class library
    Methods : addBook, issueBook, returnBook, showAvailableBooks
    Properties : Array to store the available books, Array to store the issued books
*/
class Library{
    String[] books;
    int no_of_books;
    // Constructor
    Library(){
        this.books = new String[100];
        this.no_of_books = 0;
    }

    void addBook(String book){
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book+" has been added.");
    }

    void showAvailableBooks(){
        System.out.println("Available books are:- ");
        // for each loop
        for (String book : this.books){
            if (book == null){
                continue;
            }
            System.out.println("-> "+book);
        }
    }

    void issueBook(String book){
        // for each loop
        for (int i = 0; i < this.books.length;i++){
            if (this.books[i].equals(book)){
                System.out.println("The book has been issued!");
                this.books[i] = null;
                return;
            }
            System.out.println("* "+book);
        }
        System.out.println("This book is not exist.");
    }
}
public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library centralLibrary = new Library();
        centralLibrary.addBook("Think and grow Rich");
        centralLibrary.addBook("Let us C");
        centralLibrary.addBook("Java");
        centralLibrary.addBook("Web Technology");
        centralLibrary.showAvailableBooks();
    }
}
