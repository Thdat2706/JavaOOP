package QuanLiSach.singleton;

import java.util.HashMap;
import java.util.Map;

import QuanLiSach.entity.Book;

public class Cart {
	private static Map<Integer, Integer> cart;

	private Cart(){
	}
	
	static public Map<Integer, Integer> getInstance() {
		if (cart == null) {
			cart = new HashMap<Integer, Integer>();
			return cart;
		}
		return cart;
	}

	static public boolean addToCart(int id, int quantity) {
		if(Inventory.isValid(id) == false) {
			return false;
		}
		Book temp = Inventory.getBook(id);
		if(temp.getQuantity() < quantity) {
			return false;
		}
		else {
			int oldQuantity = temp.getQuantity();
			temp.setQuantity(oldQuantity - quantity);
		}
		if(cart.containsKey(id)) {
			int oldQuantity = cart.get(id);
			cart.put(id, oldQuantity + quantity);
		}
		else {
			cart.put(id,quantity);
		}
		return true;
	}
	
	// thuật toán cứ mội cuốn sách cho vào giỏ hàng thì thành tiền = số tiền 1 cuốn * số lượng cuốn
	static public double intoMoney() {
		double sum = 0;
		for (Integer i: cart.keySet()) {
		    sum += (cart.get(i)*Inventory.getBook(i).getPrice());
		}
		return sum;
	}
}
