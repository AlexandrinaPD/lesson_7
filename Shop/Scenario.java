package Shop;

public class Scenario {

    private static Shop shop;

    public static void main(String[] args) {
        createShop(3);

        Good broadA = new Good("Alexandiysky", 38);
        Shelf broad = new Shelf("Broad", broadA, 100);

        Good milkP = new Good("Prostokvashino", 42);
        Shelf milk = new Shelf("Milk", milkP, 80);

        ComplexGood packB = new ComplexGood("Borjom", 60, 6);
        Shelf water = new Shelf("Water", packB, 5);

        Shopper vasya = new Shopper("Vasya", 600, 10);

        vasya.getGoods(broad, 2);
        vasya.getGoods(milk, 1);
        vasya.getGoods(water, 2);

        shop.serveShopper(vasya);
    }

    private static void createShop(int shelves) {
        shop = new Shop(shelves);
    }
}

