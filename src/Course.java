public class Course {
    public String courseId;
    public String title;
    public int unit;

    public Course(String courseId, String title, int unit) {
        this.courseId = courseId;
        this.title = title;
        this.unit = unit;
    }

    public String getTitle() {
        return title;
    }
}
