package no.bugs.homework4.structure;

import java.util.HashMap;
import java.util.Map;

// Задача 7: Словари (Maps)
public class Maps {
    public static void main(String[] args) {
        String str = "Subbmit";
        System.out.println(countCharOccurrences(str));

    }

    static Map<Character, Integer> countCharOccurrences(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        return map;
    }


}
