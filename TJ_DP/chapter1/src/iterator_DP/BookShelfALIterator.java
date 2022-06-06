package iterator_DP;

public class BookShelfALIterator implements Iterator{

    private BookShelfAL bookShelfAL;
    private int index = 0;

    public BookShelfALIterator(BookShelfAL bookShelfAL) {
        this.bookShelfAL = bookShelfAL;
    }

    @Override
    public boolean hasNext() {
        if (index < bookShelfAL.getLength()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object next() {
        Book book = bookShelfAL.getBookAt(index);
        index++;
        return book;
    }
}
