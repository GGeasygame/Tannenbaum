package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wie hoch sollten die Blätter reichen?");

        int blaetter = scanner.nextInt();



    }
    public static void blaetter(int blaetter){
        for(int i= 0; i < blaetter; i++) {
            new String(new char[i]).replace("\0", "*");
            System.out.println(String());
        }
    }
}
