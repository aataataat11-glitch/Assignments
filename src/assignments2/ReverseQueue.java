package assignments2;
// حل السؤال 3
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {

    // دالة لعكس ترتيب عناصر الطابور
    public static void reverseQueue(Queue<Integer> queue) {

        Stack<Integer> stack = new Stack<>();

        // نقل جميع عناصر الطابور إلى المكدس
        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }

        // إعادة العناصر إلى الطابور (بترتيب معكوس)
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
    }

    // دالة main
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        System.out.println("الطابور قبل العكس:");
        System.out.println(queue);

        reverseQueue(queue);

        System.out.println("الطابور بعد العكس:");
        System.out.println(queue);
    }
}


