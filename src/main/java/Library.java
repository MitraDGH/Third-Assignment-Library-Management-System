import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Library {

    static ArrayList<Book> booksList = new ArrayList<>();
    Map<String, Integer> isbnLinkedToAmount = new HashMap<String, Integer>();
    static ArrayList<User> users = new ArrayList<>();
    static ArrayList<Librarian> librarians = new ArrayList<>();

    public static ArrayList<Book> getBooksList() {
        return booksList;
    }

    public static void setBooksList(ArrayList<Book> booksList) {
        Library.booksList = booksList;
    }

    public Map<String, Integer> getIsbnLinkedToAmount() {
        return isbnLinkedToAmount;
    }

    public void setIsbnLinkedToAmount(Map<String, Integer> isbnLinkedToAmount) {
        this.isbnLinkedToAmount = isbnLinkedToAmount;
    }

    public static ArrayList<User> getUsers() {
        return users;
    }

    public static void setUsers(ArrayList<User> users) {
        Library.users = users;
    }

    public static ArrayList<Librarian> getLibrarians() {
        return librarians;
    }

    public static void setLibrarians(ArrayList<Librarian> librarians) {
        Library.librarians = librarians;
    }

    //book related functions
    //.........................................................
    public static void addBook(Book book1){
        booksList.add(book1);
    }
    public static void removeBook(Book book1){
        booksList.remove(book1);
    }

    public static Book searchBook(Book book){
        int count =0;
        while (count<booksList.size()){
            if(booksList.get(count).getName().equals(book)){
                return booksList.get(count);
            }
        }
        return null;///////////////??????
    }

    public static void updateBook(Book book){
        //TODO
    }

    public void doesBookExist(Book book){
        if(searchBook(book) != null){
            System.out.println("Your book was successfully found !");
        }else  System.out.println("Unfortunately this book doesn't exist here!");
    }

    public void increaseBook(Book book , int count){
        for (int i = 1 ; i< count ; i++){
            searchBook(book).increasing();
        }
    }

    public void decreaseBook(Book book , int count){
        for (int i = 1 ; i< count ; i++){
            searchBook(book).decreasing();
        }
    }

    //user related functions
    //.........................................................
    public static void addUser(User user1){
        users.add(user1);
    }

    public static void removeUser(User user1){
        users.remove(user1);
    }

    public static User searchUser(User user){
        int count =0;
        while (count<users.size()){
            if(users.get(count).getUsername().equals(user)){
                return users.get(count);
            }
        }
        return null;///////////////??????
    }

    public static void updateUser(User user){
        //TODO
    }

    public void doesUserExist(User user){
        if(searchUser(user) != null){
            System.out.println("The user was successfully found !");
        }else  System.out.println("Unfortunately this user id doesn't exist here!");
    }

    //librarian related functions
    //.........................................................

    public static void addLibrarian(Librarian librarian){
        librarians.add(librarian);
    }

    public static void removeLibrarian(Librarian librarian){
        librarians.remove(librarian);
    }

    public static Librarian searchLibrarian(Librarian librarian){
        int count =0;
        while (count<librarians.size()){
            if(librarians.get(count).getLibrarianUser().equals(librarian)){
                return librarians.get(count);
            }
        }
        return null;///////////////??????
    }

    public static void updateLibrarian(Librarian librarian){
        //TODO
    }

    public void doesLibrarianExist(Librarian librarian){
        if(searchLibrarian(librarian) != null){
            System.out.println("The librarian was successfully found !");
        }else  System.out.println("Unfortunately this librarian doesn't exist here!");
    }
    //.........................................................


}
