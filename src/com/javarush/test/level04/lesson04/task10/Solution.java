package com.javarush.test.level04.lesson04.task10;

/* Три числа
Ввести с клавиатуры три целых числа. Определить, имеется ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел. Если все три числа равны между собой, то вывести все три.
Пример для чисел 1 2 2:
2 2
Пример для чисел 2 2 2:
2 2 2
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
        String res="";
        if(a==b&&a==c&&b==c){
            res=a+" "+b+" "+c;
        }
        else if(a==b){
            res=a+" "+b;
        }
        else if(b==c){
            res=b+" "+c;
        }
        else if(a==c){
            res=a+" "+c;
        }
        System.out.println(res);
    }
}