package com.fju;

public class Airplane2 extends Airplane {

    public Airplane2() {
        flightNumber = "UA871";
        name = "Kevin";
        passwordId = 654321;
    }

    @Override
    public String getName() {
        return "mop";
    }

    @Override
    public int getPrice() {
        return 0;

    }
}
