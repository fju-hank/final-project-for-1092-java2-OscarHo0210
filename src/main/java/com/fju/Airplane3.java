package com.fju;

public class Airplane3 extends Airplane{
        public Airplane3() {
                flightNumber = "SQ878";
                name = "Alice";
                passwordId = 456789;
        }
        @Override
        public String getFlightNumber() {
                return "SQ878";
        }

        @Override
        public int getBaggage() {
                return 5;
        }

        @Override
        public String getGate(){
                return "D2";
        }
}
