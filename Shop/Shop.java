package Shop;

public class Shop {

        private Shelf[] shelves;

    public Shop(Integer shelvesQty) {
            shelves = new Shelf[shelvesQty];
            System.out.println("Create shop with " + shelvesQty + " shelves");
        }

        public void loadShelf (Shelf shelf, Integer shelfNum){
            shelves[shelfNum] = shelf;
            System.out.println("Put shelf " + shelf.getName() + " with " + shelf.getGoodName() + " on position " + shelfNum);
        }

        public void serveShopper (Shopper shopper){
            Basket basket = shopper.getBasket();
            Integer price = basket.getPrice();
            if (shopper.payMoney(price)) {
                System.out.println("good bye!");
            } else {
                System.out.println("Охрана! Отмена!");
            }
        }
    }
