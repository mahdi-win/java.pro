import java.util.Scanner;

public class Menu {
    private Scanner sc = new Scanner(System.in);

    public void first() {
        while (true) {
            System.out.println("....[[[Welcome]]]....\n");
            System.out.println("Main Menu");
            System.out.println("1. Admin");
            System.out.println("2. Student");
            System.out.println("3. Person");
            System.out.println("0. Exit");
            System.out.print("Choose: ");

            String choice = sc.nextLine();

            switch (choice) {
                case "1":
                    adminLogin();
                    break;
                case "2":
                    studentMenu();
                    break;
                case "3":
                    personMenu();
                    break;
                case "0":
                    System.out.println("!!End!!");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Wrong option!");
            }
            System.out.println("......");
        }
    }

    private void adminLogin() {
        System.out.print("Enter username: ");
        String username = sc.nextLine().trim();

        System.out.print("Enter password: ");
        String password = sc.nextLine().trim();

        if (username.equals("admin") && password.equals("1234")) {
            System.out.println("Login successful! Welcome Admin.");
            adminMenu();
        } else {
            System.out.println("Login failed! Wrong username or password.");
        }
    }

    // منوی ادمین
    private void adminMenu() {
        while (true) {
            System.out.println("<Admin Menu>");
            System.out.println("1. Add Person");
            System.out.println("0. Back to Main Menu");
            System.out.print("Choose: ");
            String choice = sc.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Person Name: ");
                    String name = sc.nextLine();
                    System.out.print("Person ID: ");
                    String id = sc.nextLine();
                    System.out.print("Person email: ");
                    String email = sc.nextLine();
                    System.out.print("Person nationalId: ");
                    String nationalId = sc.nextLine();
                    System.out.print("Person phoneNumber: ");
                    String phoneNumber = sc.nextLine();
                    System.out.print("Person birthDayt: ");
                    String birthDayt = sc.nextLine();

                    Person p = new Person(name, id, email, nationalId, phoneNumber, birthDayt);
                    System.out.println("***Person added***:");
                    p.showInfo();
                    FileManager.savePerson(p);
                    System.out.println("***Person saved to person.txt***");
                    break;
                case "0":
                    return; // برگشت به منوی اصلی
                default:
                    System.out.println("Wrong option!");
            }
            System.out.println("------");
        }
    }

    public void studentMenu() {
        while (true) {
            System.out.println("<Student Menu>");
            System.out.println("1. Add Student");
            System.out.println("0. Back to Main Menu");
            System.out.print("Choose: ");
            String choice = sc.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Student Name: ");
                    String name = sc.nextLine();
                    System.out.print("Student ID: ");
                    String id = sc.nextLine();
                    System.out.print("Student email: ");
                    String email = sc.nextLine();
                    System.out.print("Student nationalId: ");
                    String nationalId = sc.nextLine();
                    System.out.print("Student phoneNumber: ");
                    String phoneNumber = sc.nextLine();
                    System.out.print("Student brithDayte: ");
                    String brithDayte = sc.nextLine();

                    Student s = new Student(name, id, email, nationalId, phoneNumber, brithDayte );
                    System.out.println("*** Student added ***");
                    s.showInfo();
                    FileManager.saveStudent(s);
                    System.out.println("Student saved to student.txt");
                    break;
                case "0":
                    return;
                default:
                    System.out.println("Wrong option!");
            }
            System.out.println("------");
        }
    }

    public void personMenu() {
        while (true) {
            System.out.println("<Person Menu>");
            System.out.println("1. Add Person");
            System.out.println("0. Back to Main Menu");
            System.out.print("Choose: ");
            String choice = sc.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Person Name: ");
                    String name = sc.nextLine();
                    System.out.print("Person ID: ");
                    String id = sc.nextLine();
                    System.out.print("Person email: ");
                    String email = sc.nextLine();
                    System.out.print("Person nationalId: ");
                    String nationalId = sc.nextLine();
                    System.out.print("Person phoneNumber: ");
                    String phoneNumber = sc.nextLine();
                    System.out.print("Person birthDayt: ");
                    String birthDayt = sc.nextLine();

                    Person p = new Person(name, id, email, nationalId, phoneNumber, birthDayt);
                    System.out.println("Person added:");
                    p.showInfo();
                    FileManager.savePerson(p);
                    System.out.println("Person saved to person.txt");
                    break;
                case "0":
                    return;
                default:
                    System.out.println("Wrong option!");
            }
            System.out.println("------");
        }
    }
}