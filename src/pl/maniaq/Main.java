package pl.maniaq;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

interface Gretting {
    void hello();
}

public class Main {

    public static void main(String[] args) {
        Gretting gretting = new Gretting() {
            @Override
            public void hello() {
                System.out.println("Hello world!");
            }
        };

        List<String> names = new LinkedList<>(Arrays.asList("XYZ", "PABLO", "GETO", "GORGEU"));

        names.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });

        System.out.println(names);

        names.sort((s1, s2) -> s1.compareToIgnoreCase(s2));

        List<Student> students = new LinkedList<>(Arrays.asList(
                new Student(1L, "Pablo", "Escabo"),
                new Student(2L, "Gorgeu", "Tury"),
                new Student(3L, "Geto", "Urlo")
        ));

        final Long searchStudentId = 1L;

        for(Student student : students) {
            if(student.getId().equals(searchStudentId)) {
                System.out.println(student);
                break;
            }
        }

        final Student foundStudent = students.stream()
                .filter(student -> student.getId().equals(searchStudentId))
                .findFirst()
                .orElse(new Student(1L, "DEFAULT", "DEFAULT"));

        System.out.println(foundStudent);


        Car car = new Car();
        car.drive();
        car.stop();

        Vehicle.vehicleInfo();
    }
}
