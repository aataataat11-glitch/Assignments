package assignments;
// حل السؤال رقم 5
public class MergeLinkedLists {

    // تعريف العقدة (Node)
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // دالة دمج قائمتين مرتبطتين
    public static Node mergeLists(Node head1, Node head2) {

        // إذا كانت القائمة الأولى فارغة
        if (head1 == null) {
            return head2;
        }

        // إذا كانت القائمة الثانية فارغة
        if (head2 == null) {
            return head1;
        }

        // الوصول إلى آخر عقدة في القائمة الأولى
        Node current = head1;
        while (current.next != null) {
            current = current.next;
        }

        // ربط نهاية الأولى ببداية الثانية
        current.next = head2;

        return head1;
    }

    // دالة لطباعة القائمة
    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // دالة main (بداية التنفيذ)
    public static void main(String[] args) {

        // إنشاء القائمة الأولى: 1 -> 2 -> 3
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);

        // إنشاء القائمة الثانية: 4 -> 5 -> 6
        Node head2 = new Node(4);
        head2.next = new Node(5);
        head2.next.next = new Node(6);

        System.out.println("القائمة الأولى:");
        printList(head1);

        System.out.println("القائمة الثانية:");
        printList(head2);

        // دمج القائمتين
        Node mergedHead = mergeLists(head1, head2);

        System.out.println("القائمة بعد الدمج:");
        printList(mergedHead);
    }
}


