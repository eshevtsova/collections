package simbirsoft.eshevtsova.collections.arraylist;

import simbirsoft.eshevtsova.collections.Student;

import java.util.*;

public class ArraysListExample {

    public static void main(String[] args) {

        List<Student> studentsList = Arrays.asList(
                new Student(1, "Петр", "Григорьев"),
                new Student(54, "Василий", "Васильев"),
                new Student(29, "Григорий", "Петров"),
                new Student(9, "Денис", "Алексеев"));

        Collections.sort(studentsList);
        System.out.println(studentsList);

        List<Integer> integerList = new ArrayList<>();
        integerList.add(85);
        integerList.add(14);
        integerList.add(10);
        integerList.add(96);
        integerList.add(3);
        integerList.add(19);

        Collections.sort(integerList);
        System.out.println(integerList);
        integerList.remove(2);
        System.out.println(integerList);
        System.out.println(integerList.get(0));
    }
}
