package assignments;
// حل السؤال رقم 13
public class InsertInCircularLinkedList {

    // تعريف العقدة
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // دالة الإدراج في موقع محدد
    public static Node insertAtPosition(Node head, int data, int position) {

        Node newNode = new Node(data);

        // إذا كانت القائمة فارغة
        if (head == null) {
            newNode.next = newNode; // تجعلها دائرية
            return newNode;
        }

        // الإدراج في البداية (position = 0)
        if (position == 0) {
            Node current = head;

            // الوصول إلى آخر عقدة
            while (current.next != head) {
                current = current.next;
            }

            current.next = newNode;
            newNode.next = head;
            head = newNode;

            return head;
        }

        // الإدراج في موقع غير البداية
        Node current = head;

        for (int i = 0; i < position - 1; i++) {

            // إذا وصلنا لنهاية الدورة
            if (current.next == head) {
                break;
            }

            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;

        return head;
    }

    // دالة لطباعة القائمة
    public static void printList(Node head) {

        if (head == null) {
            System.out.println("القائمة فارغة");
            return;
        }

        Node current = head;
        do {
            System.out.print(current.data + " -> ");
            current = current.next;
        } while (current != head);

        System.out.println("(عودة إلى الرأس)");
    }

    // دالة main
    public static void main(String[] args) {

        Node head = null;

        // إنشاء قائمة دائرية: 10 -> 20 -> 30 -> (عودة للرأس)
        head = insertAtPosition(head, 10, 0);
        head = insertAtPosition(head, 20, 1);
        head = insertAtPosition(head, 30, 2);

        System.out.println("القائمة قبل الإدراج:");
        printList(head);

        // إدراج 15 في الموقع 1
        head = insertAtPosition(head, 15, 1);

        System.out.println("القائمة بعد الإدراج في الموقع 1:");
        printList(head);
    }
}


