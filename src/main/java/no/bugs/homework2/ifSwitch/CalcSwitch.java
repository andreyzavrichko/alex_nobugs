package no.bugs.homework2.ifSwitch;

import java.util.Scanner;

public class CalcSwitch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int a = sc.nextInt();

        System.out.print("Введите оператор (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        System.out.print("Введите второе число: ");
        int b = sc.nextInt();

        calc(a, operator, b);

        sc.close();

    }

    /**
     * Реализуйте простой калькулятор, который выполняет операции +, -, *, /, используя switch.
     */

    public static void calc(int a, char operator, int b) {
        int res = switch (operator) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> a / b;
            default -> 0;
        };
        System.out.println("Результат: " + res);

    }


}
