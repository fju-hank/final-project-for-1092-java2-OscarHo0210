package com.fju;

public class Airplane1 extends Airplane{
    public Airplane1() {
        flightNumber = "KL843";
        name = "Oscar";
        passwordId = 123456;
    }

    @Override
    public String getTime() {
        return "18:50";
    }

    @Override
    public String getFlightNumber() {
        return "KL843";
    }

    @Override
    public String getLocation() {
        return "Bangkok Suvarnabhumi Airport(BKK)";
    }

    @Override
    public int getBaggage() {
        return 2;
    }

    @Override
    public String getGate(){
        return "D6";
    }

    @Override
    public String getPlaneId(){
        return "PH-BVA";
    }

}
