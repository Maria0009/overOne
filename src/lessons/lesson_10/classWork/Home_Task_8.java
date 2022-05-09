package lessons.lesson_10.classWork;
//+
//belicimo :)) But there is a solution, where we do not need so many for - loops (It's almost like yours)
public class Home_Task_8 {
    public static void main(String[] args) {
        int[][] array = new int[17][18];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length / 2; j++) {
                if (j <= i && j < (array[i].length - 1 - i)) {
                    array[i][j] = j + 1;
                    System.out.print(array[i][j] + "\t");
                } else {
                    System.out.print("\t");
                }
            }
            for (int j = array[i].length / 2; j < array[i].length; j++) {
                if (j > i && j >= (array[i].length - 1 - i)) {
                    array[i][j] = array[i].length - j;
                    System.out.print(array[i][j] + "\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }

    }
}
