package javacourse.lesson4;

public class Lesson4 {
    public static void main(String[] args) {

        // Задание 1
        task1();

        //Задание 2
        task2();

        //Задание 3
        task3();

        //Задание 4
        task4();

        //Задача 5
        task5();
    }

    private static void task5() {
        int one = 0;
        int two = 1;
        int result = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print(result + " ");
            result = one + two;
            two = one;
            one = result;
        }
    }

    private static void task4() {
        for (int i = 1; i <= 30; i++) {
            System.out.print(i + ": ");

            if (i % 3 == 0) {
                System.out.print("ping ");
            }
            if (i % 5 == 0) {
                System.out.print("pong");
            }
            System.out.println("");
        }
    }

    private static void task3() {
        int startYear = 2021;
        int minYear = startYear - 200;
        int maxYear = startYear + 100;

        for (int year = minYear; year <= maxYear; year++) {
            if (year % 79 == 0) {
                System.out.println(year);
            }
        }
    }

    private static void task2() {
        int friday = 6;

        for (int i = 1; i <= 31; i++) {
            if (i == friday) {
                System.out.println("Сегодня пятница, " + i + "-ое число. Необходимо подготовить отчет.");
                friday += 7;
            }
        }

        //второй вариант
        for (int friday2 = 6; friday2 <= 31; friday2 += 7) {
            System.out.println("Сегодня пятница, " + friday2 + "-ое число. Необходимо подготовить отчет.");
        }
    }

    private static void task1() {
        int counter = 1;

        while (counter <= 10) {
            System.out.print(counter + " ");
            counter++;
        }

        System.out.println("");

        for (counter = 10; counter >= 1; counter--) {
            System.out.print(counter + " ");
        }

        System.out.println("");
    }
}
