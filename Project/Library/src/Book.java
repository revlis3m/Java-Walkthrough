package Project.Library.src;

public class Book {
    private String title, author;
    private int yearPublished;

    public static int instance = 0;

    public Book(String title, String author, int yearPublished){
        setAuthor(author);
        setTitle(title);
        setYearPublished(yearPublished);

        instance++;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }
    
    public String toString() {
        String message = "The title of the book is " + getTitle() + " the author is " + getAuthor() + " published on " + getYearPublished();
        return message;
    }
}
