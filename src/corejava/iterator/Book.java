package corejava.iterator;

// Define the Book class
class Book {
    private String title;
    private String author;

    public Book() { }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public int getTitleWordCount() {
        return this.title.length();
    }

    public int getAuthorWordCount() {
        return this.author.length();
    }

    @Override
    public String toString() {
        return "Book, Author: " + this.author + " Title: " + this.title;
    }
}
