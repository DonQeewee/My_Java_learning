package ABAYOMI_BOOKSTORE;

import java.util.ArrayList;
import java.util.List;

public class Bookstore {

        private List<Book> bookShelf = new ArrayList<>(50);
        //creating an array list of books on the bookshelf.

        public void addBook(Book book) {
            bookShelf.add(book);
            //This method enables the storekeeper to add books to the bookshelf.
            //It impacts directly in the Class Book as the class has been called directly in the method.
        }

        public List<Book> AllBooks() {
            return bookShelf;
        }

}
