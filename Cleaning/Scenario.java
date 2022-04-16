package Cleaning;

public class Scenario {
    public Scenario() {
    }

    public static void main(String[] args) {

        Room room1;
        Room room2;
        Window window1;
        Window window2;
        Floor floor1;
        Floor floor2;
        Vase vase1;

        window1 = new Window("bigWindow", "detergent", "scraper");
        window2 = new Window("smallWindow", "detergent", "rag");
        floor1 = new Floor("carpet", "vacuum");
        floor2 = new Floor("laminate", "swabber");
        vase1 = new Vase("vase1", "rag");

        room1 = new Room("bedrooom", window1, floor1);
        room2 = new Room("hall", window2, floor2);

        room1.addItem(vase1);
        room1.clean();
        room2.clean();


    }
}
