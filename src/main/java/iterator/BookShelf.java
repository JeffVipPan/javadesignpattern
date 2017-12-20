package iterator;

/**
 * @author ек╥Е
 * @date 2017/12/20 ионГ9:23
 */
public class BookShelf implements Aggregate {
    private Book[] books;


    private int last;

    public void appendBook(Book book) {
        books[last] = book;
        last++;
    }

    public Book getBook(int index) {
        return books[index];
    }

    public int getLength() {
        return books.length;
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }

    public BookShelf(int maxsize) {
        this.books = new Book[maxsize];
    }

}
