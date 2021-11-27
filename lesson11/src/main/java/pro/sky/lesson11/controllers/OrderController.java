package pro.sky.lesson11.controllers;

import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.lesson11.data.Product;
import pro.sky.lesson11.services.OrderService;

import java.util.List;

@RestController
@RequestMapping("/store/order")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping(path = "/add")
    public List<Product> addProduct(@RequestParam int[] id){

        return orderService.addProduct(id);
    }

    @GetMapping(path = "/get")
    public List<Product> getOrderProduct(){

        return orderService.getListProduct();
    }
}
