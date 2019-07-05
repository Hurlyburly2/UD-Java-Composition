package com.dsimon;

public class Lamp {
    private int brightness;
    private String color;
    private boolean onOrOff;

    public Lamp(int brightness, String color) {
        this.brightness = brightness;
        this.color = color;
        this.onOrOff = true;
    }

    public void pressButton() {
        if (onOrOff == true) {
            onOrOff = false;
            System.out.println("Lamp turned off.");
        } else {
            onOrOff = true;
            System.out.println("Lamp turned on.");
        }
    }

    public int getBrightness() {
        return brightness;
    }

    public String getColor() {
        return color;
    }

    public boolean isOnOrOff() {
        return onOrOff;
    }
}
