package com.javarush.test.level04.lesson02.task02;

/* Реализовать метод addNewCat
Реализовать метод addNewCat, чтобы при его вызове (т.е. добавлении нового кота), количество котов увеличивалось на 1. За количество котов отвечает переменная catsCount.
*/




public class Cat {
    private static int catsCount = 0;

    public static void main(String[] args){
       Cat cat1=new Cat();
        addNewCat();
 /*       System.out.println(cat1.catsCount);
       Cat cat2=new Cat();

        addNewCat();
        System.out.println(cat2.catsCount);
*/
    }

    public static void addNewCat() {

        Cat.catsCount=Cat.catsCount+1;
    }
}
