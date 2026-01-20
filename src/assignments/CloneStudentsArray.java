package assignments;
// حل السؤال رقم 1
public class CloneStudentsArray {

    public static void main(String[] args) {

        // المصفوفة الأصلية
        String[] originalStudents = {
                "سارة",
                "فاطمة",
                "نورة",
                "ريم",
                "أمل"
        };

        // إنشاء مصفوفة جديدة بنفس الحجم
        String[] clonedStudents = new String[originalStudents.length];

        // استنساخ المصفوفة باستخدام حلقة for
        for (int i = 0; i < originalStudents.length; i++) {
            clonedStudents[i] = originalStudents[i];
        }

        // تغيير عنصر في النسخة للتأكد أن الأصل لم يتأثر
        clonedStudents[0] = "هند";

        // طباعة المصفوفة الأصلية
        System.out.println("المصفوفة الأصلية:");
        for (String name : originalStudents) {
            System.out.println(name);
        }

        // طباعة المصفوفة المستنسخة
        System.out.println("\nالمصفوفة المستنسخة:");
        for (String name : clonedStudents) {
            System.out.println(name);
        }
    }
}


