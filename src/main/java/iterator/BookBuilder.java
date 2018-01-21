package iterator;

/**
 * @author �˷�
 * @date 2018/1/18 ����8:47
 */
public final class BookBuilder {
    private String name;

    private BookBuilder() {
    }

    public static BookBuilder aBook() {
        return new BookBuilder();
    }

    public BookBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public Book build() {
        Book book = new Book();
        book.setName(name);
        return book;
    }
}
