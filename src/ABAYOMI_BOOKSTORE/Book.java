package ABAYOMI_BOOKSTORE;

/**Question: Online Bookstore System

        Scenario:

        You are tasked with designing an online bookstore system.
        The system should allow customers to browse, purchase, and manage books,
        while also providing functionality for the bookstore owner to manage their inventory.
        Your task is to design the core features of this system.

        Instructions:

        Describe the main components of the online bookstore system, including:

        1) How books are represented in the system.
        e.g. the following attributes must be included
        - title of books
        - genre of books
        - price of book

        2) The bookstore owner can manage the inventory.
        - e.g. addBooks to the store
        - get All added books
        - Get the price of all available  books

        3) How customers can browse and purchase books.
        - customer must be able to purchase books

        Explain how you would implement a discount system for books. For example, you might offer a 10% discount on all fiction books during a sale. Describe the key classes, interfaces, or methods involved in implementing this feature.

        Any additional features or functionalities that should be included are allowed.

        Enumerate the potential challenges or issues that might arise in implementing such a system, and propose solutions or strategies to address them.

        Note: your code should be self-explanatory and use comment where necessary.
        GoodLuck :)**/



public class Book {

        private String title;
        Genre genre; //The class Genre is hereby called to serve as one of the atttributes of the class Book.
        private double price;

        public Book(String title, Genre genre, double price) {
            this.title = title;
            this.genre = genre;
            this.price = price;
        }



    public static void main(String[] args) {


        }




}
