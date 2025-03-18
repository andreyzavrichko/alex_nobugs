package no.bugs.homework2.ifSwitch;

import java.util.Scanner;

public class Season {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите номер месяца: ");
        int a = sc.nextInt();

        season(a);

        sc.close();

    }

    /**
     Задача 3:  Определение времени года
     Пользователь вводит номер месяца (1-12). Выведите название соответствующего времени года, используя switch.

     */

    public static void season(int month) {
        String season = switch (month) {
            case 12, 1, 2 -> "Зима";
            case 3, 4, 5 -> "Весна";
            case 6, 7, 8 -> "Лето";
            case 9, 10, 11 -> "Осень";
            default -> "Ошибка: введите число от 1 до 12.";
        };
        System.out.println("Результат: " + season);

    }


}
