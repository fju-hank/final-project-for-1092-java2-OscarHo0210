package com.fju;

public abstract class Airplane {
    String id;
    String destination;
    String gate;
    int baggageId;

    String name;
    String flightNumber;
    int passwordId;

    public abstract String getId();
    public abstract String getDestination();
    public abstract String getGate();
    public abstract int getBaggageId();


}
