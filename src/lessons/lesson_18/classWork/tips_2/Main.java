package lessons.lesson_18.classWork.tips_2;

//Создайте класс, у которого будут поля имя и возраст (на англ), обязательно сделайте их приватными.
// У класса должен быть конструктор, который принимает в виде аргументов эти два поля и конструктор без аргументов,
// который присваивает значения по умолчанию для имени и возраста. Добавьте методы, при помощи которых можно
// получить имя и возраст. Создайте метод show(), чтобы он выводил на экран имя и возраст в читаемом формате

//Создайте массив, состоящий из объектов класса из ‘1'. Найдите кол-во одинаковых объектов в массиве

//Классу из ‘1' добавьте статическое приватное поле text = "Hello from static". Создайте в этом же классе метод,
// который бы выводил на экран это поле и метод, при помощи которого можно изменить значение этого поля.
// В другом классе, с методом main создайте несколько экземпляров класса из 'Task 1'. В одном из них измените значение
// поля 'text' и затем выведите на экран поле 'text' у всех созданных классов. Подумайте почему так.
public class Main {
    public static void main(String[] args) {
//1 task
        Person max = new Person();
        Person dima = new Person(31, "Dima");
        max.show();
        dima.show();
//2 task
        Person[] person = {new Person(31, "Dima"),
                new Person(32, "Vit"),
                new Person(), new Person(32, "Vit"),
                new Person(32, "Vit")};
        System.out.println(countEquals(person));
//3 task
        max.changeAndShowText("This is good");
        max.printText();
        dima.printText();// Выведет 2ды this is good!
        //Так как static у переменной то изменение в одном месте приведет к изменению всех переменных
    }

    public static int countEquals(Person[] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].equals(array[j])) {
                    counter++;
                }
            }
        }
        return counter;
    }


}
