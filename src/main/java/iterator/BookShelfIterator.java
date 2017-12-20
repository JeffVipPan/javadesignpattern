package iterator;

/**
 * @author ек╥Е
 * @date 2017/12/20 ионГ9:36
 */
public class BookShelfIterator implements Iterator {

    private BookShelf bookShelf;

    private int index;

    @Override
    public boolean hasNext() {
        if (index < bookShelf.getLength()) {
            return true;
        } else {
            return false;
        }

    }

    @Override
    public Object next() {
        Object object = bookShelf.getBook(index);
        index++;
        return object;
    }

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }
}
