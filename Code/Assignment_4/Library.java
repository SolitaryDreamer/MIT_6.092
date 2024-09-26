public class Library {

    String address;
    Book[] books = new Book[100];
    int num = 0;

    public Library(String libraryAddress) {
        address = libraryAddress;
    }

    public void addBook(Book newBook) {
        books[num] = newBook;
        num += 1;
    }

    public static void printOpeningHours() {
        System.out.println("Libraries are open daily from 9am to 5pm.");
    }

    public void printAddress() {
        System.out.println(address);
    }

    public void borrowBook(String bookTitle) {
        for (int i = 0; i < num; i++) {
            if (bookTitle.equals(books[i].title)) {
                if (!books[i].borrowed) {
                    books[i].borrowed = true;
                    System.out.println("You successfully borrowed " + bookTitle + ".");
                } else {
                    System.out.println("Sorry, this book is already borrowed.");
                }
                return;
            }
        }
        System.out.println("Sorry, this book is not in our catalog.");
    }

    public void printAvailableBooks() {
        boolean anyAvailable = false;
        for (int i = 0; i < num; i++) {
            if (!books[i].borrowed) {
                System.out.println(books[i].title);
                anyAvailable = true;
            }
        }
        if (num == 0) {
            System.out.println("No book in catalog.");
        } else if (!anyAvailable) {
            System.out.println("No available book in catalog.");
        }
    }

    public void returnBook(String bookTitle) {
        for (int i = 0; i < num; i++) {
            if (books[i].title.equals(bookTitle)) {
                books[i].borrowed = false;
                System.out.println("You successfully returned " + bookTitle + ".");
                return;
            }
        }
        System.out.println("Sorry, This book does not belong in this catalog.");
    }

    public static void main(String[] args) {

        // Create two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");

        // Add four books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));

        // Print opening hours and the addresses
        System.out.println("Library hours:");
        printOpeningHours();
        System.out.println();

        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();

        // Try to borrow The Lords of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of all available books from both libraries
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println();

        // Return The Lords of the Rings to the first library
        System.out.println("Returning The Lord of the Rings:");
        firstLibrary.returnBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of available from the first library
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
    }
}
