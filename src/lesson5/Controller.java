package lesson5;

import com.sun.jdi.connect.AttachingConnector;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Controller {
    public static void buttonClick(){
        View view = new View();

        HashMap<LocalDate, Boolean> attendance1 = new HashMap<>();
        attendance1.put(LocalDate.of(2023,1,5), true);
        attendance1.put(LocalDate.of(2023,1,10), false);
        attendance1.put(LocalDate.of(2023,1,15), false);
        attendance1.put(LocalDate.of(2023,1,20), true);

        HashMap<LocalDate, Boolean> attendance2 = new HashMap<>();
        attendance2.put(LocalDate.of(2023,1,5), true);
        attendance2.put(LocalDate.of(2023,1,10), false);
        attendance2.put(LocalDate.of(2023,1,15), false);
        attendance2.put(LocalDate.of(2023,1,20), false);

        HashMap<LocalDate, Boolean> attendance3 = new HashMap<>();
        attendance3.put(LocalDate.of(2023,1,5), true);
        attendance3.put(LocalDate.of(2023,1,10), false);
        attendance3.put(LocalDate.of(2023,1,15), true);
        attendance3.put(LocalDate.of(2023,1,20), true);


        List<Student> log = Arrays.asList(
                new Student ("Ivan", "Ivanov", attendance1),
                new Student ("Pavel", "Stepanov", attendance2),
                new Student ("Petr", "Pavlov", attendance3)
        );

        Attendance attendance = new Attendance(log);

        try (Scanner in = new Scanner(System.in)) {

            while (true) {
                System.out.println(" 1 - Список всех студентов и посещаемость в процентах");
                System.out.println(" 2 - Список студентов с посещаемостью 25% и ниже");
                System.out.println(" 3 - Список всех студентов, отсортированный по посещаемости");
                String key = in.next();
                System.out.print("\033[H\033[J");
                switch (key) {
                    case "1":
                        view.printFullList(attendance);
                        break;
                    case "2":
                        view.printLess25(attendance);
                        break;

                    default:
                        System.out.println("Такой команды нет");
                        break;
                }
            }
        }
    }
}
