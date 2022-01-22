//Начав тренировку, спортсмен в первый день пробежал 10 км. Каждый день он увеличивал дневную норму
//на 10% нормы предыдущего дня. Какой суммарный путь пробежит спортсмен за 7 дней?
package lessons.lesson_5.homeWork;
//+'
public class task_4 {
    public static void main(String[] args) {
        double norma = 10;
        double way = 10;
        //7 - const
        for (int i = 2; i <= 7; i++) {
            //0.1 - const
            norma += 0.1 * norma;
            //System.out.println(i + " day " + norma + " way ");
            way += norma;
        }
        System.out.println("All way for 7 day: " + way + " km");
    }
}
