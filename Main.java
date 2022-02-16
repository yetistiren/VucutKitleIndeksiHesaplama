package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double boy, kilo;

        System.out.print("Boyunuzu Giriniz (metre cinsinden) :");
        boy = input.nextDouble();

        System.out.print("Kilonuzu Giriniz (kg cinsinden) :");
        kilo = input.nextDouble();

        System.out.println("Vücut Kitle İndeksiniz = " + (kilo / (boy * boy)));
    }
}
