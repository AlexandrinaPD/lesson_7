package Cleaning;

public class Floor implements Cleanable {


    String nameItem;
    String instrument;

    public Floor(String nameItem, String instrument) {
        this.nameItem = nameItem;
        this.instrument = instrument;
    }

    @Override
    public void clean() {
        System.out.println("The " + nameItem + " has already been cleaned by " + instrument);

    }
}
