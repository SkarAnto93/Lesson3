package com.company;

public class Car implements com.company.Interfaces.Car {
    int speed = 0;
    int gear = 0;
    //int rpm = 0;



    @Override
    public void speedUp(int increment) {
        speed = speed + increment;
        System.out.println(speed);
    }

    @Override
    public void applyBreaks(int decrement) {
        speed = speed - decrement;
        System.out.println(speed);
    }

    @Override
    public void changeGear(int newValue) {
        gear = newValue;
    }



    public int getGear() {
        return gear;
    }
    //@Override
    //public void changeRPM (int newValue) {
      //  rpm =
    //}
}
