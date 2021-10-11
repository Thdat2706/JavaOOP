package abs_Fruit.singleton;

import java.util.ArrayList;
import java.util.List;

import example.entity.*;

public class Inventory {
	static private List<Fruit> inventory;

	private Inventory() {
	}

	static public List<Fruit> getInstance() {
		if (inventory == null) {
			inventory = new ArrayList<Fruit>();
		}
		return inventory;
	}

	static public boolean addFruit(Fruit fruit) { 
		inventory.add(fruit);
		return true;
	}

	static public boolean isValid(int id) {
		for (Fruit i : inventory) {
			if (i.getId() == id) {
				return true;
			}
		}
		return false;
	}

	static public Fruit getFruit(int id) {
		return inventory.get(id - 1);
	}
	
	static public boolean addQuantity(int id, int quantity) {
		if(isValid(id)) {
			Fruit temp = getFruit(id);
			int oldQuantity = temp.getQuantity();
			temp.setQuantity(oldQuantity + quantity);
			return true;
		}
		return false;
	}
}
