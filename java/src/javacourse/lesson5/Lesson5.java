package javacourse.lesson5;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.OptionalInt;

public class Lesson5 {
    public static void main(String[] args) {
        //Задание 1
        task1();
        System.out.println();

        //Задание 2
        task2();
        System.out.println();

        //Задание 3
        task3();
        System.out.println();

        //Задание 4
        task4();
        System.out.println();

        //Задание 5
        task5();
        System.out.println();

        //Задание 6
        task6();
        System.out.println();

        //Задание 7
        task7();
        System.out.println();

        //Задание 8
        task8();
        System.out.println();

        //Задание 9
        task9();
    }

    private static void task9() {
        int[] arr = {-6, 4, 5, -8, 8, 10, 1, -7, 12, 2};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == -2) {
                    System.out.println(arr[i] + " + " + arr[j] + " = - 2");
                }
            }
        }
    }

    private static void task8() {
        int[] arr = {-6, 4, 5, -8, 8, 10, 1, -7, 12, 2};

        for (int i = 0; i < arr.length - 1 && arr[i] + arr[i+1] == -2; i++) {

                System.out.println(arr[i] + " + " + arr[i+1] + " = -2");
        }
    }

    private static void task6() {
        int[] arr = {5, 4, 3, 2, 1};
        int[] arr1 = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr1[arr.length - 1 - i] = arr[i];
        }
        System.out.println(Arrays.toString(arr1));
    }

    private static void task7() {
        int[] arr = {5, 4, 3, 2, 1};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void task5() {
        int[][] arr = {{1, 0, 1}, {0, 1, 0}, {1, 0, 1}};

        for (int i = 0; i < arr[0].length; i++){
            for (int j = 0; j < arr[1].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int[] row : arr) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }

    private static void task4() {
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println("");
    }

    private static void task3() {
        int[] arr = generateRandomArray();
        int sum = 0;
        float average = 0;

        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }

        average = sum / 30;

        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей.");
    }

    private static void task2() {
        int[] arr = generateRandomArray();
        int min = 0;
        int max = 0;

        min = Arrays.stream(arr).min().getAsInt();
        max = Arrays.stream(arr).max().getAsInt();
        System.out.println("Минимальная трата " + min);
        System.out.println("Максимальная трата " + max);

        System.out.println();

        int minCycle = arr[0];
        int maxCycle = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minCycle) minCycle = arr[i];
            if (arr[i] > maxCycle) maxCycle = arr[i];
        }

        System.out.println("Минимальная трата " + minCycle);
        System.out.println("Максимальная трата " + maxCycle);
    }

    private static void task1() {
        int[] arr = generateRandomArray();
        int sum = 0;

        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }

        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}
