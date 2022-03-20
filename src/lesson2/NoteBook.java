package lesson2;

import java.util.SortedMap;

public class NoteBook extends Computer{

    public NoteBook(Ssd ssd, Ram ram) {
        super(ssd, ram);
    }

    @Override
    void load() {
        System.out.println("Load Notebook");
    }

    @Override
    void start() {
        super.start();
        System.out.println("Notebook is starting");
    }
}
