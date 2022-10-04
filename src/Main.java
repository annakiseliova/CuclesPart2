public class Main {
    public static void main(String[] args) {
        // Циклы. Часть 2. Домашнее задание 1. Задание 3
        System.out.println("Циклы. Часть 2. Домашнее задание 1. Задание 3");
        int population = 12_000_000;
        int fertilityPerOneThousand = 17;
        int mortalityPerOneThousand  = 8;
        int year = 1;
        int fertilityPerYear = (population/1000)*fertilityPerOneThousand;
        int mortalityPerYear = (population/1000)*mortalityPerOneThousand;
        while (year <= 10) {
            population = population + fertilityPerYear - mortalityPerYear;
            System.out.println("Год " + year + ", численность населения составляет " + population);
            year = year + 1;
        }
    }
}