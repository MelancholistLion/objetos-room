package oop.sets.neighborhood;

public class KitchenBuilder {
    private boolean stove;
    private boolean sink;
    private int windows;
    private boolean refrigerator;
    private boolean oven;
    private int width;
    private int height;
    private String color;

    public KitchenBuilder stove(boolean stove) {
        this.stove = stove;
        return this;
    }

    public KitchenBuilder sink(boolean sink) {
        this.sink = sink;
        return this;
    }

    public  KitchenBuilder windows(int windows) {
        this.windows = windows;
        return this;
    }

    public  KitchenBuilder refrigerator(boolean refrigerator) {
        this.refrigerator = refrigerator;
        return this;
    }

    public  KitchenBuilder oven(boolean oven) {
        this.oven = oven;
        return this;
    }

    public  KitchenBuilder width(int width) {
        this.width = width;
        return this;
    }

    public  KitchenBuilder height(int height) {
        this.height = height;
        return this;
    }

    public  KitchenBuilder color(String color) {
        this.color = color;
        return this;
    }

    public Kitchen build() {
        return new Kitchen(width, height, color, stove, sink, windows, refrigerator, oven);
    }
}
