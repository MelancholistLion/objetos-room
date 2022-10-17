package oop.sets.neighborhood;

import java.util.List;

public class House {
    private Kitchen kitchen;
    private DiningRoom diningRoom;
    private List<BedRoom> bedRoom;

    House(Kitchen kitchen, DiningRoom diningRoom, List<BedRoom> bedRoom) {
        this.kitchen = kitchen;
        this.diningRoom = diningRoom;
        this.bedRoom = bedRoom;
    }

    public Kitchen getKitchen() {
        return kitchen;
    }

    public DiningRoom getDiningRoom() {
        return diningRoom;
    }

    public List<BedRoom> getBedRoom() {
        return bedRoom;
    }

    public static HouseBuilder builder() {
        return new HouseBuilder();
    }
}
