package assignments2;
// حل السؤال 5
import java.util.LinkedList;
import java.util.Queue;

public class MergeSortedQueues {

    // دالة دمج طابورين مفروزين
    public static Queue<Integer> mergeQueues(Queue<Integer> q1, Queue<Integer> q2) {

        Queue<Integer> result = new LinkedList<>();

        // دمج طالما الطابورين غير فارغين
        while (!q1.isEmpty() && !q2.isEmpty()) {

            if (q1.peek() <= q2.peek()) {
                result.add(q1.remove());
            } else {
                result.add(q2.remove());
            }
        }

        // إضافة العناصر المتبقية
        while (!q1.isEmpty()) {
            result.add(q1.remove());
        }

        while (!q2.isEmpty()) {
            result.add(q2.remove());
        }

        return result;
    }

    // دالة main للتجربة
    public static void main(String[] args) {

        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        // الطابور الأول (مفروز)
        q1.add(1);
        q1.add(3);
        q1.add(5);
        q1.add(7);

        // الطابور الثاني (مفروز)
        q2.add(2);
        q2.add(4);
        q2.add(6);
        q2.add(8);

        System.out.println("الطابور الأول: " + q1);
        System.out.println("الطابور الثاني: " + q2);

        Queue<Integer> mergedQueue = mergeQueues(q1, q2);

        System.out.println("الطابور بعد الدمج (مفروز): " + mergedQueue);
    }
}

