package lessons.lesson_21.classWork.part_3.subpoint_3;

import java.util.Set;
import java.util.TreeSet;

public class ComparatorMain {
    public static void main(String[] args) {
        Set<Book> books = new TreeSet<>();
        books.add(new Book("Potter", "Aushkin", 2012));
        books.add(new Book("Potter", "Pushkun", 2001));
        books.add(new Book("Potter", "Dostoevskiy", 2012));

        System.out.println(books);
//
//        System.out.println("=== Custom comparator");
//        Comparator<Book> bookComparator = new BookYearComparator();
////        bookComparator = bookComparator.reversed();
//        bookComparator = bookComparator.thenComparing(new BookNameComparator());
////
//        Set<Book> booksCustom = new TreeSet<>(bookComparator);
//        booksCustom.add(new Book("Potter", "Dostoevskiy", 2012));
//        booksCustom.add(new Book("APotter", "Aushkin", 2012));
//        booksCustom.add(new Book("Potter", "Aushkin", 2001));
////
//        System.out.println(booksCustom);
    }
}
