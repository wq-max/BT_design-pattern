package iterator_DP;

import java.util.ArrayList;

public class BookShelfAL implements Aggregate{

    private ArrayList<Book> books;

    public BookShelfAL(int initialsize) {
        this.books = new ArrayList<>(initialsize);
    }

    public Book getBookAt(int index) {
        return books.get(index);
    }

    public void appendBook(Book book) {
        books.add(book);
    }

    public int getLength() {
        return books.size();
    }

    @Override
    public Iterator iterator() {
        return new BookShelfALIterator(this);
    }
}
