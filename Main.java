package com.company;

public class Main {

    public static void main(String[] args) {
        //MrBizi-666 логин в GitHub
        System.out.println("Hello Hell!");

        byte num = 99;
        System.out.println("Variable = " + num);

        int int1 = 37;
        int int2 = 18;
        int result1;
        result1 = int1 * int2;
        System.out.println("result1 = " + result1);

        long l = 1234567;
        System.out.println("long = " + l);

        float flo = 666.1313f;
        System.out.println("float = " + flo);

        double dou1 = 38883.3f;
        double dou2 = 50f;
        double result2;
        result2 = dou1 / dou2;
        System.out.println("result2 = " + result2);

        char sym = 'Z';
        System.out.println("char - " + sym);

        int a = 4;
        int b = 15;
        int c = 10;
        int d = 2;
        int res2;
        res2 = a * (b + (c / d));
        System.out.println("метод вычисляющий выражение a * (b + (c / d)) = " + res2);

        int Devils = 10;
        int Angels = 20;
        if (Devils > Angels) {
            System.out.println("Чертят больше)))!");
        } else if (Devils < Angels) {
            System.out.println("Ангелов больше, добро победило)))!");
        } else
            System.out.println("Чертят и ангелов равное количество, сражение прожолжается!");

        byte z = -127;
        if (z < 0) {
            System.out.println("передали отрицательное значение _ " + z);
        } else if (z == 0) {
            System.out.println("передали положительное значение _ " + z);
        } else if (z > 0) {
            System.out.println("передали положительное значение _ " + z);
        }
        boolean Hellish_satan = true;
        String str = "Вася";
        String str2 = "! на Брайтон бич хорошая погода на Дерибасовской идут дожди))";
        System.out.println("Hello, " + str + str2);


    }

}
