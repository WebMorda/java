package javacourse.lesson5;

import java.util.Arrays;

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
        System.out.println("Task 9");

        int[] arr = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        int first = 0;
        int last = arr.length - 1;
        int sum = -2;

        Arrays.sort(arr);

        while (first < last) {
            int result = arr[first] + arr[last];
            if (result == sum) {
                System.out.println(arr[first] + " + " + arr[last] + " = -2");
                first++;
                last--;
            } else {
                if (result < sum) {
                    first++;
                } else {
                    last--;
                }
            }
        }
    }

    private static void task8() {
        System.out.println("Task 8");
        int[] arr = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        int first = 0;
        int last = arr.length - 1;
        int sum = -2;

        Arrays.sort(arr);

        while (first < last) {
            int result = arr[first] + arr[last];
            if (result == sum) {
                System.out.println(arr[first] + " + " + arr[last] + " = -2");
                break;
            } else {
                if (result < sum) {
                    first++;
                } else {
                    last--;
                }
            }
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

        for (int i = 0, j = arr.length - 1; i < arr.length / 2; i++, j--) {
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }

        System.out.println(Arrays.toString(arr));
    }

    private static void task5() {
        int[][] arr = new int[3][3];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j == i || j == arr.length - 1 - i) {
                    arr[i][j] = 1;
                }
            }
            System.out.println();
        }

        for (int[] row : arr) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }

        System.out.println();
    }

    private static void task4() {
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println("");
    }

    private static void task3() {
        int[] arr = generateRandomArray();
        int sum = 0;
        float average = 0;

        for (int i : arr) {
            sum = +i;
        }

        average = sum / arr.length;

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

        for (int i : arr) {
            if (i < minCycle) {
                minCycle = i;
            } else if (i > maxCycle) {
                maxCycle = i;
            }
        }

        System.out.println("Минимальная трата " + minCycle);
        System.out.println("Максимальная трата " + maxCycle);
    }

    private static void task1() {
        int[] arr = generateRandomArray();
        int sum = 0;

        for (int i : arr) {
            sum += i;
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
