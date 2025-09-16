package oops.Inheritance;

public class LibraryItem {

    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable;

    protected String formatBasicInfo(){
        return String.format("%s by %s (ISBN: %s) | available: %s",
            title, author, isbn, isAvailable);
    }
    public LibraryItem(){
        this.title = "Unknown";
        this.author = "Unknown";
        this.isbn = "Unknown";
        this.isAvailable = true;
    }
    public LibraryItem(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = true;
    }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getIsbn() { return isbn; }
    public boolean isAvailable() { return isAvailable; }

    public void checkOut(){
        if (isAvailable){ isAvailable = false;}
    }
    public void returnItem(){
        isAvailable = true;
    }
    public void displayInfo(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Isbn: " + isbn);
        System.out.println("IsAvailable: " + isAvailable);
    }

    @Override
    public String toString() {
        return String.format("LibraryItem{title='%s', author='%s', isbn='%s', isAvailable='%s'}", title, author, isbn, isAvailable);
    }
}

class Book extends LibraryItem{
    private int numberOfPages;
    private String genre;

    public Book(){
        super();
        this.numberOfPages = 0;
        this.genre = "Unknown";
    }
    public Book(String title, String author, String inbn, int numberOfPages, String genre) {
        super(title, author, inbn);
        this.numberOfPages = numberOfPages;
        this.genre = genre;
    }

    public int getNumberOfPages() { return numberOfPages; }
    public String getGenre() { return genre; }

    @Override
    public void displayInfo(){
        System.out.println(formatBasicInfo());
        System.out.println("Number of pages: " + numberOfPages);
        System.out.println("Genre: " + genre);
    }
    @Override
    public String toString() {
    return String.format("Book{%s, pages=%d, genre=%s}",
            formatBasicInfo(), numberOfPages, genre);
}
}

class Magazine extends LibraryItem{
    private int issueNumber;
    private String publicationMonth;

    public Magazine(){
        super();
        this.issueNumber = 0;
        this.publicationMonth = "Unknown";
    }

    public Magazine(String title, String author, String isbn, int issueNumber, String publicationMonth) {
        super(title, author, isbn);
        this.issueNumber = issueNumber;
        this.publicationMonth = publicationMonth;
    }

    public int getIssueNumber() { return issueNumber; }
    public String getPublicationMonth() { return publicationMonth; }

    @Override
    public void displayInfo(){
        System.out.println(formatBasicInfo());
        System.out.println("Issue number: " + issueNumber);
        System.out.println("Publication month: " + publicationMonth);
    }

    @Override
    public String toString() {
        return String.format("Magazine{%s, issueNumber=%d, publicationMonth=%s}",
            formatBasicInfo(), issueNumber, publicationMonth);
    }
}

class Demo{
    public static void main(String[] args){
        System.out.println("=== Library Management System Demo ===\n");

        // Create LibraryItem objects
        LibraryItem item1 = new LibraryItem();
        LibraryItem item2 = new LibraryItem("Java Programming", "John Doe", "978-1234567890");

        // Create Book objects
        Book book1 = new Book();
        Book book2 = new Book("Clean Code", "Robert Martin", "978-0132350884", 464, "Programming");
        Book book3 = new Book("The Hobbit", "J.R.R. Tolkien", "978-0547928227", 366, "Fantasy");

        // Display all items
        System.out.println("1. Displaying all library items:");
        System.out.println("\n--- Generic Library Item (Default) ---");
        item1.displayInfo();

        System.out.println("\n--- Generic Library Item (Custom) ---");
        item2.displayInfo();

        System.out.println("\n--- Book (Default) ---");
        book1.displayInfo();

        System.out.println("\n--- Book: Clean Code ---");
        book2.displayInfo();

        System.out.println("\n--- Book: The Hobbit ---");
        book3.displayInfo();

        // Test checkout functionality
        System.out.println("\n2. Testing checkout functionality:");
        System.out.println("Before checkout - Clean Code available: " + book2.isAvailable());
        book2.checkOut();
        System.out.println("After checkout - Clean Code available: " + book2.isAvailable());

        // Test return functionality
        System.out.println("\n3. Testing return functionality:");
        book2.returnItem();
        System.out.println("After return - Clean Code available: " + book2.isAvailable());

        // Test checkout multiple books
        System.out.println("\n4. Testing multiple checkouts:");
        System.out.println("The Hobbit available: " + book3.isAvailable());
        book3.checkOut();
        System.out.println("The Hobbit available after checkout: " + book3.isAvailable());

        // Display final status
        System.out.println("\n5. Final Status of all books:");
        System.out.println("Clean Code - Available: " + book2.isAvailable());
        System.out.println("The Hobbit - Available: " + book3.isAvailable());

        System.out.println("\nDemo completed!");
    }
}