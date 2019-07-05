package com.dsimon;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);

        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));

        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4,6, "v2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);

        thePC.powerUp();

        LivingRoom livingRoom = new LivingRoom(10, 15, 10, new Couch("blue"), new EndTable(2,2,3,"Wood"), new Lamp(10,"yellow"), new TV(27, 30), new Carpet(10, 10, "blue", "throw rug"));

        livingRoom.watchTV();
    }
}
