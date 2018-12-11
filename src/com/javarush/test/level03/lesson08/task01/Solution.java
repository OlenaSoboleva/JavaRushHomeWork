package com.javarush.test.level03.lesson08.task01;

/* Как захватить мир
Ввести с клавиатуры число и имя, вывести на экран строку:
«имя» захватит мир через «число» лет. Му-ха-ха!
Пример: Вася захватит мир через 8 лет. Му-ха-ха!

Последовательность вводимых данных имеет большое значение.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s1=" захватит мир через ";
        String s2=" лет. Му-ха-ха!";
        String sAge = reader.readLine();
     //   System.out.println("Введите имя:");
        String name = reader.readLine();
     //   System.out.println("Введите года:");
        int nAge = Integer.parseInt(sAge);
        System.out.println(name+s1+sAge+s2);

    }
}