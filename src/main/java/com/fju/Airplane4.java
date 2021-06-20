package com.fju;

public class Airplane4 extends Airplane{
    public Airplane4() {
        flightNumber = "BR87";
        name = "Marry";
        passwordId = 987654;
    }

    @Override
    public String getName() {
        return "Hello1";

    }

    @Override
    public int getPrice() {
        return 0;

    }
}