package lessons.lesson_25.classWork.point_3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Reader reader1 = new Reader();
        Reader reader2 = new Reader();
        Reader reader3 = new Reader();
        ArrayList<Reader> list2 = new ArrayList<>();
        reader1.addReader(reader1);
        reader2.addReader(reader2);
        reader3.addReader(reader3);
        list2.add(reader1);
        list2.add(reader2);
        list2.add(reader3);
        System.out.println(list2);

        Book book1 = new Book("Муму", "Тургеньев");
        Book book2 = new Book("Преступление и наказание", "Достоевский");
        Book book3 = new Book("Война и мир", "Толстой");
        ArrayList<Book> list1 = new ArrayList<>();
        list1.add(book1);
        list1.add(book2);
        list1.add(book3);
        System.out.println(list1);

        ArrayList<Map<Book, Reader>> list = new ArrayList<>();
        System.out.println(list);

        Reader reader = getReader(list2);

        Library library = new Library();
        while (true) {
            System.out.println("Введите 1, если хотите получить книгу");
            System.out.println("Введите 2 если хотите вернуть книгу");
            System.out.println("Введите 0, если хотите выйти из программы");

            Scanner scanner = new Scanner(System.in);
            int operation = scanner.nextInt();

            switch (operation) {
                case 0:
                    System.exit(1);
                    break;
                case 1:
                    System.out.println("Доступные книги: ");
                    System.out.println(list1);
                    int bookNumber = scanner.nextInt();
                    list.add(library.takeBook(list1.get(bookNumber - 1), reader));
                    list1.remove(bookNumber - 1);
                    break;
                case 2:
                    System.out.println("Книги записанные на Вас. Введите номер книги, которую хотите вернуть");
                    System.out.println(list);
                    if (list.isEmpty()) {
                        break;
                    }
                    int bookNum = scanner.nextInt();
                    List<Book> list3 = new ArrayList<>(list.get(bookNum - 1).keySet());
                    list1.addAll(list3);
                    System.out.println(list);
                    System.out.println(list3);
                    library.returnBook(list, list3.get(0).getName());
                    System.out.println(list1);
                    System.out.println(list);
                    break;
            }
        }
    }

    public static Reader getReader(ArrayList<Reader> list1) {
        System.out.println("Кто Вы по списку: (1,2,3): ");
        System.out.println(list1);
        Reader reader = null;
        Scanner scanner = new Scanner(System.in);
        int operation = scanner.nextInt() - 1;
        switch (operation) {
            case 0:
                System.out.println(list1.get(0));
                reader = list1.get(0);
                break;
            case 1:
                reader = list1.get(1);
                break;
            case 2:
                reader = list1.get(2);
                break;
            default:
                System.out.println("Not found that reader.");
                break;
        }
        return reader;
    }
}