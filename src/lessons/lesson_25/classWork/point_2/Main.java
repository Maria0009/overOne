package lessons.lesson_25.classWork.point_2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Reader reader1 = new Reader();
        reader1.setName();
        reader1.setLastName();
        reader1.setAddress();
        reader1.setAge();
        System.out.println(reader1);
        List<Map<Book, Reader>> list = new ArrayList<>();

        Book book = new Book("Муму", "Тургеньев");
        Book book1 = new Book("Преступление и наказание", "Достоевский");
        Book book2 = new Book("Война и мир", "Толстой");

        ArrayList<Book> list1 = new ArrayList<>();
        list1.add(book);
        list1.add(book1);
        list1.add(book2);

        Library library = new Library();
        while (true){
            System.out.println("Введите 1, если хотите получить книгу");
            System.out.println("Введите 2 если хотите вернуть книгу");
            System.out.println("Введите 0, если хотите выйти из программы");

            Scanner scanner = new Scanner(System.in);
            int operation = scanner.nextInt();

            switch (operation){
                case 0:
                    System.exit(1);
                    break;
                case 1:
                    System.out.println("Доступные книги: ");
                    System.out.println(list1);
                    int bookNumber = scanner.nextInt();
                    list.add(library.takeBook(list1.get(bookNumber+1), reader1));
                    list1.remove(bookNumber+1);
                    break;
                case 2:
                    System.out.println("Книги записанные на Вас. Введите номер книги, которую хотите вернуть");
                    System.out.println(list);
                    int bookNum = scanner.nextInt();
                    Map<Book, Reader> map = new HashMap<>();
                    Book book3 = (Book) list.get(bookNum+1).keySet();
                    Reader reader = list.get(bookNum+1).get(book3);
                    
            }
        }
    }

}
