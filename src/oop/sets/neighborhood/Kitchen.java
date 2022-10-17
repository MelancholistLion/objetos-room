package oop.sets.neighborhood;
public class Kitchen {
    private boolean stove;
    private boolean sink;
    private int windows;
    private boolean refrigerator;
    private boolean oven;
    private int width;
    private int height;
    private String color;

    Kitchen(int width, int height, String color, boolean stove, boolean sink, int windows, boolean refrigerator, boolean oven) {
        this.width = width;
        this.height = height;
        this.color = color;
        this.stove = stove;
        this.sink = sink;
        this.windows = windows;
        this.refrigerator = refrigerator;
        this.oven = oven;
    }

    public boolean getStove() { // getters
        return stove;
    }

    public boolean getSink() {
        return sink;
    }

    public int getWindows() {
        return windows;
    }

    public boolean getRefrigerator() {
        return refrigerator;
    }

    public boolean getOven() {
        return oven;
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

    public static KitchenBuilder builder() {
        return new KitchenBuilder();
    }
}
