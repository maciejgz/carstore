package pl.mg.carstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import pl.mg.carstore.service.OrderService;

@Controller
public class OrderController {

    @Autowired
    OrderService productService;

    @RequestMapping("/order/audi1/2")
    public String orderPorduct(Model model) {
        productService.processOrder("audi1", 2);
        return "redirect:/products";
    }

}
