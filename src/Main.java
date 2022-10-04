public class Main {
    public static void main(String[] args) {
        // Циклы. Часть 2. Домашнее задание 3. Задание 1
        System.out.println("Циклы. Часть 2. Домашнее задание 3. Задание 1");
        int yearStart = 2022;
        int yearUntil = yearStart - 200;
        int yearAfter = yearStart + 100;
        int year = 0;
        while (year <= yearAfter) {
            year = year + 1;
            if (year <= yearAfter && year >= yearUntil) {
                if (year % 79 == 0) {
                    System.out.println(year);
                }
            }

        }
    }

}


