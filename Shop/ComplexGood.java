package Shop;

public class ComplexGood  extends Good {
    private Integer qty;

    public ComplexGood(String name, Integer cost, Integer qty) {
        super(name, cost);
        this.qty = qty;
    }

    @Override
    public Integer getCost() {
        return super.getCost() * qty;
    }

}
