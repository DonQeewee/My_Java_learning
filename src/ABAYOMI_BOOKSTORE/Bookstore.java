package ABAYOMI_BOOKSTORE;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.ArrayList;
import java.util.List;

public class Bookstore {

        private static List<Book> bookShelf = new ArrayList<>(50);

    public void addBook(Book book) {
        bookShelf.add(book);
        Book book001 = new Book("Harry Potter", Genre.FICTION, 3550.0);
        Book book002 = new Book("Macmillan English 2", Genre.LANGUAGE, 2575.5);
        Book book003 = new Book("Essential Economics 3", Genre.FINANCE, 5525.9);

        bookShelf.add(book001);
        bookShelf.add(book002);
        bookShelf.add(book003);


            //This method enables the storekeeper to add books to the bookshelf.
            //It impacts directly in the Class Book as the class has been called directly in the method.
        }

        public static List<Book> AllBooks() {

            return bookShelf;
        }

    public static void main(String[] args) {
        System.out.println(bookShelf);
    }

}
