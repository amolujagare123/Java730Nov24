package CollectionsDemo.Queue;

import java.util.PriorityQueue;

public class PriorityQueDemo {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(23);
        pq.offer(33);
        pq.offer(25);
        pq.offer(43);
        pq.offer(27);
        System.out.println(pq); // 23,25,27,33,43
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());



    }

}
