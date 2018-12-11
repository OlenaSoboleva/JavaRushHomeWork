package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String sx=reader.readLine();
        int x=Integer.parseInt(sx);
        String sy=reader.readLine();
        int y=Integer.parseInt(sy);
        String sz=reader.readLine();
        int z=Integer.parseInt(sz);
        int[]mas=new int[3];
        mas[0]=x;
        mas[1]=y;
        mas[2]=z;
        int max=(x>y)?x:((y>z)?y:z);
        int min=(x<y)?x:((y<z)?y:z);
       int avg=0;
       for(int i=0;i<mas.length;i++){
        if(mas[i]!=min&&mas[i]!=max){
            avg=mas[i];
        }
       }
        System.out.println(avg);
        System.out.println(min);
        System.out.println(max);

    }
}
