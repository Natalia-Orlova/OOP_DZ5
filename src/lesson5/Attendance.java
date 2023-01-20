package lesson5;

import java.util.*;

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

    public void sortAttendanceList (List<Student> attendanceList) {
        int minAttend = attendanceList.get(0).getAttendancePercent();
    }

    public Student getStudent(List<Student> attendanceList, int index) {
        return attendanceList.get(index);
    }


}
