package lesson5;

import java.time.LocalDate;
import java.util.HashMap;

public class Student implements Comparable<Student> {
    private String name;
    private String surname;
    private HashMap<LocalDate, Boolean> attendance;

    public Student(String name, String surname, HashMap<LocalDate, Boolean> attendance) {
        this.name = name;
        this.surname = surname;
        this.attendance = attendance;
    }

    public int getAttendancePercent () {
        int average;
        int visitedLessons = 0;
        for (boolean v : attendance.values()) {
            if (v == true) {
                visitedLessons++;
            }
        }
        average = visitedLessons * 100 / attendance.size();
        return average;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public HashMap<LocalDate, Boolean> getAttendance() {
        return attendance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAttendance(HashMap<LocalDate, Boolean> attendance) {
        this.attendance = attendance;
    }

    @Override
    public String toString() {
        return "Student[" + name + ", " + surname + ", " +
                "attendance: " + attendance +
                "]\n";
    }


    @Override
    public int compareTo(Student o) {
        return getAttendancePercent() - o.getAttendancePercent();
    }
}
