package ABAYOMI_BOOKSTORE;

import java.util.ArrayList;
import java.util.List;

public class Customer {

        private List<Book> shoppingCart = new ArrayList<>(10);

        //creating a shopping cart for the customer with a maximum initial capacity of 10 books.

        public void addToCart(Book book) {
            shoppingCart.add(book);

            //This method enables the customer to add books into his cart from the Class 'Book'.
        }

        public void clearCart() {
            shoppingCart.clear();

            //This method enables the customer to clear all the items in his cart if he decides at any point to quit shopping.
        }


    public static void main(String[] args) {


    }

}
