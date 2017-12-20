package iterator;

/**
 * @author �˷�
 * @date 2017/12/20 ����9:42
 */
public class App {

    public static void main(String[] args) {

        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("java���˼��"));
        bookShelf.appendBook(new Book("mysql�����ŵ�����"));
        bookShelf.appendBook(new Book("Spring in Action"));
        bookShelf.appendBook(new Book("�����м���"));

        Iterator it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book = (Book) it.next();
            System.out.println(book.getName());
        }
    }
}
