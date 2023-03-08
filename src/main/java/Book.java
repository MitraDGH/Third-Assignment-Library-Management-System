public class Book {
    //Book should contain name,author,year of publish and ISBN
    public String name;
    public String author;
    public int yearOfPublish;
    public String ISBN ;
    int bookCounter =0 ;

    <Public> Public Book (String name , String author , int yearOfPublish , String ISBN){
        this.name=name;
        this.author=author;
        this.yearOfPublish=yearOfPublish;
        this.ISBN=ISBN;
        return null; /////////////////////////??????????????
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public int getYearOfPublish() {
        return yearOfPublish;
    }
    public void setYearOfPublish(int yearOfPublish) {
        this.yearOfPublish = yearOfPublish;
    }
    public String getISBN() {
        return ISBN;
    }
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }


    public int getBookCounter() {
        return bookCounter;
    }

    public void setBookCounter(int bookCounter) {
        this.bookCounter = bookCounter;
    }
    public void increasing (){bookCounter++; }
    public void decreasing (){bookCounter--; }

}
