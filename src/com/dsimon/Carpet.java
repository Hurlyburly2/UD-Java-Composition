package com.dsimon;

public class Carpet {
    private int width;
    private int length;
    private String color;
    private String type;

    public Carpet(int width, int length, String color, String type) {
        this.width = width;
        this.length = length;
        this.color = color;
        this.type = type;
    }

    public void stepOnCarpet() {
        System.out.println("Stepped on the " + color + " " + type + " carpet.");
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }
}
