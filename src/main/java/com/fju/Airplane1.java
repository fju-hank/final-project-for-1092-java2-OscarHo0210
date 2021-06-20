package com.fju;

public class Airplane1 extends Airplane{
    public Airplane1() {
        flightNumber = "KL843";
        name = "Oscar";
        passwordId = 123456;
    }

    @Override
    public String getFlightNumber() {
        return "Flight number : KL843";
    }

    @Override
    public int getBaggage() {
        return 2;
    }

    @Override
    public String getGate(){
        return "D6";
    }

}
