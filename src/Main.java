public class Main {
    public static void main(String[] args) {
        // Циклы. Часть 2. Домашнее задание 1. Задание 1
        System.out.println("Циклы. Часть 2. Домашнее задание 1. Задание 1");
        int salary = 15_000;
        int total = 0;
        int month = 0;
        while (total < 2_459_000) {
            total = total + total / 100;
            total = total + salary;
            month = month + 1;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }

    }
}