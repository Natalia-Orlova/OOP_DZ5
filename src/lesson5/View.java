package lesson5;

import java.util.Collections;
import java.util.List;

public class View {
    public void printFullList(Attendance attendance) {
        System.out.println("ПОСЕЩАЕМОСТЬ ВСЕХ СТУДЕНТОВ В %: ");
        for (Student student : attendance.getStudents()) {
            System.out.println(student + "Посещаемость: "
                    + student.getAttendancePercent() + "% \n");
        }
    }

    public void printLess25(Attendance attendance) {
        System.out.println("СТУДЕНТЫ С ПОСЕЩАЕМОСТЬЮ 25% И НИЖЕ: ");
        for (Student student : attendance.getStudents()) {
            if (student.getAttendancePercent() <= 25) {
                System.out.println(student + "Посещаемость: "
                        + student.getAttendancePercent() + "% \n");
            }
        }
    }

    public void printSortedList(List<Student> students) {
        System.out.println("СПИСОК ВСЕХ СТУДЕНТОВ, ОТСОРТИРОВАННЫЙ ПО ПОСЕЩАЕМОСТИ: ");
        Collections.sort(students);
        Collections.reverse(students);
        for (Student student : students) {
            System.out.println(student + "Посещаемость: "
                    + student.getAttendancePercent() + "% \n");
        }
    }
}
