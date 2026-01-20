package assignments;
// حل السؤال رقم 7
public class SearchInLinkedList {

    // تعريف العقدة
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // دالة البحث عن عنصر وإرجاع موقعه
    public static int search(Node head, int target) {

        int index = 0;
        Node current = head;

        while (current != null) {
            if (current.data == target) {
                return index;   // تم العثور
            }
            current = current.next;
            index++;
        }

        return -1; // لم يتم العثور على العنصر
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

        // إنشاء القائمة: 10 -> 20 -> 30 -> 40
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        printList(head);

        int valueToSearch = 30;

        int position = search(head, valueToSearch);

        if (position != -1) {
            System.out.println("العنصر " + valueToSearch +
                    " موجود في الموقع: " + position);
        } else {
            System.out.println("العنصر غير موجود في القائمة");
        }
    }
}


