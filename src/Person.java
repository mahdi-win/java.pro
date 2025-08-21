public class Person {
    protected String name;
    protected String id;

    public Person(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public void showInfo() {
        System.out.println("Name: " + name + ", ID: " + id);
    }
}
