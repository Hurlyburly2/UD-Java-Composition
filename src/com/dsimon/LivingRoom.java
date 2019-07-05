package com.dsimon;

public class LivingRoom {
    private int length;
    private int width;
    private int height;

    private Couch couch;
    private EndTable endTable;
    private Lamp lamp;
    private TV tv;
    private Carpet carpet;

    public LivingRoom(int length, int width, int height, Couch couch, EndTable endtable, Lamp lamp, TV tv, Carpet carpet) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.couch = couch;
        this.endTable = endtable;
        this.lamp = lamp;
        this.tv = tv;
        this.carpet = carpet;
    }

    public void watchTV() {
        carpet.stepOnCarpet();
        couch.sitOnCouch();
        lamp.pressButton();
        endTable.pickUpRemote();
        lamp.pressButton();
        tv.pressButton();
        tv.pressButton();
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

    public Couch getCouch() {
        return couch;
    }

    public EndTable getEndTable() {
        return endTable;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public TV getTv() {
        return tv;
    }

    public Carpet getCarpet() {
        return carpet;
    }
}
