package solid;

import java.util.List;

public class CalorieCalculator {

    private List<BaseProduct> baseProduct;


    public CalorieCalculator(List<BaseProduct> products) {
        this.baseProduct = products;
    }

    public double sum() {
        double sum = 0;
        for (BaseProduct product : this.baseProduct) {
            sum += product.getCalorie();
        }
        return sum;
    }

    public double average() {
        return this.sum() / this.baseProduct.size();
    }
}
