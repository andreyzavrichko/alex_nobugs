package no.bugs.homework4.structure;

import java.util.HashSet;
import java.util.Set;

// Задача 6: Множества (Sets)
public class Sets {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 3, 5};
        System.out.println(uniqueNumbers(array));

    }

    static int uniqueNumbers(int[] array) {
        Set<Integer> res = new HashSet<>();
        for (int i = 0; i < array.length - 1; i++) {
            res.add(array[i]);
        }
        return res.size();
    }
}
