package com.javarush.test.level04.lesson07.task03;

/* Положительные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел в исходном наборе.
Пример для чисел -4 6 6:
2
Пример для чисел -6 -6 -3:
0
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
        int mas[]=new int[3];
        mas[0]=Integer.parseInt(sa);
        mas[1]=Integer.parseInt(sb);
        mas[2]=Integer.parseInt(sc);
        int sum=0;
        for(int i=0;i<=2;i++){
            if(mas[i]>0){
                sum=sum+1;
            }
        }
        System.out.println(sum);
    }
}
