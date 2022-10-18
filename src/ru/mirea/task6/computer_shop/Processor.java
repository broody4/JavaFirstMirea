package ru.mirea.task6.computer_shop;

public class Processor {
    Models manufacturer;
    int Hz;

    public void setManufacturer(Models manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setHz(int hz) {
        Hz = hz;
    }

    public Models getManufacturer() {
        return manufacturer;
    }

    public int getHz() {
        return Hz;
    }
}
