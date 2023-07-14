package solid;

import java.util.List;

public class QuantityCalculator {

    private List<BaseProduct> products;

    public QuantityCalculator(List<BaseProduct> products) {
        this.products = products;
    }

    public double getAmountKG(){
       double sum = 0;
       for (BaseProduct product : this.products){
           sum += product.getAmountKG();
       }
       return sum;
    }

    public double getAverageAmount(){
        return this.getAmountKG() / this.products.size();
    }
}
