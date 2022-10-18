package ru.mirea.task6.computer_shop;

public class VideoCard {
    int memoryGb;
    Models manufacturer;

    public void setManufacturer(Models manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setMemoryGb(int memoryGb) {
        this.memoryGb = memoryGb;
    }

    public Models getManufacturer() {
        return manufacturer;
    }

    public int getMemoryGb() {
        return memoryGb;
    }
}
