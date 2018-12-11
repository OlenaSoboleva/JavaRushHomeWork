package com.javarush.test.level03.lesson04.task03;

/* StarCraft
Создать 10 зергов, 5 протосов и 12 терран.
Дать им всем уникальные имена.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Zerg Z1=new Zerg();
        Z1.name="Z1";
        Zerg Z2=new Zerg();
        Z2.name="Z2";
        Zerg Z3=new Zerg();
        Z3.name="Z3";
        Zerg Z4=new Zerg();
        Z4.name="Z4";
        Zerg Z5=new Zerg();
        Z5.name="Z5";
        Zerg Z6=new Zerg();Z6.name="Z6";
        Zerg Z7=new Zerg();Z7.name="Z7";
        Zerg Z8=new Zerg();Z8.name="Z8";
        Zerg Z9=new Zerg();Z9.name="Z9";
        Zerg Z10=new Zerg();Z10.name="Z10";
        Protos P1=new Protos();P1.name="P1";
        Protos P2=new Protos();P2.name="P2";
        Protos P3=new Protos();P3.name="P3";
        Protos P4=new Protos();P4.name="P4";
        Protos P5=new Protos();P5.name="P5";
        Terran T1=new Terran();T1.name="T1";
        Terran T2=new Terran();T2.name="T2";
        Terran T3=new Terran();T3.name="T3";
        Terran T4=new Terran();T4.name="T4";
        Terran T5=new Terran();T5.name="T5";
        Terran T6=new Terran();T6.name="T6";
        Terran T7=new Terran();T7.name="T7";
        Terran T8=new Terran();T8.name="T8";
        Terran T9=new Terran();T9.name="T9";
        Terran T10=new Terran();T10.name="T10";
        Terran T11=new Terran();T11.name="T11";
        Terran T12=new Terran();T12.name="T12";
    }

    public static class Zerg
    {
        public String name;
    }

    public static class Protos
    {
        public String name;
    }

    public static class Terran
    {
        public String name;
    }
}