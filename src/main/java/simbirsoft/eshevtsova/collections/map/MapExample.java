package simbirsoft.eshevtsova.collections.map;

import simbirsoft.eshevtsova.collections.Student;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {

        Student student1 = new Student(23, "Сергей", "Зиновьев");
        Student student2 = new Student(5, "Алена", "Галкина");
        Student student3 = new Student(1, "Василий", "Матроскин");
        Student student4 = new Student(76, "Галина", "Баночкина");

        Map<Integer, Student> studentMap = new HashMap<>();
        studentMap.put(student1.getId(), student1);
        studentMap.put(student2.getId(), student2);
        studentMap.put(student3.getId(), student3);
        studentMap.put(student4.getId(), student4);

        for (Student std : studentMap.values()) {
            System.out.println(std.getFirstName() + " " + std.getLastName());
        }

        for (int key : studentMap.keySet()) {
            System.out.println(key);
        }
    }
}
