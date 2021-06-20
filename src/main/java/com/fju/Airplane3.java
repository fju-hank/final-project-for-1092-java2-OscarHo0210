package com.fju;

public class Airplane3 extends Airplane{
        public Airplane3() {
                flightNumber = "SQ877";
                name = "Alice";
                passwordId = 456789;
        }
        @Override
        public String getName() {
                return "BOX 3";
        }

        @Override
        public int getPrice() {
                return 60;
        }
}
