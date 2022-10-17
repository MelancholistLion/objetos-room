package oop.sets.neighborhood;

import java.util.ArrayList;
import java.util.List;

public class HouseBuilder {
    private Kitchen kitchen;
    private DiningRoom diningRoom;
    private List<BedRoom> bedRoom;

    public HouseBuilder kitchen(Kitchen kitchen) {
        this.kitchen = kitchen;
        return this;
    }
    public HouseBuilder diningRoom(DiningRoom diningRoom) {
        this.diningRoom = diningRoom;
        return this;
    }

    public HouseBuilder bedRoom(List<BedRoom> bedRoom) {
        this.bedRoom = bedRoom;
        return this;
    }

    public HouseBuilder bedRoom(BedRoom bedRoom) {
        if(this.bedRoom == null) {
            this.bedRoom = new ArrayList<>();
        }
        this.bedRoom.add(bedRoom);
        return this;
    }

    public House build() {
        return new House(kitchen, diningRoom, bedRoom);
    }
}
