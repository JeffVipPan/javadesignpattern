package iterator;

/**
 * @author 潘峰
 * @date 2017/12/20 上午9:42
 */
public class App {

    public static void main(String[] args) {

        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("java编程思想"));
        bookShelf.appendBook(new Book("mysql从入门到放弃"));
        bookShelf.appendBook(new Book("Spring in Action"));
        bookShelf.appendBook(new Book("北方有佳人"));

        Iterator it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book = (Book) it.next();
            System.out.println(book.getName());
        }
    }
}
