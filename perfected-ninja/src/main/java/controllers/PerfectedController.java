package controllers;

import ninja.params.PathParam;
import qa.perfected.model.Product;

import util.DataLoader;

import ninja.Result;
import ninja.Results;

import com.google.inject.Singleton;


import java.util.ArrayList;
import java.util.List;


@Singleton
public class PerfectedController {

    public Result index() {
        return Results.html();
    }


    public Result products(@PathParam("productName") String selectedProduct) {
        List<Product> products = DataLoader.getProducts();
         if (selectedProduct == null || selectedProduct == "") {
            selectedProduct = "none";
        }

        Result result = Results.html();
        result.render("products", products);

        result.render("selectedProduct", selectedProduct);

        System.out.println("selectedProduct" );

        return result;
    }

    public Result unknown() { return Results.html(); }
}

