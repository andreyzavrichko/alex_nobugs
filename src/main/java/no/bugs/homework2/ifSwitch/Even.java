package no.bugs.homework2.ifSwitch;

import java.util.Scanner;

public class Even {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите число: ");
        int a = sc.nextInt();
        checkEven(a);

        sc.close();

    }

    /**
     * Задача 1: Проверка чётности числа
     * Напишите программу, которая проверяет, является ли число чётным или нечётным.
     */

    public static void checkEven(int a) {
        if (a % 2 == 0) {
            System.out.println("Результат: четное");
        } else {
            System.out.println("Результат: нечетное");
        }


    }


}
