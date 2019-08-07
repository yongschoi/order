package yongs.temp.service;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import yongs.temp.vo.Account;
import yongs.temp.vo.Stock;

@Service
public class OrderService {
    private static final Logger logger = LoggerFactory.getLogger(OrderService.class);
    
    /* Target URL */
	private static String SHOPPINGCART_URL = "http://yongs-shoppingcart/shoppingcarts/" + "scott";
	private static String STOCK_URL = "http://yongs-stock/stocks/" + "10001";
	private static String ACCOUNT_URL = "http://yongs-account/accounts/" + "scott";
	
    @Autowired
	private RestTemplate restTemplate;
   
    public Map<String, String> getShoppingcart() throws Exception{
    	logger.debug("yongs-order|OrderService|getShoppingcart()");
    	ResponseEntity<Map<String, String>> response =  restTemplate.exchange(
    			SHOPPINGCART_URL,
        		HttpMethod.GET,
        		null,
        		new ParameterizedTypeReference<Map<String, String>>() {});
        
        return response.getBody(); 	
    }
 
    public Stock getStock() throws Exception{
    	logger.debug("yongs-order|OrderService|getStock()");
    	ResponseEntity<Stock> response =  restTemplate.exchange(
    			STOCK_URL,
        		HttpMethod.GET,
        		null,
        		Stock.class);
        
        return response.getBody(); 	
    }
    
    public Account getAccount() throws Exception{
    	logger.debug("yongs-order|OrderService|getAccount()");
    	ResponseEntity<Account> response =  restTemplate.exchange(
    			ACCOUNT_URL,
        		HttpMethod.GET,
        		null,
        		Account.class);
        
        return response.getBody(); 	
    }
}