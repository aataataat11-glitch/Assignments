package assignments2;
//حل السؤال 4


import java.util.PriorityQueue;

public class PriorityQueu {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // إدخال العناصر
        pq.add(30);
        pq.add(10);
        pq.add(50);
        pq.add(20);
        pq.add(40);

        System.out.println("إخراج العناصر حسب الأولوية (الأصغر أولاً):");

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}


