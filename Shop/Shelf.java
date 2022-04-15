package Shop;

public class Shelf {

    private String name;
    private Good good;
    private Integer qty;

    public Shelf(String name, Good good, Integer qty) {
        this.name = name;
        this.good = good;
        this.qty = qty;
        System.out.println("Put on shelf "+name+" "+qty+" of "+good.getName());
    }

    public Integer requestGood(Integer qtyRequest) {
        if (qtyRequest > qty) {
            qtyRequest = qty;
            qty = 0;
        } else {
            qty = qty - qtyRequest;
        }
        System.out.println("Get from shelf "+name+" "+qtyRequest+" of "+good.getName());
        return qtyRequest;
    }

    public String getName() {
        return name;
    }

    public Integer getQty() {
        return qty;
    }

    public String getGoodName(){
        return good.getName();
    }

    public Good getGood() {
        return good;
    }
}
