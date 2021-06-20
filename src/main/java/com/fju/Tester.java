package com.fju;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Airplane[] airplanes = {new Airplane1(), new Airplane2(),
                new Airplane3(), new Airplane4()};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your flight number: ");
        String flightNumber = scanner.next();
        System.out.println("Please enter your name: ");
        String name = scanner.next();
        System.out.println("Please enter your password ID: ");
        int passwordId = Integer.parseInt(scanner.next());
        System.out.println("Flight number: " + flightNumber + ", Name: " + name + ", Password ID: " + passwordId);

        for (Airplane airplane : airplanes) {
            if (airplane.validate(flightNumber, name, passwordId)) {
                System.out.println(airplane.getName() + " / " + airplane.getPrice());
                break;
            }
        }
    }
}