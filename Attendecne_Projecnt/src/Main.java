import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.HashMap;
import java.util.Map;

public class ClassroomAttendanceGUI extends Application {
    private final Map<Student, Map<Subject, Integer>> attendance = new HashMap<>();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Classroom Attendance System");

        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(20, 20, 20, 20));

        // GUI components
        TextField studentNameField = new TextField();
        studentNameField.setPromptText("Student Name");

        TextField studentIdField = new TextField();
        studentIdField.setPromptText("Student ID");

        TextField subjectNameField = new TextField();
        subjectNameField.setPromptText("Subject Name");

        TextField subjectCodeField = new TextField();
        subjectCodeField.setPromptText("Subject Code");

        TextField attendancePercentField = new TextField();
        attendancePercentField.setPromptText("Attendance Percentage");

        Button markAttendanceButton = new Button("Mark Attendance");

        ComboBox<Student> studentComboBox = new ComboBox<>();
        ComboBox<Subject> subjectComboBox = new ComboBox<>();

        Button displaySubjectAttendanceButton = new Button("Display Subject Attendance");
        Button displayAverageAttendanceButton = new Button("Display Average Attendance");

        // Add new student
        Button addStudentButton = new Button("Add Student");
        addStudentButton.setOnAction(e -> {
            String name = studentNameField.getText();
            int id = Integer.parseInt(studentIdField.getText());
            Student student = new Student(name, id);
            attendance.put(student, new HashMap<>());
            studentComboBox.getItems().add(student);
        });

        // Remove a student
        Button removeStudentButton = new Button("Remove Student");
        removeStudentButton.setOnAction(e -> {
            Student selectedStudent = studentComboBox.getValue();
            if (selectedStudent != null) {
                attendance.remove(selectedStudent);
                studentComboBox.getItems().remove(selectedStudent);
            }
        });

        // Mark attendance
        markAttendanceButton.setOnAction(e -> {
            Student selectedStudent = studentComboBox.getValue();
            Subject selectedSubject = subjectComboBox.getValue();
            int attendancePercent = Integer.parseInt(attendancePercentField.getText());

            if (selectedStudent != null && selectedSubject != null) {
                attendance.computeIfAbsent(selectedStudent, k -> new HashMap<>());
                attendance.get(selectedStudent).put(selectedSubject, attendancePercent);
            }
        });

        // Display subject-wise attendance
        displaySubjectAttendanceButton.setOnAction(e -> {
            Subject selectedSubject = subjectComboBox.getValue();
            if (selectedSubject != null) {
                for (Map.Entry<Student, Map<Subject, Integer>> entry : attendance.entrySet()) {
                    Student student = entry.getKey();
                    Integer attendancePercent = entry.getValue().get(selectedSubject);

                    if (attendancePercent != null) {
                        System.out.println("Student: " + student.getName() + ", Attendance: " + attendancePercent + "%");
                    } else {
                        System.out.println("Student: " + student.getName() + ", Attendance: N/A");
                    }
                }
            }
        });

        // Display average attendance
        displayAverageAttendanceButton.setOnAction(e -> {
            // Calculate and display average attendance
        });

        // Add components to the grid
        grid.add(studentNameField, 0, 0);
        grid.add(studentIdField, 1, 0);
        grid.add(subjectNameField, 0, 1);
        grid.add(subjectCodeField, 1, 1);
        grid.add(attendancePercentField, 0, 2);
        grid.add(markAttendanceButton, 1, 2);
        grid.add(studentComboBox, 0, 3);
        grid.add(subjectComboBox, 1, 3);
        grid.add(displaySubjectAttendanceButton, 0, 4);
        grid.add(displayAverageAttendanceButton, 1, 4);
        grid.add(addStudentButton, 0, 5);
        grid.add(removeStudentButton, 1, 5);

        Scene scene = new Scene(grid, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Other classes (Student, Subject, AttendanceTracker) remain the same as in the previous example.
}
