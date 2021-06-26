package com.fju.airplane;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckIn{
        int boardId;
        int passwordId;
        String flightNumber;
        String seat;
        String departureTime;

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
