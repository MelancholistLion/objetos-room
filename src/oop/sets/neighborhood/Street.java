package oop.sets.neighborhood;

import java.util.TreeMap;

public class Street extends StreetBuilder {
    private String name;
    private TreeMap<Integer, House> houses;

    public static StreetBuilder builder () {
        return new StreetBuilder();
    }

    public StreetBuilder house (int number, House house) {
        houses.put(number, house);

        return this;
    }

    public TreeMap<Integer, House> getHouses() {
        return houses;
    }

    public Street(String name, TreeMap<Integer, House> houses) {
        this.name = name;
        this.houses = houses;
    }
}