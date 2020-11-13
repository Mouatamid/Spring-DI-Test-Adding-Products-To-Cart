package services;

import models.Product;

public class RemoveProductFromCartService implements ProductService{
    @Override
    public boolean processProduct(Product product) {
        System.out.printf("%s with price %s was removed from the cart%n", product.getName(), product.getPrice());
        return true;
    }
}
