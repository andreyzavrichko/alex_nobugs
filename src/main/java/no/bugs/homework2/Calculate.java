package no.bugs.homework2;

import java.util.Scanner;

public class Calculate {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите число a: ");
        int a = sc.nextInt();
        System.out.print("Введите число b: ");
        int b = sc.nextInt();

        calculate(a, b);
        sc.close();

    }

/**
Задача 1: Сложение и вычитание чисел
Напишите программу, которая принимает два числа с консоли, складывает их и выводит разность.
 */

    public static void calculate(int a, int b) {
        int sum = a + b;
        int diff = a - b;
        System.out.println("Сумма: " + sum);
        System.out.println("Разность: " + diff);
    }


}
