import java.util.ArrayList;

public class Department {
    private String name;
    private ArrayList<Student> students;
    private ArrayList<Professor> professors;

    public Department(String name) {
        this.name = name;
        this.students = new ArrayList<>();
        this.professors = new ArrayList<>();
    }

    public String getName() { return name; }

    public void addStudent(Student s) {
        students.add(s);
    }

    public void addProfessor(Professor p) {
        professors.add(p);
    }

    public void showDepartmentInfo() {
        System.out.println("=== Department: " + name + " ===");

        System.out.println(" Professors:");
        for (Professor p : professors) {
            System.out.println("   " + p.name);
        }

        System.out.println(" Students:");
        for (Student s : students) {
            System.out.println("   " + s.name);
        }
    }
}

