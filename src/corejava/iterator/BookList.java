package corejava.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class BookList implements Iterator<Book> {

    // + O(n)
    private Book[] books;
    private int index;

    public BookList(Book[] books, int index) {
        this.books = books;
        this.index = index;
    }

    @Override
    public boolean hasNext() {
        return this.index < this.books.length;
    }

    @Override
    public Book next() {
        if (!hasNext()) {
            throw new NoSuchElementException("No more books in the list.");
        }
        return books[index++];
    }
}
