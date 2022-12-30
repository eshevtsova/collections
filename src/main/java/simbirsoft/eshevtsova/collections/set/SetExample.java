package simbirsoft.eshevtsova.collections.set;

import simbirsoft.eshevtsova.collections.Student;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

    public static void main(String[] args) {

        Set<Student> studentList2 = new LinkedHashSet<>();
        studentList2.add(new Student(23, "Сергей", "Зиновьев"));
        studentList2.add(new Student(5, "Алена", "Галкина"));
        studentList2.add(new Student(1, "Василий", "Матроскин"));
        studentList2.add(new Student(76, "Галина", "Баночкина"));

        Set<Student> studentList3 = new TreeSet<>();
        studentList3.add(new Student(14, "Петр", "Грозный"));
        studentList3.add(new Student(2, "Анна", "Веревкина"));
        studentList3.add(new Student(2, "Василиса", "Петрова"));
        studentList3.add(new Student(89, "Дмитрий", "Дроздов"));
        studentList3.add(new Student(35, "Галина", "Сидорова"));
        studentList3.add(new Student(89, "Василий", "Морозов"));

        for (Student std : studentList2) {
            System.out.println(std);
        }

        System.out.println(studentList2.size());
        studentList2.remove(studentList2.toArray()[0]);

        for (Student std : studentList2) {
            System.out.println(std);
        }

        System.out.println(studentList2.size());

        for (Student std : studentList3) {
            System.out.println(std);
        }

        boolean isEmpty = studentList3.isEmpty();
        if (isEmpty == false) {
            System.out.println("Список непустой");
        } else {
            System.out.println("Список пустой");
        }
    }
}
