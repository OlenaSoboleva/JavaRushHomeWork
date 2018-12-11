package com.javarush.test.level04.lesson06.task07;

/* Три числа
Ввести с клавиатуры три целых числа. Одно из чисел отлично от двух других, равных между собой.
Вывести на экран порядковый номер числа, отличного от остальных.
Пример для чисел 4 6 6:
1
Пример для чисел 6 6 3:
3
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
       int a=Integer.parseInt(sa);
       int b=Integer.parseInt(sb);
       int c=Integer.parseInt(sc);
       int k=(a==b)?3:((a==c)?2:1);
       System.out.println(k);
    }
}
