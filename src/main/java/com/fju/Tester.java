package com.fju;


import java.util.Scanner;

public class Tester{
    public static String flightNumber;
    public static String destination;
    public static String gate;
    public static int baggageId;


    public static void main(String[] args) {
        Airplane[] airplanes= {new Airplane1(), new Airplane2(),
        new Airplane3(), new Airplane4()};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String name = String.valueOf(Integer.parseInt(scanner.next()));
        System.out.println("Please enter your flight Number:");
        String flightNumber = String.valueOf(Integer.parseInt(scanner.next()));
        System.out.println("Please enter your password ID:");
        int id = Integer.parseInt(scanner.next());
        System.out.println("Flight Number: " + flightNumber + ", Destination: " + destination + ", Gate: " + gate + ", Baggage: " + baggageId);


    }

}
