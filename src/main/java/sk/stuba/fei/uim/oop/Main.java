package sk.stuba.fei.uim.oop;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

/**
 * dokumentacia triedy
 */
public class Main {
    public static void main(String[] args) {
        /*
        System.out.println("Hello World");
        Scanner klavesnica = new Scanner(System.in);
        String a = "a";
        String b = "a";
        System.out.println("zadaj pismeno: ");
        String c = klavesnica.nextLine();

        System.out.println("a==a: " + (a==a));
        System.out.println("(a.equals(b)): " + (a.equals(b)));
        System.out.println("(a.equals(c)): " + (a.equals(c)));

        System.out.println("Objects.equals(a,a): " + Objects.equals(a,a));
        System.out.println("Objects.equals(a,b): " + Objects.equals(a,b));
        System.out.println("Objects.equals(a,c): " + Objects.equals(a,c));
         */
        /////////////////////////////////////////////
        int x = 5;
        int[] y = new int[]{1,2,3};

        System.out.println(x);
        testPrimitive(x);
        System.out.println(x);

        System.out.println(Arrays.toString(y));
        testArray(y);
        System.out.println(Arrays.toString(y));

        //
        testArraySpread("test",1,2,3,4,5);
    }

    /**
     * tato funkcia vypisuje cislo
     * @param cislo - integer cislo
     */  //stlac Ctrl+Q a ukaze ti dokumentaciu , ctrl+p ukaze parametre
    public static void testPrimitive(int cislo){
        cislo = 10;
        System.out.println(cislo);
    }

    public static void testArray(int[] array){
        array[0] = 10;
        System.out.println(Arrays.toString(array));
    }
    /////////////////////////////////////////////
    public static void testArraySpread(String text, int... array){   //spread operator = bude viac operatorov vzdy 1 typu ale neviem kolko; musi bzt na konci
        System.out.println(text);
        System.out.println(Arrays.toString(array));
    }
}
