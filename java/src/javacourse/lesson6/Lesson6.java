package javacourse.lesson6;

import java.util.Arrays;

public class Lesson6 {
    public static void main(String[] args) {

        //Задание 1
        task1();

        //Задание 2
        task2();

        //Задание 3
        task3();

        //Задание 4
        task4();

        //Задание 5
        task5();

        //Задание 6
        task6();

        //Задание 7
        task7();

        //Задание 8
        task8();
    }

    private static void task1() {
        System.out.println("Task 1");

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;

        System.out.println("ФИО сотрудника – " + fullName);
    }

    private static void task2() {
        System.out.println("Task 2");

        String fullName = "Ivanov Ivan Ivanovich";

        fullName = fullName.toUpperCase();

        System.out.println("Данные ФИО сотрудника для заполнения отчета – " + fullName);
    }

    private static void task3() {
        System.out.println("Task 3");

        String fullName = "Ivanov Ivan Ivanovich";

        fullName = fullName.replace(" ", ";");

        System.out.println(fullName);
    }

    private static void task4() {
        System.out.println("Task 4");

        String fullName = "Иванов Семён Семёнович";

        if (fullName.contains("ё")) {
            fullName = fullName.replace('ё', 'e');
        }

        System.out.println(fullName);
    }

    private static void task5() {
        System.out.println("Task 5");

        String fullName = "Ivanov Ivan Ivanovich";
        String firstName = "";
        String middleName = "";
        String lastName = "";

        String[] fullNameSplit = fullName.split(" ");
        firstName = fullNameSplit[1];
        middleName = fullNameSplit[2];
        lastName = fullNameSplit[0];

        System.out.println("Имя сотрудника – " + firstName);
        System.out.println("Фамилия сотрудника – " + lastName);
        System.out.println("Отчество сотрудника – " + middleName);

        int indexStart = fullName.indexOf(' ');
        int indexLast = fullName.lastIndexOf(' ');

        String lastNameSubStr = fullName.substring(0, indexStart);
        String firstNameSubStr = fullName.substring(indexStart, indexLast);
        String middleNameSubStr = fullName.substring(indexLast);

        System.out.println("Имя сотрудника – " + firstNameSubStr);
        System.out.println("Фамилия сотрудника – " + lastNameSubStr);
        System.out.println("Отчество сотрудника – " + middleNameSubStr);
    }

    private static void task6() {
        System.out.println("Task 6");

        String fullName = "ivanov ivan ivanovich";

        int indexStart = fullName.indexOf(' ');
        int indexLast = fullName.lastIndexOf(' ');

        char[] arr = fullName.toCharArray();
        arr[0] = Character.toUpperCase(arr[0]);
        arr[indexStart + 1] = Character.toUpperCase(arr[indexStart + 1]);
        arr[indexLast + 1] = Character.toUpperCase((arr[indexLast + 1]));

        fullName = new String(arr);

        System.out.println(fullName);
    }

    private static void task7() {
        System.out.println("Task 7");

        String one = "135";
        String two = "246";
        String tree = one + two;

        char[] arr = tree.toCharArray();

        boolean stop = false;
        char temp;
        while (!stop) {
            stop = true;

            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    stop = false;

                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        StringBuilder sb = new StringBuilder(new String(arr));

        System.out.println("Данные строки – " + sb);
    }

    private static void task8() {
        System.out.println("Task 8");

        String strInput = "aabccddefgghiijjkk";

        char[] ch = strInput.toCharArray();

        for (int i = 0; i < ch.length - 1; i++) {
            if (ch[i] == ch[i + 1]) {
                System.out.print(ch[i]);
            }
        }
    }
}
