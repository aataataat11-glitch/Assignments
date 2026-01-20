package assignments;
// حل السؤال رقم 11
public class ReverseTraverseDoublyLinkedList {

    // تعريف العقدة في القائمة الثنائية
    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    // دالة لطباعة القائمة بشكل عكسي
    public static void printReverse(Node head) {

        // إذا كانت القائمة فارغة
        if (head == null) {
            System.out.println("القائمة فارغة");
            return;
        }

        // الوصول إلى آخر عقدة (tail)
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        // اجتياز القائمة بشكل عكسي
        System.out.println("العناصر من الأخير إلى الأول:");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }

        System.out.println();
    }

    // دالة main
    public static void main(String[] args) {

        // إنشاء قائمة ثنائية: 10 <-> 20 <-> 30 <-> 40
        Node head = new Node(10);

        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);

        // ربط العقد
        head.next = second;
        second.prev = head;

        second.next = third;
        third.prev = second;

        third.next = fourth;
        fourth.prev = third;

        // طباعة القائمة عكسيًا
        printReverse(head);
    }
}


