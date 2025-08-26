import java.util.ArrayList;

public class Faculty {
    private String name;
    private ArrayList<Department> departments;

    public Faculty(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public String getName() {

        return name;
    }

    public void addDepartment(Department d) {
        departments.add(d);
    }

    public void showFacultyInfo() {
        System.out.println("=== Faculty: " + name + " ===");
        for (Department d : departments) {
            d.showDepartmentInfo();
        }
    }
}
