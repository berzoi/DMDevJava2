package lesson2;

public class Laptop extends Computer{
    private int weight;

    public Laptop(Ssd ssd, Ram ram, int weight) {
        super(ssd, ram);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void openLid(){
        System.out.println("Lid is opened");
    }





    @Override
    void load() {
        System.out.println("Load Laptop");
    }
}
