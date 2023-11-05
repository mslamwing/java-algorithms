package corejava.iterator;

public class Main {

    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("1984", "George Orwell");
        Book b3 = new Book("To Kill a Mockingbird", "Harper Lee");

        //SPACE O(n) + O(n) = O(n)
        Book[] bookArray = { b1, b2, b3 };

        BookList bookList = new BookList(bookArray, 0);

        // TIME O(n)
        while (bookList.hasNext()) {
            System.out.println(bookList.next());
            // loop over n elements O(n), first 10 elements of 100 elements
                // loop over elements O(n)
        }
        // total O(n^3)
    }
}
