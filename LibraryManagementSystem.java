import java.util.ArrayList;
import java.util.Scanner;

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author;
    }
}

public class LibraryManagementSystem {
    private static ArrayList<Book> books = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean exit = false;

        while (!exit) {
            System.out.println("----------------------------------");
            System.out.println("    Library Management System     ");
            System.out.println("----------------------------------");
            System.out.println("1. Add Book");
            System.out.println("2. View All Books");
            System.out.println("3. Search Book by Title");
            System.out.println("4. Delete A Book");
            System.out.println("5. Update A Book");
            System.out.println("6. Exit");
            System.out.println("----------------------------------");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    viewBooks();
                    break;
                case 3:
                    searchBookByTitle();
                    break;
                case 4:
                    deleteBook();
                    break;
                case 5:
                    updateBook();
                    break;
                case 6:
                    exit = true;
                    System.out.println("Exiting!!!!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addBook() {
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();
        System.out.print("Enter book author: ");
        String author = scanner.nextLine();

        Book newBook = new Book(title, author);
        books.add(newBook);

        System.out.println("Book added successfully.");
    }

    private static void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            System.out.println("List of Books:");
            System.out.println("--------------");
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    private static void searchBookByTitle() {
        System.out.print("Enter book title to search: ");
        String title = scanner.nextLine();

        boolean found = false;
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Book found: " + book);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Book not found.");
        }
    }

    private static void deleteBook() {
        System.out.print("Enter book title to delete: ");
        String title = scanner.nextLine();

        Book bookToDelete = null;
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                bookToDelete = book;
                break;
            }
        }

        if (bookToDelete != null) {
            books.remove(bookToDelete);
            System.out.println("Book deleted successfully.");
        } else {
            System.out.println("Book not found.");
        }
    }

    private static void updateBook() {
        System.out.print("Enter book title to update: ");
        String title = scanner.nextLine();

        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.print("Enter new book title: ");
                String newTitle = scanner.nextLine();
                System.out.print("Enter new book author: ");
                String newAuthor = scanner.nextLine();

                book.setTitle(newTitle);
                book.setAuthor(newAuthor);

                System.out.println("Book updated successfully.");
                return;
            }
        }

        System.out.println("Book not found.");
    }
}
