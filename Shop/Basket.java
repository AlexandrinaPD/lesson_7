package Shop;

public class Basket {
    private Good[] goods;
    private Integer items;
    //ArrayList<Good> goodArrayList;

    public Basket(Integer size) {
        goods = new Good[size];
        items = 0;
        //goodArrayList = new ArrayList<>();
    }

    public Integer getItems() {
        return items;
    }

    public boolean isBasketFull() {
        if (items < goods.length) {
            return false;
        } else {
            return true;
        }
    }

    public boolean putToBasket(Good good, Integer qty) {
        if (qty > goods.length - items) {
            System.out.println("Basket is overloaded");
            return false;
        } else {
            for (int i = items; i < items + qty; i++) {
                goods[i] = good;
            }
            items = items + qty;
            System.out.println("Put " + qty + " " + good.getName() + " to basket");
            return true;
        }
    }

    public Integer getPrice() {
        Integer price = 0;
        for (int i = 0; i < items; i++) {
            System.out.println("Good #"+i+" "+goods[i].getName()+" price: "+goods[i].getCost());
            price = price + goods[i].getCost();
        }
        System.out.println("Total price: "+price);
        return price;
    }
}
