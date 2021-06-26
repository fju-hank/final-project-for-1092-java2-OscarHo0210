package com.fju.airplane;

public class Airplane3 extends Airplane{
        public Airplane3() {
                flightNumber = "SQ878";
                name = "Alice";
                passwordId = 456789;
        }
        @Override
        public String getTime() {
                return "16:40";
        }

        @Override
        public String getFlightNumber() {
                return "SQ877";
        }

        @Override
        public String getLocation() {
                return "Singapore Changi Airport(SIN)";
        }

        @Override
        public int getBaggage() {
                return 5;
        }

        @Override
        public String getGate(){
                return "D2";
        }

        @Override
        public String getPlaneId(){
                return "9V-SCH";
        }
}
