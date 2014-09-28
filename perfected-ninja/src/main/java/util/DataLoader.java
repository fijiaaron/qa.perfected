package util;

import qa.perfected.model.Product;

import java.util.ArrayList;
import java.util.List;

public class DataLoader {
    public static List<Product> getProducts() {
        final String[] productNames = {"Mi", "Ci", "Si", "Star", "SRS", "PaxIS", "DDS", "Arc", "tClara"};

        List<Product> products = new ArrayList<Product>() {{
            for(String productName : productNames) {
                add(Product.Create(productName));
            }
        }};

        return products;
    }
}
