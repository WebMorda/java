package pro.sky.lesson11.services;

import org.springframework.stereotype.Service;
import pro.sky.lesson11.data.Product;

import java.util.HashMap;
import java.util.Map;

@Service
public class ProductServiceImpl implements ProductService {
    private final Map<Integer, Product> products;

    public ProductServiceImpl() {
        products = new HashMap<>();
        products.put(1, new Product(1, "Book"));
        products.put(2, new Product(2, "NoteBook"));
        products.put(3, new Product(3, "Comics"));
        products.put(4, new Product(4, "Manga"));
        products.put(5, new Product(5, "ArtBook"));
    }

    @Override
    public Product getProduct(int id) {
        return products.get(id);
    }
}
