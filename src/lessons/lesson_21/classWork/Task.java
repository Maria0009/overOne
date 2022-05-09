package lessons.lesson_21.classWork;

import java.util.*;

public class Task {
    public static void main(String[] args) {
//List упорядоченный и содержит повторяющиеся элементы
//ArrayList
        List<String> strings = new ArrayList<>();//Создание листа пустого
        strings.add("A");
        strings.add("B");
        strings.add("C");
        strings.add(0, "D");//D будет 1 А будет вторым, он смещает но не удаляет!
        System.out.println(strings);//Вызов листа
        strings.set(0, "K");//Замена
        System.out.println(strings);
//LinkedList
        List<String> ll = new LinkedList<>();
        ll.add("S");
        ll.addAll(strings);
        System.out.println("Before: " + ll);
        ll.removeAll(strings);
        System.out.println("After: " + ll);

//        List<String> a = Collections.singletonList();
//SET- коллекция которая не содержит повторяющихся элементов (нет индексов т.к. не упорядоченный Random)
//HashSet - вычисляет hashCode и хранит в карзине и затем происходит сравнение кодов
        Set<Integer> integers = new HashSet<>();
        integers.add(1);
        integers.add(3);
        integers.add(2);
        integers.add(2);
        integers.add(2);
        integers.add(55);
        integers.add(20);
        integers.add(2);
        System.out.println(integers);// не упорядочевает просто так получилось
        Set<Integer> unique = new HashSet<>(integers);// удалит повторения так как из List в HashSet
        //если хотим удалить одинаковые объекты переопределяем  equals and hashCode
//TreeSet- когда множество должно быть упорядочено но мы сами решаем как упорядочить
        Set<Integer> integers1 = new TreeSet<>();
        integers1.add(1);
        integers1.add(3);
        integers1.add(2);
        System.out.println(integers1);//Возможны различные методы сортировки
        Set<String> integers2 = new TreeSet<>();
        integers2.add("A");
        integers2.add("C");
        integers2.add("B");
        System.out.println(integers2);//Возможны различные методы сортировки
//Сортировка по объектам
//compereTo  классе implements Comparable
//   public int compareTo(Book book){
//    int nameComper= this.name.compareTo(book.name);
 //   }
    }

}
