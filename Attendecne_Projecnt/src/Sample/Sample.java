import java.util.HashMap;
import java.util.Map;

public class AttendanceTracker {
    private Map<Student, Map<Subject, Integer>> attendance;

    public AttendanceTracker() {
        this.attendance = new HashMap<>();
    }

    public void markAttendance(Student student, Subject subject, int attendancePercentage) {
        attendance.computeIfAbsent(student, k -> new HashMap<>());
        attendance.get(student).put(subject, attendancePercentage);
    }

    public void displaySubjectAttendance(Subject subject) {
        for (Map.Entry<Student, Map<Subject, Integer>> entry : attendance.entrySet()) {
            Student student = entry.getKey();
            Integer attendancePercentage = entry.getValue().get(subject);

            if (attendancePercentage != null) {
                System.out.println("Student: " + student.getName() + ", Attendance: " + attendancePercentage + "%");
            } else {
                System.out.println("Student: " + student.getName() + ", Attendance: N/A");
            }
        }
    }

    // Other methods for calculating average attendance, adding/removing students, etc.
}
