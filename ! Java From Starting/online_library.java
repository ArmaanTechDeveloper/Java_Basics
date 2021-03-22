import java.util.Scanner;

class library {
    Scanner sc = new Scanner(System.in);
    String books[];
    int no_of_books;

    library() {
        this.books = new String[100];
        this.no_of_books = 0;
    }

    public void addBook(String book) {
        books[no_of_books] = book;
        no_of_books++;
    }

    public void issueBook(String book) {
        for (int i = 0; i < this.books.length; i++) {
            if (book == this.books[i]) {
                System.out.println(book + " was successfully issued ");
            }
        }
    }
    public void availableBooks() {
        for (int i = 0; i < this.books.length; i++) {
            System.out.println(books[i]);
        }
    }
    public void returnBook(String book){
        for (int i = 0; i < this.books.length; i++) {
            if (book == this.books[i]) {
                i++;
            }
        }
    }
}

public class online_library {
    public static void main(String[] args) {
        library obj = new library();
        Scanner sc = new Scanner(System.in);
        obj.addBook("cwh");
        obj.addBook("armaan");
        obj.availableBooks();
        
    }
}