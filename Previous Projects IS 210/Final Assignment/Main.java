import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        // Create a Library and Scanner instance
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        // Display the menu and handle user input
        while (true)
        {
            // Display the menu options
            System.out.println("Library Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Search Book");
            System.out.println("4. Display All Books");
            System.out.println("5. Check Out Book");
            System.out.println("6. Return Book");
            System.out.println("7. Load Books From File");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            // Handle user input based on the choice
            switch (choice)
            {
                // Add a new book
                case 1:
                    System.out.print("Enter title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter ISBN: ");
                    String ISBN = scanner.nextLine();
                    System.out.print("Enter publication year: ");
                    int year = scanner.nextInt();
                    Book newBook = new Book(title, author, ISBN, year);
                    library.addBook(newBook);
                    break;

                // Remove a book
                case 2:
                    System.out.print("Enter ISBN of the book to remove: ");
                    String removeISBN = scanner.nextLine();
                    library.removeBook(removeISBN);
                    break;

                // Search for abook
                case 3:
                    System.out.print("Enter title or author to search: ");
                    String keyword = scanner.nextLine();
                    library.searchBook(keyword);
                    break;

                // Display all books
                case 4:
                    library.displayBooks();
                    break;

                // Check out a book
                case 5:
                    System.out.print("Enter ISBN of the book to check out: ");
                    String checkOutISBN = scanner.nextLine();
                    library.checkOutBook(checkOutISBN);
                    break;

                // Return a book
                case 6:
                    System.out.print("Enter ISBN of the book to return: ");
                    String returnISBN = scanner.nextLine();
                    library.returnBook(returnISBN);
                    break;

                // Enter filename to load books
                case 7:
                    System.out.print("Enter filename to load books: ");
                    String filename = scanner.nextLine();
                    library.loadBooksFromFile(filename);
                    break;

                // Exit  the program
                case 8:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                //  Invalid option for error handling
                default:
                    System.out.println("Invalid option. Please try again.");
            }


        }


    }

}