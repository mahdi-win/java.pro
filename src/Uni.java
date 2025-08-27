import java.util.ArrayList;
import java.util.List;
public class Uni {
    public static final String UNIVERSITY_NAME = "Tehran University"; // اسم ثابت
    public static final List<Faculty> faculties = new ArrayList<>();  // لیست دانشکده‌ها

    // متد برای نمایش اطلاعات
    public static void showInfo() {
        System.out.println("University: " + UNIVERSITY_NAME);
        for (Faculty f : faculties) {
            f.showFacultyInfo();
        }
    }
}