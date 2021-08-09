package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wie hoch sollten die Blätter reichen?");

        int blaetter = scanner.nextInt();
        blaetter += 1;
        blaetter(blaetter);


    }
    public static void blaetter(int blaetter){
        for(int i= 0; i < blaetter; i++) {
            System.out.println(new String(new char[blaetter - i]).replace("\0", "* "));

        }
    }
}
