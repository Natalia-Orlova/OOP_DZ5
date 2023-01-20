package lesson5;


import java.util.ArrayList;
import java.util.List;


public class Attendance {
    private List<Student> attendanceList;

    public Attendance(List<Student> attendanceList) {
        this.attendanceList = attendanceList;
    }

    public List<Student> getStudents() {
        List<Student> copyStudent = new ArrayList<>();
        for (Student student : attendanceList) {
            copyStudent.add(student);
        }
        return copyStudent;
    }
}
