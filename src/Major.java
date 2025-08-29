import java.util.ArrayList;
import java.util.List;
//test
public class Major {
    private String name;
    private Department department;
    private List<Student> students;

    public Major(String name, Department department) {
        this.name = name;
        this.department = department;
        this.students = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addStudent(Student s) {
        students.add(s);
    }
}
