package consumers;

import models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import services.ProductService;

@Component
public class MyCustomer implements Customer{
    private ProductService service;
    private ProductService removeService;

    @Autowired
    public void setService(@Qualifier("getProductService") ProductService service) {
        this.service = service;
    }
    @Autowired
    public void setRemoveService(@Qualifier("removeProductService") ProductService removeService) {
        this.removeService = removeService;
    }

    @Override
    public boolean buy(Product product) {
        System.out.println("Buying...");
        return this.service.processProduct(product);
    }

    @Override
    public boolean remove(Product product) {
        System.out.println("Removing...");
        return this.removeService.processProduct(product);
    }
}
