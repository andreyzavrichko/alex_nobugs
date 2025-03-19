package no.bugs.homework2.loop;

import java.util.Scanner;

public class Multiplication {
    /**
     * Задача 3: Таблица умножения для числа
     * Пользователь вводит число. Выведите таблицу умножения для этого числа от 1 до 10.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = sc.nextInt();
        sc.close();

        for (int i = 1; i <= 10; i++) {
            System.out.println(a + " x " + i + " = " + (a * i));
        }
    }

}
