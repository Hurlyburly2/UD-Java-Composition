package com.dsimon;

public class Couch {
    private String color;

    public Couch(String color) {
        this.color = color;
    }

    public void sitOnCouch() {
        System.out.println("Sat down on the " + color + " couch.");
    }

    public String getColor() {
        return color;
    }
}
