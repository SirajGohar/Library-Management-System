package objectmodelpackage;
import java.util.ArrayList;



//encapsulation used

public class Books {

    private ArrayList<Book> books;
    private int numOfCopies;

    public Books() {
        books = new ArrayList<>();
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public int getNumOfCopies() {
        return numOfCopies;
    }

    public void setNumOfCopies(int numOfCopies) {
        this.numOfCopies = numOfCopies;
    }

    public void addBookToList(Book book) {
        books.add(book);
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

}