package com.dsimon;

public class TV {
    int width;
    int length;
    int channel;
    boolean onOrOff;

    public TV(int width, int length) {
        this.width = width;
        this.length = length;
        this.channel = 1;
        this.onOrOff = false;
    }

    public void pressButton() {
        if (onOrOff == false) {
            onOrOff = true;
            System.out.println("Turned on the tv");
        } else {
            onOrOff = false;
            System.out.println("Turned off the tv");
        }
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getChannel() {
        return channel;
    }

    public boolean isOnOrOff() {
        return onOrOff;
    }
}
