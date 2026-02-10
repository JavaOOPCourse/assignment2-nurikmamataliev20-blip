public class Book {

    // TODO: make fields private
    private String title;
    private String author;
    private int year;
    private boolean isAvailable;

    // TODO: Implement parameterized constructor
    public Book(String title, String author, int year) {
        // implement
        this.title=title;
        this.author=author;
        this.year=year;
        this.isAvailable=true;
    }

    // TODO: Implement copy constructor
    public Book(Book other) {
        // implement
        this.title=other.title;
        this.author=other.author;
        this.year=other.year;



    }

    // TODO: Implement getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    // TODO: Implement borrow logic
    public void borrowBook() {
        // implement
        if(this.isAvailable==true){
            this.isAvailable=false;
            System.out.println("sucsesfully borrowed");
        }
    }

    // TODO: Implement return logic
    public void returnBook() {
        // implement
        this.isAvailable=true;
        System.out.println("the book is returned");
    }

    // TODO: Override toString()

    public String toString() {
        return "\nauthor: " + author  + "\ntitle: " + title  + "\nyear: " + year +  "\nAvailable: " +isAvailable;
    }

    // TODO: Override equals()

    public boolean equals(Book other) {
        if(this.title.equals(other.title) && this.author.equals(other.author)){
            return true;
        }else return  false;
    }
}
