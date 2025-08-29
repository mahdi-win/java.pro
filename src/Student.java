import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private ArrayList<Course> courses = new ArrayList<>();
    protected Major primaryMajor;                  // رشته اصلی
    private List<Major> secondaryMajors;        // رشته‌های فرعی (دو رشته‌ای

    public Student(String name, String id, String email, String nationalId, String phoneNumber, String birthDate) {

        super(name, id, email, nationalId, phoneNumber, birthDate);

        this.courses = new ArrayList<>();
    }
    public void addSecondaryMajor(Major major) {
        secondaryMajors.add(major);
    }

    public void addCourse(Course course) {

        courses.add(course);
    }

    public void showCourses() {
        System.out.println("Courses of " + name + ":");
        for (Course c : courses) {
            System.out.println("- " + c.getTitle());
        }
    }
}