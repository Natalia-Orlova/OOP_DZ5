package lesson5;

import java.util.List;

public class View {
    public void printFullList(Attendance attendance) {
        System.out.println("Посещаемость всех студентов в %: ");
        for (Student student : attendance.getStudents()) {
            System.out.println(student + "Посещаемость: "
                    + student.getAttendancePercent() + "% \n");
        }
    }

    public void printLess25(Attendance attendance) {
        System.out.println("Студенты с посещаемостью 25% и ниже: ");
        for (Student student : attendance.getStudents()) {
            if (student.getAttendancePercent() <= 25) {
                System.out.println(student + "Посещаемость: "
                        + student.getAttendancePercent() + "%");
            }
        }
    }

    public void
}
