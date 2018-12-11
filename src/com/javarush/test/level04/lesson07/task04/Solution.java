package com.javarush.test.level04.lesson07.task04;

/* Положительные и отрицательные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе,
в следующем виде:
"количество отрицательных чисел: а", "количество положительных чисел: б", где а, б - искомые значения.
Пример для чисел 2 5 6:
количество отрицательных чисел: 0
количество положительных чисел: 3
Пример для чисел -2 -5 6:
количество отрицательных чисел: 2
количество положительных чисел: 1
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
        System.out.println("количество отрицательных чисел: "+(mas.length-sum));
        System.out.println("количество положительных чисел: "+sum);
    }
}
