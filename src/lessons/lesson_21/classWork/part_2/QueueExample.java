package lessons.lesson_21.classWork.part_2;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        //add example
        Queue<Integer> myPriorityQueue = new PriorityQueue<Integer>();

        myPriorityQueue.add(1);
        myPriorityQueue.add(2);
        myPriorityQueue.add(3);
        for (int pq : myPriorityQueue) {
            System.out.println(pq);
        }

        //remove example
        System.out.println("remove example");
//        myPriorityQueue.remove();
//        System.out.println("After removing:");
//        System.out.println(myPriorityQueue);

        //poll example
        System.out.println("poll example");
//        myPriorityQueue.poll();
//        System.out.println("After removing:");
//        System.out.println(myPriorityQueue);


        //remove(Object o) example
        System.out.println("remove(Object o) example");
//        myPriorityQueue.remove(2);
//        System.out.println("After removing:");
//        System.out.println(myPriorityQueue);

        //remove() and poll() difference:
        System.out.println("remove() and poll() difference");
//        Queue<Integer> mySecondPriorityQueue = new PriorityQueue<>();

//        mySecondPriorityQueue.remove();
//        mySecondPriorityQueue.poll();


        //offer() example
   /*     System.out.println("offer() example");
        Queue<Integer> myThirdPriorityQueue = new PriorityQueue<>();
        myThirdPriorityQueue.add(1);
        myThirdPriorityQueue.add(2);
        myThirdPriorityQueue.add(3);
        myThirdPriorityQueue.offer(22);
        System.out.println(myThirdPriorityQueue);
        System.out.println("full queue example");
        Queue<Integer> myFourthPriorityQueue = new LinkedBlockingQueue<>(3);
        if (myFourthPriorityQueue.offer(10))
            System.out.println("The Queue is not full"
                    + " and 10 is inserted");
        else
            System.out.println("The Queue is full");
        if (myFourthPriorityQueue.offer(15))
            System.out.println("The Queue is not full"
                    + " and 15 is inserted");
        else
            System.out.println("The Queue is full");
        if (myFourthPriorityQueue.offer(25))
            System.out.println("The Queue is not full"
                    + " and 25 is inserted");
        else
            System.out.println("The Queue is full");
        if (myFourthPriorityQueue.offer(20))
            System.out.println("The Queue is not full"
                    + " and 20 is inserted");
        else
            System.out.println("The Queue is full");
        System.out.println("offer() - full queue: " + myFourthPriorityQueue);
        */

        //peek() example
//        System.out.println(" peek() example");
//        PriorityQueue<Integer> myFifthPriorityQueue = new PriorityQueue<Integer>();
//
//        myFifthPriorityQueue.add(1);
//        myFifthPriorityQueue.add(2);
//        myFifthPriorityQueue.add(3);
//
//        System.out.println(myFifthPriorityQueue.peek());
//        System.out.println(myFifthPriorityQueue);
//
//        //element() example - throws exceptions on empty queues
//        System.out.println(myFifthPriorityQueue.element());
//        System.out.println(myFifthPriorityQueue);
    }
}
