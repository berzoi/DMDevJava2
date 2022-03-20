package lesson2;

public abstract class Computer {
    private Ssd ssd;
    private Ram ram;

    public Computer(Ssd ssd, Ram ram) {
        this.ssd = ssd;
        this.ram = ram;
    }

    public Ssd getSsd() {
        return ssd;
    }

    public Ram getRam() {
        return ram;
    }
    abstract void load();

    void start(){
        System.out.println("Computer is starting");
    }

//    void load(){
//        System.out.println("Loaded");
//    }
}
