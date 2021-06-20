package com.fju;

public class Airplane1 extends Airplane{
    public Airplane1() {
        flightNumber = "KL843";
        name = "Oscar";
        passwordId = 123456;
    }

    @Override
    public String getName() {
        return "Hello";
    }

    @Override
    public int getPrice() {
        return 0;

    }

}
