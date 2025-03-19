package no.bugs.homework2.ifSwitch;

import java.util.Scanner;

public class Age {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите возраст: ");
        int a = sc.nextInt();

        age(a);

        sc.close();

    }

    /**
     * Задача 4: Проверка возраста
     * Напишите программу, которая определяет категорию человека по возрасту:
     */

    public static void age(int age) {
        if (age <= 12) {
            System.out.println("Результат: Ребёнок");
        } else if (age <= 17) {
            System.out.println("Результат: Подросток");
        } else if (age <= 64) {
            System.out.println("Результат: Взрослый");
        } else {
            System.out.println("Результат: Пенсионер");
        }
    }
}
