package com.fju;

public class Airplane2 extends Airplane {

    public Airplane2() {
        flightNumber = "UA871";
        name = "Alex";
        passwordId = 654321;
    }

    @Override
    public String getFlightNumber(){
        return "UA871";
    }

    @Override
    public int getBaggage() {
        return 8;
    }

    @Override
    public String getGate(){
        return "D5";
    }
}
