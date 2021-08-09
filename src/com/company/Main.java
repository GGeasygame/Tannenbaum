package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wie hoch sollten die Blätter reichen?");

        int blaetter = scanner.nextInt();
        blaetter += 1;

        System.out.println("Wie hoch sollte der Stamm sein?");

        int hoeheBaumstamm = scanner.nextInt();

        System.out.println("Wie breit sollte der Stamm sein?");

        int breite= scanner.nextInt();
        int mitte = blaetter(blaetter);
        hoeheBaumstamm(hoeheBaumstamm, mitte, breite);

    }
    public static int blaetter(int blaetter){
        int mitte = 0;
        for(int i= 0; i < blaetter; i++) {
            System.out.println(new String(new char[i]).replace("\0", "* "));
            System.out.print(new String(new char[blaetter - i]).replace("\0", " "));
            mitte = blaetter;
        }
        return mitte;
    }
    public static void hoeheBaumstamm(int hoeheBaumstamm, int mitte, int breite){
        System.out.print(new String(new char[mitte - (breite/2)-1]).replace("\0", " "));
        for(int i= 0; i < hoeheBaumstamm; i++) {
            System.out.println("|" + new String(new char[breite]).replace("\0", " ") + "|" );
            System.out.print(new String(new char[mitte - (breite/2)]).replace("\0", " "));
        }
    }
}
