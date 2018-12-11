package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
       BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
       String sa=reader.readLine();
       String sb=reader.readLine();
       String sc=reader.readLine();
       int[] mas=new int[3];
        mas[0]=Integer.parseInt(sa);
        mas[1]=Integer.parseInt(sb);
        mas[2]=Integer.parseInt(sc);
      for(int j=0;j<2;j++)
      {
          for (int i = j; i <=2; i++)
          {
              int t = 0;
              if (mas[j] < mas[i])
              {
                  t = mas[j];
                  mas[j] = mas[i];
                  mas[i] = t;
              }
          }
      }
        System.out.println(mas[0]);
        System.out.println(mas[1]);
        System.out.println(mas[2]);
    }
}
