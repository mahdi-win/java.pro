public class Main {
    public static void main(String[] args) {
        // ایجاد استاد
        Professor prof1 = new Professor("Dr. Ali", "P101");

        // ایجاد دانشجو
        Student st1 = new Student("Mohammad", "S123");
        Student st2 = new Student("Zahra", "S124");

        // ایجاد درس‌ها
        Course c1 = new Course("C101", "Java Programming", 3);
        Course c2 = new Course("C102", "Database", 2);

        // اختصاص درس به استاد
        prof1.addCourse(c1);
        prof1.addCourse(c2);

        // انتخاب واحد دانشجو
        st1.addCourse(c1);
        st1.addCourse(c2);

        st2.addCourse(c2);

        // نمایش اطلاعات
        prof1.showInfo();
        prof1.showCourses();

        System.out.println("----------");

        st1.showInfo();
        st1.showCourses();

        System.out.println("----------");

        st2.showInfo();
        st2.showCourses();
        Menu menu = new Menu();
        menu.first();
    }
}
