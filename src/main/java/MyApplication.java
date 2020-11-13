import configuration.DIConfiguration;
import consumers.MyCustomer;
import models.Product;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApplication {
    public static void main(String[] args) {
        Product yagourt = new Product("Danone",2);

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DIConfiguration.class);
        MyCustomer yacine = context.getBean(MyCustomer.class);

        yacine.buy(yagourt);
        yacine.remove(yagourt);
        context.close();
    }
}
