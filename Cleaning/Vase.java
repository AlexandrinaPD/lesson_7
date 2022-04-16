package Cleaning;

public class Vase implements Cleanable {


    String nameItem;
    String instrument;

    public Vase(String nameItem, String instrument) {
        this.nameItem = nameItem;
        this.instrument = instrument;
    }

    @Override
    public void clean() {
        System.out.println("The " + nameItem + " has already been cleaned by " + instrument);

    }
}
