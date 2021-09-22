package javacourse.lesson7;

import java.util.Arrays;
import java.util.Random;

public class Lesson7 {
    public static void main(String[] args) {
        task1();

        task2();

        task3();

        task4();

        task5();

        task6();
    }

    //region Task 1
    static void task1() {
        printHeading(1);

        int finishYear = 2021;

        for (int year = 2000; year < finishYear; year++) {
            leapYear(year);
        }
    }

    private static void leapYear(int year) {
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            System.out.println("Год " + year + " високосный");
        } else {
            System.out.println("Год " + year + " не високосный");
        }
    }

    //endregion

    //region Task 2
    static void task2() {
        printHeading(2);

        Random random = new Random();
        int clientOS = random.nextInt(2);
        int clientDeviceYear = random.nextInt(5) + 2015;

        checkOs(clientOS, clientDeviceYear);
    }

    private static void checkOs(int clientOS, int clientDeviceYear) {
        if (clientOS == 0) {
            checkYear(clientDeviceYear, "android");
        } else {
            checkYear(clientDeviceYear, "iOs");
        }
    }

    private static void checkYear(int clientDeviceYear, String os) {
        if (clientDeviceYear < 2019) {
            System.out.println("Установите lite версию приложения для " + os + " по ссылке");
        } else {
            System.out.println("Установите приложения для " + os + " по ссылке");
        }
    }
    //endregion

    //region Task 3
    static void task3() {
        printHeading(3);

        int deliveryDistance = 95;

        int deliveryDay = getDeliveryDay(deliveryDistance);

        System.out.println("Доставка займет " + deliveryDay + " д.!");
    }

    private static int getDeliveryDay(int deliveryDistance) {
        int deliveryDay = 1;

        if (deliveryDistance > 20) {
            deliveryDay++;
        }
        if (deliveryDistance > 60) {
            deliveryDay++;
        }
        return deliveryDay;
    }
    //endregion

    //region Task 4
    static void task4() {
        printHeading(4);

        String str = "aabccddefgghiijjkk";

        searchDuplicate(str);
    }

    private static void searchDuplicate(String str) {
        char[] arr = str.toCharArray();

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                System.out.println("Дублирующийся символ: " + arr[i]);
                return;
            }
        }

        System.out.println("Дублей не найдено");
    }

    //endregion

    //region Task 5
    static void task5() {
        printHeading(5);

        int[] arr = {3, 2, 1, 6, 5};

        reverseArray(arr);

        System.out.println(Arrays.toString(arr));
    }

    private static void reverseArray(int[] arr) {
        for (int i = 0, j = arr.length - 1; i < arr.length / 2; i++, j--) {
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
    }
    //endregion

    //region Task 6
    static void task6(){
        printHeading(6);

        int[] arr = generateRandomArray();

        float average = getAverage(arr);

        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей.");
    }

    private static float getAverage(int[] arr) {
        int sum = getSum(arr);

        return getAverage(arr.length, sum);
    }

    private static int getAverage(int arrLength, int sum) {
        return sum / arrLength;
    }

    private static int getSum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum +=i;
        }
        return sum;
    }
    //endregion

    private static void printHeading(int lesson) {
        System.out.println();
        System.out.println("Task " + lesson);
        System.out.println("--------------------------");
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