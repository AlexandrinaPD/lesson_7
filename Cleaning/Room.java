package Cleaning;

public class Room implements Cleanable {


    String name;
    Window window;
    Floor floor;
    Cleanable[] items = new Cleanable[100];

    public Room(String name, Window window, Floor floor) {
        this.name = name;
        this.window = window;
        this.floor = floor;
    }

    @Override
    public void clean() {
        System.out.println("We start cleaning " + name);
        window.clean();
        floor.clean();
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null) {
                items[i].clean();
            }
        }

    }

    public void addItem(Cleanable item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                break;
            }
        }
    }

}
