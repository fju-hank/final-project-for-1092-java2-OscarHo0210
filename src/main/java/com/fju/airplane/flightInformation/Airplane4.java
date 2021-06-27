package com.fju.airplane.flightInformation;

public class Airplane4 extends Airplane{
    public Airplane4() {
        flightNumber = "BR87";
        name = "Marry";
        passwordId = 987654;
    }
    @Override
    public String getTime() {
        return "23:10";
    }

    @Override
    public String getLocation() {
        return "Paris Charles de Gaulle Airport(CDG)";
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

    @Override
    public String getPlaneId(){
        return "B-16735";
    }
}