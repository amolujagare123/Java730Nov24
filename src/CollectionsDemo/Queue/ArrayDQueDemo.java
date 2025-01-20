package CollectionsDemo.Queue;

import java.util.ArrayDeque;

public class ArrayDQueDemo {

    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();
        adq.offer(12);
        adq.offer(32);
        adq.offer(14);
        adq.offer(52);
        adq.offer(16);
        adq.offer(72);

        System.out.println(adq);

        adq.offerFirst(0);
        adq.offerLast(100);

        System.out.println(adq);

        adq.removeFirst();
        adq.removeLast();

        System.out.println(adq);

    }
}
