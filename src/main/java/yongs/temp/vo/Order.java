package yongs.temp.vo;

import java.util.Map;

public class Order {
	private Map<String, String> shoppingcart;
	private Stock stock;
	private Account account;
	
	public Map<String, String> getShoppingcart() {
		return shoppingcart;
	}
	public void setShoppingcart(Map<String, String> shoppingcart) {
		this.shoppingcart = shoppingcart;
	}
	public Stock getStock() {
		return stock;
	}
	public void setStock(Stock stock) {
		this.stock = stock;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
}
