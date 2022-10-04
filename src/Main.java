public class Main {
    public static void main(String[] args) {
        // Циклы. Часть 2. Домашнее задание 2. Задание 4
        System.out.println("Циклы. Часть 2. Домашнее задание 2. Задание 4");
        int friday = 4;
        int date = 1;
        while (date < 31) {
            date = date + 1;
            if (date == friday) {
                System.out.println("Сегодня пятница, " + date + " число. Необходимо подготовить отчет");
                friday = friday + 7;
            }
        }
    }
}
