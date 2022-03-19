package sk.stuba.fei.uim.oop;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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
    }
}
