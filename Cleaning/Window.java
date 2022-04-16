package Cleaning;

public class Window implements Cleanable {

    String nameItem;
    String instrument;
    String instrument2;

    Window(String name, String instrument, String instrument2) {

        this.nameItem = name;
        this.instrument = instrument;
        this.instrument2 = instrument2;
    }

    @Override
    public void clean() {
        System.out.println("The " + nameItem + " has already been cleaned by " + instrument + " and " + instrument2);


    }
}




