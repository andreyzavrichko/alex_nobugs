package no.bugs.homework4.structure;

import java.util.ArrayList;
import java.util.List;

// Задача 1: Перевернуть коллекцию
public class ReverseCollections {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(10, 20, 30, 40, 50));
        System.out.println(reverseCollections(list));

    }


    static List<Integer> reverseCollections(List<Integer> list) {
        List<Integer> newList = new ArrayList<>();

        for (int i = list.size() - 1; i >= 0; i--) {
            newList.add(list.get(i));

        }
        return newList;
    }

}
