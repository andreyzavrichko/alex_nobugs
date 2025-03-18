package no.bugs.homework2.baseOperation;

import java.util.Scanner;

public class Division {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int a = sc.nextInt();
        System.out.print("Введите второе число: ");
        int b = sc.nextInt();

        division(a, b);

        sc.close();

    }

/**
 Задача 3: Операции с остатком от деления
 Запросите у пользователя два числа и выведите результат их деления и остаток от деления.

 */

    public static void division(int a, int b) {
        int div = a / b;
        int residue = a % b;
        System.out.println("Результат деления: " + div);
        System.out.println("Остаток: " + residue);

    }


}
