package lessons.lesson_24.classWork;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main_2 {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        int endNumber = inputSth();
        int temp = endNumber;
        int sumKey = 0;
        int sumValue = 0;
        for (int i = 1; i <= endNumber; i++) {
            map.put(i, temp);
            temp--;
        }
        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            sumKey += m.getKey();
            sumValue += m.getValue();
        }
        System.out.println(map);
        System.out.println("SumKey = " + sumKey + " " + "SumValue = " + sumValue);
    }

    public static int inputSth() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
