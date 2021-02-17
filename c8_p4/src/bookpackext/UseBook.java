// This class is in package bookpackext.
package bookpackext;

import bookpack.*;

// Use the Book class from bookpack.
class UseBook {
    public static void main(String[] args) {
        Book[] books = new Book[5];
        final String SCHILDT = "Schildt";

        books[0] = new Book("Java: A Beginner's Guide", SCHILDT, 2019);
        books[1] = new Book("Java: The Complete Reference", SCHILDT, 2019);
        books[2] = new Book("Introducing JavaFX 8 Programming", SCHILDT, 2015);
        books[3] = new Book("Red Storm Rising", "Clancy", 1986);
        books[4] = new Book("On the Road", "Kerouac", 1955);

        for (int i = 0; i < books.length; i++)
            books[i].show();
    }
}
