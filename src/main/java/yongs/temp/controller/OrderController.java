package yongs.temp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import yongs.temp.service.OrderService;
import yongs.temp.vo.Order;

@RestController
@RequestMapping("/order")
public class OrderController {
	private Logger logger = LoggerFactory.getLogger(OrderController.class);

    @Autowired
    OrderService service;
    
    @GetMapping("")
    public Order getMain() throws Exception{
    	logger.debug("yongs-main|MainController|getMain()");
    	
    	Order order = new Order();
    	order.setShoppingcart(service.getShoppingcart());
    	order.setStock(service.getStock());
    	order.setAccount(service.getAccount());
    	
    	return order;
    }
}