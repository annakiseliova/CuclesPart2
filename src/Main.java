public class Main {
    public static void main(String[] args) {
        // Циклы. Часть 2. Домашнее задание 2. Задание 2
        System.out.println("Циклы. Часть 2. Домашнее задание 2. Задание 2");
        int contribution = 15_000;
        int month = 1;
        while (contribution <= 12_000_000) {
            contribution = contribution + contribution * 7 / 100;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений " + contribution);
            }
            month = month + 1;
        }
    }
}