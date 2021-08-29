package javacourse.lesson2;

public class Lesson2 {
    public static void main(String[] args) {
        // Задание 1
        byte a1 = 124;
        short b1 = 1452;
        int c1 = 87564;
        long d1 = 123644587963L;
        float e1 = 3.14F;
        double f1 = 3.1415926535;


        // Задание 2
        double michaelTyson = 78.2;
        double tysonFury = 82.7;
        System.out.println("Общий вес: " + (michaelTyson + tysonFury) + " кг.");
        System.out.println("Разница в весе: " + (tysonFury - michaelTyson));
        System.out.println("Разница в весе: " + (tysonFury % michaelTyson));


        // Задание 3
        int banana = 5;
        int oneBananaWeightGram = 80;

        int milk = 200;
        int oneMilkWeightGram = 105;
        int milkPortion = 100;

        int ice = 2;
        int oneIceWeightGram = 100;

        int egg = 4;
        int oneEggWeightGram = 70;

        int weightGram = (banana * oneBananaWeightGram) + ((milk / milkPortion) * oneMilkWeightGram) + (ice * oneIceWeightGram) + (egg * oneEggWeightGram);
        System.out.println("Вес завтрака в граммах: " + weightGram);
        double weightKg = (double) weightGram / 1000;
        System.out.println("Вес завтрака в килограммах: " + weightKg);


        // Задание 4
        int excessWeightKg = 7;

        int minWeightGram = 250;
        int maxWeightGram = 500;

        double minWeightKg = (double) minWeightGram / 1000;
        double maxWeightKg = (double) maxWeightGram / 1000;

        double minWeightDay = excessWeightKg / minWeightKg;
        double maxWeightDay = excessWeightKg / maxWeightKg;

        System.out.println("Если терять 250 грамм в день, на похудение необходимо " + minWeightDay + " дней");
        System.out.println("Если терять 500 грамм в день, на похудение необходимо " + maxWeightDay + " дней");

        double averageDay = (minWeightDay + maxWeightDay) / 2;
        System.out.println("В среднем понадобится " + averageDay + " день");


        // Задание 5
        int currentSalaryMasha = 67760;
        int currentSalaryDenis = 83690;
        int currentSalaryKristina = 76230;

        int percent = 10;

        int nextSalaryMasha = (int) (currentSalaryMasha * (percent / 100f + 1));
        int nextSalaryDenis = (int) (currentSalaryDenis * (percent / 100f + 1));
        int nextSalaryKristina = (int) (currentSalaryKristina * (percent / 100f + 1));

        int differenceMasha = (nextSalaryMasha - currentSalaryMasha) * 12;
        int differenceDenis = (nextSalaryDenis - currentSalaryDenis) * 12;
        int differenceKristina = (nextSalaryKristina - currentSalaryKristina) * 12;

        System.out.println("Маша теперь получает " + nextSalaryMasha + " рублей. Годовой доход вырос на " + differenceMasha + " рублей");

        System.out.println("Денис теперь получает " + nextSalaryDenis + " рублей. Годовой доход вырос на " + differenceDenis + " рублей");

        System.out.println("Кристина теперь получает " + nextSalaryKristina + " рублей. Годовой доход вырос на " + differenceKristina + " рублей");


        // Задание 6
        int a6 = 12;
        int b6 = 27;
        int c6 = 44;
        int d6 = 15;
        int e6 = 9;

        int result = a6 * (b6 + (c6 - d6 * e6));

        System.out.println(result);
        result = -(result);
        System.out.println(result);
        result = -(result);
        System.out.println(result);


        //Задание 7
        int a7 = 5;
        int b7 = 7;

        a7 = a7 + b7;
        b7 = a7 - b7;
        a7 = a7 - b7;

        System.out.println("Переменная а было = 5, стало = " + a7);
        System.out.println("Переменная b было = 7, стало = " + b7);


        //Задание 8
        int a8 = 256;
        int b8 = a8 / 10 % 10; // исправил
        System.out.println(b8);
    }
}
