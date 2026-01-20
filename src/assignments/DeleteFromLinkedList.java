package assignments;
//حل السؤال رقم 9
public class DeleteFromLinkedList {

    // تعريف العقدة
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // دالة حذف عنصر من موقع محدد
    public static Node deleteAtPosition(Node head, int position) {

        // إذا كانت القائمة فارغة
        if (head == null) {
            return null;
        }

        // إذا كان الحذف من البداية (index 0)
        if (position == 0) {
            return head.next;
        }

        Node current = head;

        // الوصول إلى العقدة التي قبل الموقع المطلوب
        for (int i = 0; i < position - 1; i++) {

            // إذا تجاوزنا طول القائمة
            if (current.next == null) {
                return head;
            }

            current = current.next;
        }

        // حذف العقدة
        if (current.next != null) {
            current.next = current.next.next;
        }

        return head;
    }

    // دالة طباعة القائمة
    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // دالة main
    public static void main(String[] args) {

        // إنشاء القائمة: 10 -> 20 -> 30 -> 40 -> 50
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        System.out.println("القائمة قبل الحذف:");
        printList(head);

        int positionToDelete = 2; // حذف العنصر في الموقع 2 (30)

        head = deleteAtPosition(head, positionToDelete);

        System.out.println("القائمة بعد الحذف من الموقع " + positionToDelete + ":");
        printList(head);
    }
}


