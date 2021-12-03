package pro.sky.lesson11.services;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.lesson11.data.Product;
import pro.sky.lesson11.exception.ProductNotFound;

import java.util.ArrayList;
import java.util.List;

@Service
@SessionScope
public class OrderServiceImpl implements OrderService {
    private final List<Product> order;
    private final ProductService productService;

    public OrderServiceImpl(ProductService productService) {
        order = new ArrayList<>();
        this.productService = productService;
    }

    @Override
    public List<Product> getListProduct() {
        return new ArrayList<>(order);
    }

    @Override
    public List<Integer> addProduct(List<Integer> id) {
        List<Integer> products = new ArrayList<>();
        if (id.size() > 0) {
            for (int i : id) {
                Product product = productService.getProduct(i);

                if (product != null) {
                        order.add(product);
                        products.add(product.getId());
                } else {
                    throw new ProductNotFound();
                }
            }
        }
        return products;
    }
}
