package no.bugs.homework2.nestedLoop;

import java.util.Scanner;

public class Multiplicationv2 {
    /**
     Задача 1: Таблица умножения
     Выведите таблицу умножения от 1 до 10 в формате:

     */
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
        }
    }

}
