package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String sa=reader.readLine();
        String sb=reader.readLine();
        String sc=reader.readLine();
        String sd=reader.readLine();
        int a=Integer.parseInt(sa);
        int b=Integer.parseInt(sb);
        int c=Integer.parseInt(sc);
        int d=Integer.parseInt(sd);
        int max=((a>b)?a:b)>((c>d)?c:d)?((a>b)?a:b):((c>d)?c:d);
        System.out.println(max);

    }
}
