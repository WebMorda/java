package pro.sky.lesson11.services;

import pro.sky.lesson11.data.Product;

import java.util.List;

public interface OrderService {
    List<Product> getListProduct();
    List<Product> addProduct(int[] id);
}
