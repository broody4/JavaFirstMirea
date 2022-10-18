package ru.mirea.task6.computer_shop;

public class Monitor {
    String resolution;
    int Hz;
    Models manufacturer;

    public void setManufacturer(Models manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setHz(int hz) {
        Hz = hz;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public String getResolution() {
        return resolution;
    }

    public int getHz() {
        return Hz;
    }

    public Models getManufacturer() {
        return manufacturer;
    }
}
