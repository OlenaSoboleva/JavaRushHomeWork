package com.javarush.test.level03.lesson08.task02;

/* Зарплата через 5 лет
Ввести с клавиатуры отдельно Имя, число1, число2. Вывести надпись:
«Имя» получает «число1» через «число2» лет.
Пример: Коля получает 3000 через 5 лет.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
       BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
 //      System.out.println("Enter name:");
        String name=reader.readLine();
 //       System.out.println("Enter зарплату:");
        String sch=reader.readLine();
        int ich=Integer.parseInt(sch);
 //       System.out.println("Enter года:");
        String sch1=reader.readLine();
        int ich1=Integer.parseInt(sch1);
        System.out.println(name+" получает "+ich+" через "+ich1+" лет.");

    }
}