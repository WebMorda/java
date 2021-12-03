package pro.sky.lesson11.services;

import pro.sky.lesson11.data.Product;

import java.util.List;

public interface OrderService {
    List<Product> getListProduct();
    List<Integer> addProduct(List<Integer> id);
}
