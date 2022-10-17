package oop.sets.neighborhood;

public class BedRoom {
    private BedSize bedSize;
    private boolean tv;
    private int width;
    private int height;
    private String color;

    BedRoom(int width, int height, String color, BedSize bedSize, boolean tv) {
        this.width = width;
        this.height = height;
        this.color = color;
        this.bedSize = bedSize;
        this.tv = tv;
    }

    public void setBedSize(BedSize bedSize) { // Setters
        this.bedSize = bedSize;
    }

    public void setTv(boolean tv) {
        this.tv = tv;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public BedSize getBedSize() { // Getters
        return bedSize;
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

    public static BedRoomBuilder builder() {
        return new BedRoomBuilder();
    }
}
