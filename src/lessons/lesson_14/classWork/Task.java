package lessons.lesson_14.classWork;

import java.util.Arrays;
import java.util.Locale;

public class Task {
    public static void main(String[] args) {
        String str = "text";//Создание через литералы
        String str2 = new String(new char[]{'e', 'f'});// через объект // модель памяти  не pool literal а объект (другая область памяти)
        //String str2 = new String("Java");
//Все строки являются неизменяемые - immutable
        System.out.println(str.length());
        char[] charArray = str.toCharArray();// преобразует строку в массив char {'e','f'}
        System.out.println(Arrays.toString(charArray));
        String s = "";
        System.out.println(s.length());// 0 length
        System.out.println(s.isEmpty());//Проверяет является ли длина 0 ( выводит true)
        String s1 = null;// не ссылается ни на что
        if (s1 != null && !s1.isEmpty()) {
            System.out.println(s1.length());// ошибка
        }

// Все методы String возвращают новую строку!!!

        //Соединение (concatenation) строк
        String str3 = "Java";
        String str4 = "Hello";
        String str5 = str3 + str4;
        System.out.println(str5);
        //or
        String str6 = str3.concat(str4);
        System.out.println(str6);

        String str7 = str3 + 2022 + 's';
        System.out.println(str7);

        //Соеденить с разъеденителем
        String sqq = String.join(",", str3, str4);
        System.out.println(sqq);

        //Извлечение символов и подстрок
        char charOfIndex = str3.charAt(2);
        System.out.println(charOfIndex);

        //Сравнение строк equals string
        //Через == мы сравниваем ссылки! поэтому нельзя
        System.out.println(str3.equals(str4));
        String str10 = "java";
        System.out.println(str3.equalsIgnoreCase(str10));// ignore register
        String str11 = "Java";
        System.out.println("str3==str11:" + (str3 == str11));// true только в этом случае т.к. ссылается 11 на 3 строку,
        // а не создает новую в 47 строке, а если будем создавать через объект строку то будет false
        System.out.println(str3 == str11);

        // compareTo() сравнивает 2 строки и возвращает какая из строк больше
        System.out.println(str3.compareTo(str4));

        // index() находит индекс первого вхождения в строку
        System.out.println(str3.indexOf('v'));

        //startWith() endWith() начинается (заканчивается) ли строка с такого символа or  world
        System.out.println(str3.startsWith("Java"));
        System.out.println(str3.endsWith("a"));

        //replace() Замена
        String str14 = "Hello world";
        // System.out.println(str14.replace('l','d'));
        System.out.println(str14.replace("Hello", "Bue"));


        //trim() убирает лишние пробелы в начале и в конце
        String str15 = "  hello  world   ";
        String str16 = str15.trim();
        System.out.println(str16);

        //substring() возвращает строку с определенног символа
        System.out.println(str14.substring(7));// for end string
        System.out.println(str14.substring(3, 7));//[3,7)

        //toLowerCase, toUpperCase
        System.out.println(str14.toLowerCase(Locale.ROOT));
        System.out.println(str14.toUpperCase(Locale.ROOT));
        System.out.println(str14.substring(3, 7).toUpperCase(Locale.ROOT));//[3,7)// метод в методе

        //split разделить по определенному разделителю
        String str17 = "I love Java so much";
        String[] strArray = str17.split(" ");
        String[] strArray2 = str17.split("a");
        for (String word : strArray) {
            System.out.print(word + ", ");
        }
        System.out.println();
        System.out.println(Arrays.toString(strArray));
        System.out.println(Arrays.toString(strArray2));

// String Builder  можно изменять строку   почитать pattern and regular expressions
    }
}
