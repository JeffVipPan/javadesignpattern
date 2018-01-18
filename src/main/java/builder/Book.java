package builder;

import lombok.Builder;
import lombok.ToString;

/**
 * @author �˷�
 * @date 2018/1/11 ����6:19
 */
@Builder
@ToString
public class Book {
    private int id;

    private String bookName;

    private String bookCode;

//    public static Book buildBook(int id, String bookCode, String bookName) {
//        return Book.builder()
//                .id(id)
//                .bookCode(bookCode)
//                .bookName(bookName)
//                .build();
//    }

    public static void main(String[] args) {
//        Book book = Book.buildBook(1, "xyj", "���μ�");
//        System.out.println(book.toString());

        Book book = Book.builder()
                .bookCode("sx")
                .bookName("���μ�")
                .id(1)
                .build();

        System.out.println(book);
    }


}


