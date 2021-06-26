package com.fju.checkIn;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckIn{
        int passwordId;
        String flightNumber;
        String seat;
        String departureTime;

        public CheckIn(int passwordId, String flightNumber, String seat, String departureTime) {
            this.passwordId = passwordId;
            this.flightNumber = flightNumber;
            this.seat = seat;
            this.departureTime = departureTime;
        }

    public boolean validate(int a) {

        return (a == passwordId);
    }

}
