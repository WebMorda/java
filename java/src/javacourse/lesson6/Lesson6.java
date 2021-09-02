package javacourse.lesson6;

import java.util.Arrays;
import java.util.Locale;

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

    private static void task8() {
        String strInput = "aabccddefgghiijjkk";

        char[] ch = strInput.toCharArray();

        for (int i = 0; i < ch.length - 1; i++){
            for (int j = i + 1; j < ch.length; j++){
                if (ch[i] == ch[j]){
                    System.out.print(ch[i]);
                    break;
                }
            }
        }
    }

    private static void task7() {
        String one = "135";
        String two = "246";
        String tree = one + two;

        var arr = tree.toCharArray();

        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder(arr.length);
        for (Character c : arr)
            sb.append(c);

        System.out.println("Данные строки – " + sb.toString());
    }

    private static void task6() {
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

    private static void task5() {
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

    private static void task4() {
        String fullName = "Иванов Семён Семёнович";

        if (fullName.contains("ё")) {
            fullName = fullName.replace("ё", "e");
        }

        System.out.println(fullName);
    }

    private static void task3() {
        String fullName = "Ivanov Ivan Ivanovich";

        fullName = fullName.replace(" ", ";");

        System.out.println(fullName);
    }

    private static void task2() {
        String fullName = "Ivanov Ivan Ivanovich";

        fullName = fullName.toUpperCase();

        System.out.println("Данные ФИО сотрудника для заполнения отчета – " + fullName);
    }

    private static void task1() {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;

        System.out.println("ФИО сотрудника – " + fullName);
    }
}
