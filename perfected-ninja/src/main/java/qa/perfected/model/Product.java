package qa.perfected.model;

import java.util.List;

public class Product {
    public String id;
    public String productName;
    public String description;
    public List<String> comments;

    public List<Feature> features;

    public static Product Create(String productName) {
        Product product = new Product();
        product.productName = productName;

        return product;
    }
}
