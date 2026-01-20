package assignments;
// حل السؤال رقم 3
public class RemoveStudentFromArray {

    public static void main(String[] args) {

        // المصفوفة الأصلية
        String[] students = {
                "سارة",
                "فاطمة",
                "نورة",
                "ريم",
                "أمل"
        };

        String nameToRemove = "نورة";

        // عدّ العناصر التي لن تُحذف
        int newSize = 0;
        for (String name : students) {
            if (!name.equals(nameToRemove)) {
                newSize++;
            }
        }

        // إنشاء مصفوفة جديدة بالحجم الصحيح
        String[] newStudents = new String[newSize];

        // نسخ العناصر (بدون الاسم المطلوب)
        int index = 0;
        for (String name : students) {
            if (!name.equals(nameToRemove)) {
                newStudents[index] = name;
                index++;
            }
        }

        // طباعة المصفوفة بعد الحذف
        System.out.println("المصفوفة بعد حذف \"" + nameToRemove + "\":");
        for (String name : newStudents) {
            System.out.println(name);
        }
    }
}

