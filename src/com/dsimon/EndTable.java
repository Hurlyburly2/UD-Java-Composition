package com.dsimon;

public class EndTable {
    private int length;
    private int width;
    private int height;
    private String material;

    public EndTable(int length, int width, int height, String material) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.material = material;
    }

    public void pickUpRemote() {
        System.out.println("Picked the remote up off the endtable.");
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getMaterial() {
        return material;
    }
}
