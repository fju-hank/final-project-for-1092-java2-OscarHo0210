package com.fju;

public class Airplane2 extends Airplane {

    public Airplane2() {
        flightNumber = "UA871";
        name = "Alex";
        passwordId = 654321;
    }

    @Override
    public String getTime() {
        return "18:45";
    }

    @Override
    public String getFlightNumber(){
        return "UA871";
    }

    @Override
    public String getLocation() {
        return "San Francisco International Airport(SFO)";
    }

    @Override
    public int getBaggage() {
        return 8;
    }

    @Override
    public String getGate(){
        return "D5";
    }

    @Override
    public String getPlaneId() {
        return "N2749U";
    }



}
