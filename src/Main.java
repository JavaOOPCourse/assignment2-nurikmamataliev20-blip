import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Library library = new Library(10);

        int choice;

        do {
            System.out.println("\n===== Library Menu =====");
            System.out.println("1. Add book");
            System.out.println("2. Add e-book");
            System.out.println("3. Display all books");
            System.out.println("4. Search book by title");
            System.out.println("5. Borrow book");
            System.out.println("6. Return book");
            System.out.println("7. Exit");
            System.out.print("Choose option: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    System.out.print("enter your book title: ");
                    String title = scanner.nextLine();
                    System.out.print("enter your book author: ");
                    String author = scanner.nextLine();
                    System.out.print("enter your book yaer: ");
                    int year= scanner.nextInt(); scanner.nextLine();
                    Book book= new Book(title, author, year);
                    library.addBook(book);
                    break;

                case 2:
                    // TODO: Read input and add EBook
                    System.out.print("enter your ebook title: ");
                    String etitle = scanner.nextLine();
                    System.out.print("enter your ebook author: ");
                    String eauthor = scanner.nextLine();
                    System.out.print("enter your ebook yaer: ");
                    int eyear= scanner.nextInt(); scanner.nextLine();
                    System.out.print("enter your ebook size: ");
                    double size=scanner.nextDouble(); scanner.nextLine();
                    EBook ebook= new EBook(etitle, eauthor, eyear, size);
                    library.addBook(ebook);
                    break;
                case 3:
                    library.displayBooks();
                    System.out.println("this is all our books");
                    break;

                case 4:
                    // TODO: Search book
                    System.out.print("enter book title for searching:");
                    String search_title = scanner.nextLine();
                    Book found = library.searchByTitle(search_title);
                    System.out.println(found != null ? found : "not found");
                    break;

                case 5:
                    // TODO: Borrow book
                    System.out.print("enter book title for borrowing: ");
                    String borrow_title = scanner.nextLine();
                    library.borrowBook(borrow_title);
                    break;

                case 6:
                    // TODO: Return book
                    System.out.print("enter book title for returning: ");
                    String return_title= scanner.nextLine();
                    library.returnBook(return_title);
                    break;

                case 7:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option!");
            }

        } while (choice != 7);

        scanner.close();
    }
}
