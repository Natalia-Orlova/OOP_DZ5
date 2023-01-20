package lesson5.Core.Models;

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
        return 0;
    }
}
