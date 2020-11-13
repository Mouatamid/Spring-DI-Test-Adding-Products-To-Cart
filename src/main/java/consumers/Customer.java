package consumers;

import models.Product;

public interface Customer {
    public boolean buy(Product product);
    public boolean remove(Product product);
}
