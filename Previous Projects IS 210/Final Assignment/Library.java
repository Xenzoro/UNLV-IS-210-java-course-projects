import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class Library
{
    private ArrayList<Book> books;

    // constructor
    // creates and initializes an array list of books
    public Library()
    {
        // Initialize the library with some books
        books = new ArrayList<>();
    }


    // this function adds a book to the array list
    public void addBook(Book book)
    {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }


    // this function removes a book from the array list
    public void removeBook(String ISBN)
    {
        for(Book book : books)
        {
            // if the book is found, remove it from the list
            // it compares the ISBN of the book to the one passed in
            if(book.getISBN().equals(ISBN))
            {
                books.remove(book);
                System.out.println("Book removed: " + book.getTitle());
                return;
            }
        }
    System.out.println("Book with ISBN " + ISBN + " not found");
    }


    // search for a book by keyword
    public void searchBook(String keyword)
    {
        boolean found = false;
        //this loop iterates through the array list of books to find the book
        for (Book book: books)
        {
            // if the book is found by using contains, or equals, print the book
            if(book.getTitle().contains(keyword) || book.getAuthor().contains(keyword))
            {
                System.out.println(book);
                found = true;
            }
        }
        // if the book is not found, print a message
        if (!found)
        {
            System.out.println("No books found with the keyword: " + keyword);
        }
    }


    //This displays all books in the library
    public void displayBooks()
    {   // this function checks if the array list is empty
        if (books.isEmpty())
        {
            System.out.println("No books in the library.");
            return;
        }
        // this loop iterates through the array list of books and prints them
        for (Book book : books)
        {
            System.out.println(book);
        }
    }


    // this function checks out a book by ISBN
    public void checkOutBook(String ISBN)
    {
    for (Book book : books)
        {
        // if the book is found, check it out
        if (book.getISBN().equals(ISBN))
            {
            // if the book is available, check it out
            if (book.isAvailable())
                {
                book.setAvailable(false);
                System.out.println("Book checked out: " + book.getTitle());
                }
            else
                    {
                System.out.println("Book is already checked out: " + book.getTitle());
                    }
            return;
            }

        }
        System.out.println("Book with ISBN " + ISBN + " not found");
    }


    // this returns a book by ISBN
    public void returnBook(String ISBN)
    {
        for (Book book : books)
        {
            // if the book is found, return it
            if (book.getISBN().equals(ISBN))
            {
                // if the book is not available, return it
                if (!book.isAvailable())
                {
                    book.setAvailable(true);
                    System.out.println("Book returned: " + book.getTitle());
                }
                else
                {
                    // this happens if the user tries to return a book that is not checked out
                    System.out.println("Book was not checked out: " + book.getTitle());
                }
                return;
            }
        }
        System.out.println("Book with ISBN " + ISBN + " not found");
    }


    // this functions loads a books from a file
    public void loadBooksFromFile(String filename )
    {   // this function initalizes a scanner to read the file
        // the try portion ensures that the file is closed after reading
        try(Scanner fileScanner = new Scanner(new File(filename)))
        {
            // this loop iterates through the file line by line and checks if there is a next line
            while (fileScanner.hasNextLine())
            {
                String line = fileScanner.nextLine();
                // this splits the line into an array of strings
                String[] data = line.split(",");
                // this checks if the array has 4 elements title, author, ISBN, and publication year
                if (data.length == 4)
                {
                    // this trims the strings to remove any leading or trailing whitespace
                    // and parses the publication year to an integer
                    String title = data[0].trim();
                    String author = data[1].trim();
                    String ISBN = data[2].trim();
                    int publicationYear = Integer.parseInt(data[3].trim());
                    // this creates a new book object and adds it to the library
                    Book book = new Book(title, author, ISBN, publicationYear);
                    addBook(book);
                }
                // if the array does not have 4 elements, print an error message
                else
                {
                    System.out.println("Invalid book format: " + line);
                }
            }
            // this prints a message to indicate that the books have been loaded
            System.out.println("Books loaded from file: " + filename);
        }
        // this catches the exception if the file is not found
        catch (FileNotFoundException e)
        {
            System.out.println("File not found: " + filename);
        }
    }
}
