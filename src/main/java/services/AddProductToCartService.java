package services;

import models.Product;

public class AddProductToCartService implements ProductService {
    @Override
    public boolean processProduct(Product product) {
        System.out.printf("%s with price %s was added to the cart%n", product.getName(), product.getPrice());
        return true;
    }
}
