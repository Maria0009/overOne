package lessons.lesson_13.homeWork;

import java.util.Arrays;

public class Example {
    public static void main(String[] args) {
//        int[] mass=new int[]{1,2,3,4,5};
//        int num=3;
//        multiArray(mass,3);
//        System.out.println(Arrays.toString(mass));

//        String strr="Hello5565";
//        int a= lengthStr(strr);
//        System.out.println(a);

        int[] arr1=new int[]{1,2,3,4,5};
        int[] arr2=new int[]{5,2,7,4,8};
        System.out.println(Arrays.toString(combineArrays(arr1, arr2)));
    }
//    static void multiArray(int[] array, int number){
//        for (int i = 0; i < array.length; i++) {
//            array[i]*=number;
//        }
//    }

//    static int lengthStr(String str){
//        int length=str.length();
//        return length;
//    }

    static int[] combineArrays(int[]arrayFirst, int[] arraySecond){
        int[] arrayCombine=new int[arrayFirst.length+arraySecond.length];
        int k=0;
            for (int i = 0; i < arrayFirst.length; i++) {
                arrayCombine[k]=arrayFirst[i];
                k++;
            }
        for (int j = 0; j < arraySecond.length; j++) {
            arrayCombine[k]=arraySecond[j];
            k++;
        }
        return arrayCombine;
        }
    }

