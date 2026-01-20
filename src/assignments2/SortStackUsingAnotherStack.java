package assignments2;
// حل السؤال 2
import java.util.Stack;

public class SortStackUsingAnotherStack {

    // دالة لفرز المكدس باستخدام مكدس آخر فقط
    public static Stack<Integer> sortStack(Stack<Integer> inputStack) {

        Stack<Integer> tempStack = new Stack<>();

        // طالما المكدس الأصلي غير فارغ
        while (!inputStack.isEmpty()) {

            // إخراج عنصر من المكدس الأصلي
            int temp = inputStack.pop();

            // إعادة العناصر الأكبر إلى المكدس الأصلي
            while (!tempStack.isEmpty() && tempStack.peek() > temp) {
                inputStack.push(tempStack.pop());
            }

            // إدخال العنصر في مكانه الصحيح
            tempStack.push(temp);
        }

        return tempStack;
    }

    // دالة main
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(34);
        stack.push(3);
        stack.push(31);
        stack.push(98);
        stack.push(92);
        stack.push(23);

        System.out.println("المكدس قبل الفرز:");
        System.out.println(stack);

        Stack<Integer> sortedStack = sortStack(stack);

        System.out.println("المكدس بعد الفرز (الأصغر في الأعلى):");
        System.out.println(sortedStack);
    }
}


