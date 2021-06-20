package com.fju;

public class Airplane4 extends Airplane{
    public Airplane4() {
        flightNumber = "BR87";
        name = "Marry";
        passwordId = 987654;
    }

    @Override
    public String getFlightNumber() {
        return "BR87";

    }

    @Override
    public int getBaggage() {
        return 6;

    }

    @Override
    public String getGate(){
        return "C5";
    }
}