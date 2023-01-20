package lesson5.Core.Infrastructure;

import lesson5.Core.Models.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Attendance {
    private List<Student> attendanceList;

    public Attendance() {
        attendanceList = Arrays.asList();
    }

    public Student getStudent(List<Student> attendanceList, int index) {
        return attendanceList.get(index);
    }


}
