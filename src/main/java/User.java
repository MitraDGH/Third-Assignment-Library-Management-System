import java.util.ArrayList;

public class User {
    ArrayList<Book> userBooks = new ArrayList<>();
    public String username;
    public String pass;

    public User(String username , String pass){
        this.username=username;
        this.pass=pass;
    }

    public ArrayList<Book> getUserBooks() {
        return userBooks;
    }

    public void setUserBooks(ArrayList<Book> userBooks) {
        this.userBooks = userBooks;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void rentBook(Book book){
        Book newbook = Library.searchBook(book);
        userBooks.add(newbook);
        newbook.decreasing(); //after renting its number is decreasing in the library
        ///????????
    }

    public void returnBook(Book book){
        Book oldbook = Library.searchBook(book);
        userBooks.remove(oldbook);
        oldbook.decreasing(); //after returning its number is decreasing in the library
        ////?????
    }
}
