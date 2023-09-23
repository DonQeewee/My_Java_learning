package ABAYOMI_BOOKSTORE;



public class Book {

        private String title;
        Genre genre; //The class Genre is hereby called to serve as one of the atttributes of the class Book.
        private double price;

        public Book(String title, Genre genre, double price) {
            this.title = title;
            this.genre = genre;
            this.price = price;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public Genre getGenre() {
            return genre;
        }

        public void setGenre(Genre genre) {
            this.genre = genre;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }
        // Getters and setters for attributes.
        // This will be needed by the customers to ascertain attributes of the books they require.

    public static void main(String[] args) {

        }




}
