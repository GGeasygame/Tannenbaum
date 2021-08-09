package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wie hoch sollten die Blätter reichen?");

        int blaetter = scanner.nextInt();
        blaetter += 1;
        int mitte = blaetter(blaetter);

        int hoeheBaumstamm = scanner.nextInt();
        hoeheBaumstamm(hoeheBaumstamm, mitte);

    }
    public static int blaetter(int blaetter){
        int mitte = 0;
        for(int i= 0; i < blaetter; i++) {
            System.out.println(new String(new char[i]).replace("\0", "* "));
            System.out.print(new String(new char[blaetter - i]).replace("\0", " "));
            mitte = blaetter - 1;
        }
        return mitte;
    }
    public static void hoeheBaumstamm(int hoeheBaumstamm, int mitte){
        for(int i= 0; i < hoeheBaumstamm; i++) {
            System.out.println();
        }
    }
}
