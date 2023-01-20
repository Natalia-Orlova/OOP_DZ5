package lesson5.Client;

import lesson5.Core.Infrastructure.Attendance;
import lesson5.Core.Models.Student;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
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
        System.out.println(log);
        System.out.println(log.get(1));

        Map<String, Integer> items = new HashMap<>();
        int count = 0;
        int countItems = 0;
        items.put("coins", 3);
        items.put("pens", 2);
        items.put("keys", 1);
        items.put("sheets", 3);
        for (Integer v : items.values()) {
            if (v == 3) {
                count++;
            }
            countItems++;
        }
        int aver = (count / ) * 100;
        System.out.println(aver + "%");
//        items.forEach((k, v) -> {
//            System.out.printf("%s : %d%n", k, v);
//        });
    }
}
