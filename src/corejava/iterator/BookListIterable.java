package corejava.iterator;

import java.util.Iterator;

public class BookListIterable implements Iterable<Book> {

    private Book[] books;

    public BookListIterable(Book[] books) {
        this.books = books;
    }

    @Override
    public Iterator<Book> iterator() {
        return null;
    }
}
