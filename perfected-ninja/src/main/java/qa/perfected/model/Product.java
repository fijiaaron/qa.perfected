package qa.perfected.model;

import java.util.List;

public class Product {
    public String productName;
    public List<Feature> features;

    public static Product Create(String productName) {
        Product product = new Product();
        product.productName = productName;

        return product;
    }
}
