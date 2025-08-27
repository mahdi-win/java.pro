import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AdminJava extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("University Management System");

        // دکمه‌های منوی اصلی
        Button adminBtn = new Button("Admin Menu");
        Button studentBtn = new Button("Student Menu");
        Button staffBtn = new Button("Staff Menu");
        Button exitBtn = new Button("Exit");

        String buttonStyle = "-fx-font-size: 16px; -fx-text-fill: white; "
                + "-fx-background-color: linear-gradient(to right, #6a11cb, #2575fc); "
                + "-fx-background-radius: 20; -fx-padding: 10 20 10 20;";

        adminBtn.setStyle(buttonStyle);
        studentBtn.setStyle(buttonStyle);
        staffBtn.setStyle(buttonStyle);
        exitBtn.setStyle(buttonStyle);

        // رویدادها
        adminBtn.setOnAction(e -> openAdminMenu(primaryStage));
        studentBtn.setOnAction(e -> openStudentMenu(primaryStage));
        staffBtn.setOnAction(e -> openStaffMenu(primaryStage));
        exitBtn.setOnAction(e -> primaryStage.close());

        VBox vbox = new VBox(20, adminBtn, studentBtn, staffBtn, exitBtn);
        vbox.setAlignment(Pos.CENTER);
        vbox.setStyle("-fx-background-color: linear-gradient(to bottom, #2575fc, #6a11cb);");

        Scene scene = new Scene(vbox, 500, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // منوی ادمین
    private void openAdminMenu(Stage stage) {
        Button addStaff = new Button("Add Staff");
        Button showStaff = new Button("Show Staff List");
        Button back = new Button("Back");

        String buttonStyle = "-fx-font-size: 14px; -fx-text-fill: white; "
                + "-fx-background-color: linear-gradient(to right, #43cea2, #185a9d); "
                + "-fx-background-radius: 20; -fx-padding: 8 15 8 15;";
        addStaff.setStyle(buttonStyle);
        showStaff.setStyle(buttonStyle);
        back.setStyle(buttonStyle);

        // رویدادها
        addStaff.setOnAction(e -> System.out.println("Add Staff clicked"));
        showStaff.setOnAction(e -> System.out.println("Show Staff List clicked"));
        back.setOnAction(e -> start(stage)); // برگرد به منوی اصلی

        VBox vbox = new VBox(15, addStaff, showStaff, back);
        vbox.setAlignment(Pos.CENTER);
        vbox.setStyle("-fx-background-color: linear-gradient(to bottom, #6a11cb, #2575fc);");

        Scene scene = new Scene(vbox, 500, 400);
        stage.setScene(scene);
    }

    // منوی دانشجو
    private void openStudentMenu(Stage stage) {
        Button addStudent = new Button("Add Student");
        Button back = new Button("Back");

        addStudent.setStyle("-fx-font-size: 14px; -fx-text-fill: white; "
                + "-fx-background-color: linear-gradient(to right, #ff758c, #ff7eb3); "
                + "-fx-background-radius: 20; -fx-padding: 8 15 8 15;");
        back.setStyle("-fx-font-size: 14px; -fx-text-fill: white; "
                + "-fx-background-color: linear-gradient(to right, #6a11cb, #2575fc); "
                + "-fx-background-radius: 20; -fx-padding: 8 15 8 15;");

        addStudent.setOnAction(e -> System.out.println("Add Student clicked"));
        back.setOnAction(e -> start(stage));

        VBox vbox = new VBox(15, addStudent, back);
        vbox.setAlignment(Pos.CENTER);
        vbox.setStyle("-fx-background-color: linear-gradient(to bottom, #2575fc, #6a11cb);");

        Scene scene = new Scene(vbox, 500, 400);
        stage.setScene(scene);
    }

    // منوی کارمند
    private void openStaffMenu(Stage stage) {
        Button addProfessor = new Button("Add Professor");
        Button addStudent = new Button("Add Student");
        Button showProfessors = new Button("Show Professor List");
        Button showStudents = new Button("Show Student List");
        Button back = new Button("Back");

        VBox vbox = new VBox(15, addProfessor, addStudent, showProfessors, showStudents, back);
        vbox.setAlignment(Pos.CENTER);
        vbox.setStyle("-fx-background-color: linear-gradient(to bottom, #185a9d, #43cea2);");

        back.setOnAction(e -> start(stage));

        Scene scene = new Scene(vbox, 500, 400);
        stage.setScene(scene);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
