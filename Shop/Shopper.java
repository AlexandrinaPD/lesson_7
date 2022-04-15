package Shop;

public class Shopper {


    private String name;
    private Integer money;
    private Basket basket;

    public Shopper(String name, Integer money, Integer basketSize ) {
        this.name = name;
        this.money = money;
        basket = new Basket(basketSize);
    }
    public void getGoods(Shelf shelf, Integer qty){
        qty = shelf.requestGood(qty);
        if (basket.putToBasket(shelf.getGood(),qty)){
            System.out.println("Shopper "+name+" put to basket "+qty+" of "+shelf.getGoodName());
        }else{
            System.out.println("Basket is overloaded!!!");
        }
    }

    public Basket getBasket() {
        return basket;
    }

    public boolean payMoney(Integer price){
        if (money>=price){
            System.out.println(name+ " Pay "+price);
            money = money - price;
            return true;
        } else {
            System.out.println("Money is out");
            return false;
        }

    }
}
