package lessons.lesson_25.classWork.point_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Library {

    public Map<Book, Reader> takeBook(Book book, Reader reader) {
        Map<Book, Reader> bookReaderMap = new HashMap<>();
        bookReaderMap.put(book, reader);
        return bookReaderMap;
    }

    public ArrayList<Map<Book, Reader>> returnBook(ArrayList<Map<Book, Reader>> list
            , String name) {
        for (Map<Book, Reader> list1: list){
            for (Map.Entry<Book, Reader> map: list1.entrySet()){
                if (map.getKey().getName().equals(name)){
                    list1.remove(map);
                }
            }
        }
        return list;
    }
}
