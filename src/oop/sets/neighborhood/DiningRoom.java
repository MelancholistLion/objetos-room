package oop.sets.neighborhood;

public class DiningRoom {
    private int windows;
    private boolean tv;
    private int width;
    private int height;
    private String color;
    private int chairsCapacity;

    DiningRoom(int width, int height, String color, int windows, boolean tv, int chairsCapacity) {
        this.width = width;
        this.height = height;
        this.color = color;
        this.windows = windows;
        this.tv = tv;
        this.chairsCapacity = chairsCapacity;
    }

    public int getWindows() { // Getters
        return windows;
    }

    public boolean getTv() {
        return tv;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    public static DiningRoomBuilder builder() {
        return new DiningRoomBuilder();
    }
}
