import java.time.Year;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("Задача1");

        int desiredSum = 2_459_000;
        int sum = 0;
        int amount = 15_000;
        double percent = 1D / 100;
        int month = 0;
        while (sum < desiredSum) {
            sum += amount;
            sum = (int) (sum * (1 + percent));
            month++;
            System.out.println("Месяц " + month + "сумма накоплений равна " + sum + "рублей");
        }
        System.out.println("Задача2");
        int number = 1;
        while (number < 10) {
            number++;
            System.out.println(number + "");
        }
        for (; number >= 1; number--) {
            System.out.println(number + "");
        }
        System.out.println("задача 3");
        int population = 12_000_000;
        int fertilityPerThousand = 17;
        int mortalityPerThousand = 8;
        int currentYear = 2024;
        for (int year = currentYear; year < currentYear + 10; year++) {
            population += population * fertilityPerThousand / 1000 - population * mortalityPerThousand / 1000;
            System.out.println("Год " + year + "численность населения составляет" + population);
        }
        System.out.println("Задача4");
        percent = 7D / 100;
        desiredSum = 12_000_000;
        sum = amount;
        month = 0;
        while (sum < desiredSum) {
            sum = (int) (sum * (1 + percent));
            month++;
            System.out.println("Месяц " + month + "сумма накоплений равна " + sum + "рублей");
        }
        System.out.println("Задача5");
        sum = amount;
        month = 0;
        while (sum < desiredSum) {
            sum = (int) (sum * (1 + percent));
            month++;
            if (month % 6 == 0)
                System.out.println("Месяц " + month + "сумма накоплений равна " + sum + "рублей");
        }
        System.out.println("Задача6");
        sum = amount;
        month = 0;
        int months = 12 * 9;
        while (month < months) {
            sum = (int) (sum * (1 + percent));
            month++;
            if (month % 6 == 0)
                System.out.println("Месяц " + month + "сумма накоплений равна " + sum + "рублей");
        }
        System.out.println("Задача7");
        int firstFriday = 3;
        for (int day = firstFriday; day <= 31; day += 7) {
            System.out.println("Сегодня пятница, " + day + "-e число. Необходимо подготовить отчет");
        }
        System.out.println("Задача8");
        int period = 79;
        int startSeeing = 0;
        int start = currentYear - 200;
        int end = currentYear + 100;
        for (int year = startSeeing; year < end; year+=period) {
            if (year > start) {
                System.out.println(year);
            }


        }

    }
}