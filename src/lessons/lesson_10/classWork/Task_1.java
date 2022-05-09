package lessons.lesson_10.classWork;

public class Task_1 {
    public static void main(String[] args) {
        System.out.println("Enter array:");
        int[][] twoDim = {{5, 7, 3, 17}, {7, 0, 1, 12}, {8, 1, 2, 3}};
        for (int i = 0; i < twoDim.length; i++) {
            for (int j = 0; j < twoDim[i].length; j++) {
                System.out.print(twoDim[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
