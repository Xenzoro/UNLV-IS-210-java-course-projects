
//Jacob Martinez Book Class

public class Book
{
    private String title;
    private String author;
    private String ISBN;
    private int publicationYear;
    private boolean isAvailable;

    // we create a constructor
    public Book(String title, String author, String ISBN, int publicationYear)
    {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.publicationYear = publicationYear;
        this.isAvailable = true; // By default, the book is available
    }
    // we make getters and setters
    public String getTitle()
    {
        return title;
    }
    public String getAuthor()
    {
        return author;
    }
    public String getISBN()
    {
        return ISBN;
    }
    public int getPublicationYear()
    {
        return publicationYear;
    }
    public boolean isAvailable()
    {
        return isAvailable;
    }
    // this is a setter for availability

    public void setAvailable(boolean isAvailable)
    {
        this.isAvailable = isAvailable;
    }

    // toString method
    // this function returns a string representation of the status and data attached to the book
    @Override
    public String toString()
    {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + ISBN + "," +
               " Publication Year: " + publicationYear + ", Available: " + isAvailable;
    }

}
