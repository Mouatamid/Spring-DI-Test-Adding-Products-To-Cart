package configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import services.ProductService;
import services.AddProductToCartService;
import services.RemoveProductFromCartService;

@Configuration
@ComponentScan(value = {"consumers"})
public class DIConfiguration {

    @Bean
    public ProductService getProductService(){
        return new AddProductToCartService();
    }
    @Bean
    public ProductService removeProductService(){ return new RemoveProductFromCartService(); }
}
