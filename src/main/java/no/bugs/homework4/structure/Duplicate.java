package no.bugs.homework4.structure;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Задача 3: Удаление дубликатов
public class Duplicate {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(10,20,20,30,30,40,50));
        System.out.println(removeDuplicate(list));
    }


    static Set<Integer> removeDuplicate(List<Integer> list){
        return new HashSet<>(list);
    }

}
