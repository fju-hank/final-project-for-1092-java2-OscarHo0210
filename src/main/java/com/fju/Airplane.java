package com.fju;

public abstract class Airplane {
    String flightNumber;
    String name;
    int passwordId;

    public boolean validate(String flightNumber, String name, int passwordId) {
        return(flightNumber == flightNumber && name == name && passwordId == passwordId);
    }

    public abstract String getName();

    public abstract int getPrice();
}
