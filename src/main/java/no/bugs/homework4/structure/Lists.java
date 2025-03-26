package no.bugs.homework4.structure;

import java.util.ArrayList;
import java.util.List;

// Задача 3: Списки (Lists)
public class Lists {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(even(list));

    }


    static List<Integer> even(List<Integer> list) {
        list.removeIf(num -> num % 2 == 0);
        return list;
    }
}
