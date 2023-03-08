import java.util.ArrayList;

public class Librarian {
    public String librarianUser;
    public String librarianPass;

    public Librarian(String librarianUser , String librarianPass){
        this.librarianUser=librarianUser;
        this.librarianPass=librarianPass;
    }

    public String getLibrarianUser() {
        return librarianUser;
    }

    public void setLibrarianUser(String librarianUser) {
        this.librarianUser = librarianUser;
    }

    public String getLibrarianPass() {
        return librarianPass;
    }

    public void setLibrarianPass(String librarianPass) {
        this.librarianPass = librarianPass;
    }

    //for searching users, librarians and books
    //.........................................................
    public User searchuser (User user){
        return Library.searchUser(user);
    }
    public Librarian searchlibrarian (Librarian librarian){
        return Library.searchLibrarian(librarian);
    }
    public Book searchbook (Book book){
        return Library.searchBook(book);
    }
    //.........................................................

    //for add,remove and update user,librarian and book
    //.........................................................
    public void adduser (User user){
        Library.addUser(user);
    }
    public static void addLibrarian(Librarian librarian) {
        Library.addLibrarian(librarian);
    }
    public void addbook (Book book){
        Library.addBook(book);
    }
    //......
    public void removeuser (User user){
        Library.removeUser(user);
    }
    public void removelibrarian (Librarian librarian){
        Library.removeLibrarian(librarian);
    }
    public void removebook (Book book){
        Library.removeBook(book);
    }
    //......
    public void updateuser (User user){
        Library.updateUser(user);
    }
    public void updatelibrarian (Librarian librarian){
        Library.updateLibrarian(librarian);
    }
    public void updatebook (Book book){
        Library.updateBook(book);
    }
    //......


}
