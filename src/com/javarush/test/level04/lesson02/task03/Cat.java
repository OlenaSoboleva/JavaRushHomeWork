package com.javarush.test.level04.lesson02.task03;

/* Реализовать метод setCatsCount
Реализовать метод setCatsCount так, чтобы с его помощью можно было устанавливать значение переменной catsCount равное переданному параметру.
*/

import javax.xml.bind.SchemaOutputResolver;

public class Cat {
    private static int catsCount = 0;

    public  static void main(String [] args){
        Cat cat=new Cat();
        setCatsCount(2);
  //      System.out.println(cat.catsCount);

    }

    public static void setCatsCount(int catsCount) {
        Cat.catsCount=catsCount;
    }
}