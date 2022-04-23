package lessons.lesson_25.classWork.point_3;

import java.util.Collections;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Library {
    public Map<Book, Reader> takeBook(Book book, Reader reader) {
        Map<Book, Reader> bookReaderMap = new HashMap<>();
        bookReaderMap.put(book, reader);
        return bookReaderMap;
    }

    public void returnBook(List<Map<Book, Reader>> list
            , String name) {
        for (Map<Book, Reader> list1 : list) {
            for (Map.Entry<Book, Reader> map : list1.entrySet()) {
                if (map.getKey().getName().equals(name)) {
                    list.remove(list1);
                    return;
                }
            }
        }
    }

}
