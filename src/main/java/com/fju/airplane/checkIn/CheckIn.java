package com.fju.airplane.checkIn;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckIn{
    int boardId;
    public int passwordId;
    public String flightNumber;
    public String seat;
    public String departureTime;

        public CheckIn(int boardId, int passwordId, String flightNumber, String seat, String departureTime) {
            this.boardId = boardId;
            this.passwordId = passwordId;
            this.flightNumber = flightNumber;
            this.seat = seat;
            this.departureTime = departureTime;
        }

    public boolean validate(int a) {
        return (a == boardId);
    }

}
