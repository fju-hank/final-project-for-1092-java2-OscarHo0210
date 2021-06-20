package com.fju;

public class Airplane1 extends Airplane{
    public Airplane1(){
        name = "Oscar";
        flightNumber = "KL843";
        passwordId = 86563210;
    }
    @Override
    public String getId() {
        return null;
    }

    @Override
    public String getDestination() {
        return "Thailand Bangkok Airport (BKK)";
    }

    @Override
    public String getGate() {
        return "D6";
    }

    @Override
    public int getBaggageId(){
        return 2;
    }
}
