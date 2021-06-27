package com.fju.airplane.flightInformation;

public abstract class Airplane {
    String flightNumber;
    String name;
    int passwordId;

    public boolean validate(String a, String b, int c) {

        return (a.equals(flightNumber) && b.equals(name) && c == passwordId);
    }

    public abstract String getTime();
    public abstract String getFlightNumber();
    public abstract String getLocation();
    public abstract int getBaggage();
    public abstract String getGate();
    public abstract String getPlaneId();
}
