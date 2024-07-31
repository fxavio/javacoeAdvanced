package Intermediate.Exercise2week1;
//import java.util.ArrayList;
//import java.util.List;
//public class Library {
//    private final List<Book> books;
//    public Library() {
//        this.books = new ArrayList<>();
//    }
//
//    // Inner class
//    public class Book {
//        private final String title;
//        private final String author;
//        private final int year;
//
//        public Book(String title, String author, int year) {
//            this.title = title;
//            this.author = author;
//            this.year = year;
//        }
//
//        public String getTitle() {
//            return title;
//        }
//
//        public String getAuthor() {
//            return author;
//        }
//
//        public int getYear() {
//            return year;
//        }
//
//        @Override
//        public String toString() {
//            return "Book [title=" + title + ", author=" + author + ", year=" + year + "]";
//        }
//    }
//
//    public void addBook(String title, String author, int year) {
//        Book book = new Book(title, author, year);
//        books.add(book);
//    }
//
//    public void displayBooks() {
//        for (Book book : books) {
//            System.out.println(book);
//        }
//    }
//    public static void main(String[] args) {
//        Library library = new Library();
//        library.addBook("The Great Gatsby", "Scott Fitzgerald", 1925);
//        library.addBook("To Kill a Mockingbird", "Harper Lee", 1960);
//        library.displayBooks();
//    }
//}



import java.util.ArrayList;
import java.util.List;

public class Library {
    private final List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    // Inner record
    public record Book(String title, String author, int year) {
        @Override
        public String toString() {
            return "Book [the title=" + title + ", the author=" + author + ", the years=" + year + "]";
        }
    }

    public void addBook(String title, String author, int year) {
        Book book = new Book(title, author, year);
        books.add(book);
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public static void main(String[] args) {
        Library library = new Library();
        library.addBook("The Great Gatsby", "F. Scott Fitzgerald", 1925);
        library.addBook("To Kill a Mockingbird", "Harper Lee", 1960);
        library.displayBooks();
    }
}
