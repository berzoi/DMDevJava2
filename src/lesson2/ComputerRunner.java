package lesson2;

public class ComputerRunner {
    public static void main(String[] args) {

        Computer laptop = new Laptop(new Ssd(750), new Ram( 2048), 100);
        Computer noteBook = new NoteBook(new Ssd(1200), new Ram( 1200));
//        laptop.getRam();
//        laptop.load();
//        noteBook.load();
//        laptop.start();
//        noteBook.start();
        loadComputers(laptop, noteBook);
    }
    public static void loadComputers(Computer...computers){
        for (Computer computer : computers) {
            computer.start();

        }
    }
}
