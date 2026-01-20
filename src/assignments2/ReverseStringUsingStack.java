package assignments2;
//حل السؤال 1
import java.util.Stack;

public class ReverseStringUsingStack {

    // دالة لعكس سلسلة نصية باستخدام المكدس
    public static String reverseString(String input) {

        Stack<Character> stack = new Stack<>();

        // دفع كل الأحرف إلى المكدس
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        // بناء السلسلة المعكوسة
        StringBuilder reversed = new StringBuilder();

        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return reversed.toString();
    }

    // دالة main
    public static void main(String[] args) {

        String text = "DataStructures";

        System.out.println("النص الأصلي: " + text);

        String reversedText = reverseString(text);

        System.out.println("النص بعد العكس: " + reversedText);
    }
}


