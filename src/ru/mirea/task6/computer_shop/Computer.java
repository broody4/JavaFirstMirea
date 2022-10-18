package ru.mirea.task6.computer_shop;

public class Computer implements Report{
    public String name;
    public Memory memory = new Memory();
    public Monitor monitor = new Monitor();
    public Processor processor = new Processor();
    public VideoCard videoCard = new VideoCard();
    public Computer(String name, int amountGb,Models memory_manufacturer,
                    String resolution,int monitor_Hz,Models monitor_manufacturer,
                    Models Proc_manufacturer,int Proc_Hz,int Video_memoryGb,Models Video_manufacturer){
        this.name = name;
        this.memory.setManufacturer(memory_manufacturer);
        this.memory.setAmountGb(amountGb);
        this.monitor.setResolution(resolution);
        this.monitor.setHz(monitor_Hz);
        this.monitor.setManufacturer(monitor_manufacturer);
        this.processor.setHz(Proc_Hz);
        this.processor.setManufacturer(Proc_manufacturer);
        this.videoCard.setMemoryGb(Video_memoryGb);
        this.videoCard.setManufacturer(Video_manufacturer);
    }
    @Override
    public void print(){
        System.out.println("Computer{name = "+this.name+", amountGb = "+ this.memory.getAmountGb()+
                ", memory_manufacturer = "+this.memory.getManufacturer() +", \nresolution = "+
                this.monitor.getResolution()+", monitor_Hz = "+this.monitor.getHz()+", monitor_manufacturer = "+
                this.monitor.getManufacturer()+", \nProc_manufacturer = "+this.processor.getManufacturer() +
                ", Proc_Hz = "+this.processor.getHz()+", \nVideo_memoryGb = "+this.videoCard.getMemoryGb()+
                ", Video_manufacturer = " + this.videoCard.getManufacturer() +"}");
    }

}
