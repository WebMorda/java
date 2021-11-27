package pro.sky.lesson11.services;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.lesson11.data.Product;
import pro.sky.lesson11.exception.BadRequestException;

import java.util.ArrayList;
import java.util.List;

@Service
@SessionScope
public class OrderServiceImpl implements OrderService {
    private List<Product> order;
    private final ProductService productService;

    public OrderServiceImpl(ProductService productService) {
        order = new ArrayList<>();
        this.productService = productService;
    }

    @Override
    public List<Product> getListProduct() {
        return order;
    }

    @Override
    public List<Product> addProduct(int[] id) {
        List<Product> products = new ArrayList<>();
        if (id.length > 0) {
            for (int i : id) {
                Product product = productService.getProduct(i);

                if (product != null) {
                    if (!order.contains(product)) {
                        products.add(product);
                    }
                } else {
                    throw new BadRequestException();
                }
            }
            order.addAll(products);
        }
        return products;
    }
}
