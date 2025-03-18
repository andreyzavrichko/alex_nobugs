package no.bugs.homework2.ifSwitch;

import java.util.Scanner;

public class Divisibility {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите число: ");
        int a = sc.nextInt();

        divisibility(a);

        sc.close();

    }

    /**
     * Задача 5: Проверка делимости
     * Напишите программу, которая проверяет, делится ли число на 3 и 5 одновременно.   */

    public static void divisibility(int a) {
        if (a % 3 == 0 && a % 5 == 0) {
            System.out.println("Результат: Делится на 3 и 5");
        } else {
            System.out.println("Результат: Не делится на 3 и 5");
        }

    }


}
