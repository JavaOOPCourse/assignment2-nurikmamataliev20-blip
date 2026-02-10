public class Library {

    private Book[] books;
    private int count;

    public Library(int capacity) {
        books = new Book[capacity];
        count = 0;
    }

    // TODO: Add book to array
    public void addBook(Book book) {
        // implement
        if(count<books.length){
            books[count]=book;
            count++;
            System.out.println("sucsesfully added");
        }else {System.out.println("something gets wrong");}
    }

    // TODO: Display all books
    public void displayBooks() {
        // implement
        for(int i=0; i<count; i++){
            System.out.println(books[i]);
        }
    }

    // TODO: Search book by title
    public Book searchByTitle(String title) {
        for (int i = 0; i < count; i++) {
            if (books[i].getTitle().equals(title)) {
                return books[i];
            }
        }
        return null;
    }
    // TODO: Borrow book by title
    public void borrowBook(String title) {
        Book b = searchByTitle(title);
        // implement
        if (b == null){
            System.out.println("book not found");
        }else if (!b.isAvailable()){
            System.out.println("book is already borrowed");
        }else{
            b.borrowBook();
            System.out.println("sucsesfully borrowed: " + b.getTitle());
        }


    }

    // TODO: Return book by title
    public void returnBook(String title) {
        // implement
        Book b = searchByTitle(title);
        if(b == null) {
            System.out.println("book not found");
        }else if (b.isAvailable()){
            System.out.println("this book was not borrwed");
        }else{
            b.returnBook();
            System.out.println("sucsesfully returned: " + b.getTitle());
        }
    }
}
