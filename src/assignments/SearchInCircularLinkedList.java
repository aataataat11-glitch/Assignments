package assignments;

// حل السؤال رقم 15
public class SearchInCircularLinkedList {

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

        // إذا كانت القائمة فارغة
        if (head == null) {
            return -1;
        }

        Node current = head;
        int index = 0;

        // استخدام do-while لأن القائمة دائرية
        do {
            if (current.data == target) {
                return index; // تم العثور على العنصر
            }
            current = current.next;
            index++;
        } while (current != head);

        return -1; // لم يتم العثور على العنصر
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
        head = insertAtEnd(head, 10);
        head = insertAtEnd(head, 20);
        head = insertAtEnd(head, 30);

        printList(head);

        int valueToSearch = 20;

        int position = search(head, valueToSearch);

        if (position != -1) {
            System.out.println("العنصر " + valueToSearch +
                    " موجود في الموقع: " + position);
        } else {
            System.out.println("العنصر غير موجود في القائمة");
        }
    }

    // دالة مساعدة للإدراج في نهاية القائمة الدائرية
    public static Node insertAtEnd(Node head, int data) {

        Node newNode = new Node(data);

        if (head == null) {
            newNode.next = newNode;
            return newNode;
        }

        Node current = head;
        while (current.next != head) {
            current = current.next;
        }

        current.next = newNode;
        newNode.next = head;

        return head;
    }
}

