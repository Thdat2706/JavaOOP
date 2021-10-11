package abs_QuanLiSach.singleton;

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
	
	// thuáº­t toĂ¡n cá»© má»™i cuá»‘n sĂ¡ch cho vĂ o giá»� hĂ ng thĂ¬ thĂ nh tiá»�n = sá»‘ tiá»�n 1 cuá»‘n * sá»‘ lÆ°á»£ng cuá»‘n
	static public double intoMoney() {
		double sum = 0;
		for (Integer i: cart.keySet()) {
		    sum += (cart.get(i)*Inventory.getBook(i).getPrice());
		}
		return sum;
	}
}
