package Polimorphism;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Fruit> lst_fruit = new ArrayList<Fruit>();

		lst_fruit.add(new Apple(10, "Apple AUS", 10, 100));
		lst_fruit.add(new Apple(10, "Apple VN", 5, 100));
		lst_fruit.add(new Apple(10, "Apple USA", 7, 100));

		lst_fruit.add(new Orange(10, "Orange AUS", 6, 100));
		lst_fruit.add(new Orange(10, "Orange VN", 5, 100));
		lst_fruit.add(new Orange(10, "Orange USA", 10, 100));

		lst_fruit.add(new Banana(10, "Orange AUS", 10, 100));
		lst_fruit.add(new Banana(10, "Orange AUS", 6, 100));
		lst_fruit.add(new Banana(10, "Orange AUS", 12, 100));

		ArrayList<Apple> lst_apple = new ArrayList<Apple>();
		ArrayList<Orange> lst_orange = new ArrayList<Orange>();
		ArrayList<Banana> lst_banana = new ArrayList<Banana>();

		// Down casting
		for (int i = 0; i < lst_fruit.size(); i++) {
			if (lst_fruit.get(i) instanceof Apple) {
				lst_apple.add((Apple) lst_fruit.get(i));
			} else if (lst_fruit.get(i) instanceof Orange) {
				lst_orange.add((Orange) lst_fruit.get(i));
			} else if (lst_fruit.get(i) instanceof Banana) {
				lst_banana.add((Banana) lst_fruit.get(i));
			}
		}

		while (true) {
			System.out.println("1.In danh sach cac loai hoa qua");
			System.out.println("2. Mua hoa qua");
			int c = input.nextInt();
			if (c == 1) {
				System.out.println("1.Danh sach cac loai tao");
				System.out.println("2.Danh sach cac loai cam");
				System.out.println("3.Danh sach cac loai chuoi");
				c = input.nextInt();
				if (c == 1) {
					System.out.println("Name\t\tPrice\t\tQuantity\tamountOfSugar");
					for (int i = 0; i < lst_apple.size(); i++) {
						System.out.printf("%s\t%.2f\t\t%.0f\t\t%.2f", lst_apple.get(i).getName(),
								lst_apple.get(i).getPrice(), lst_apple.get(i).getPrice(),
								lst_apple.get(i).getAmountOfSugar());
						System.out.println();
					}
				} else if (c == 2) {
					System.out.println("Name\t\tPrice\t\tQuantity\tweight");
					for (int i = 0; i < lst_orange.size(); i++) {
						System.out.printf("%s\t%.2f\t\t%.0f\t\t%.2f", lst_apple.get(i).getName(),
								lst_apple.get(i).getPrice(), lst_orange.get(i).getPrice(),
								lst_orange.get(i).getWeight());
						System.out.println();
					}
				} else if (c == 3) {
					System.out.println("Name\t\tPrice\t\tQuantity\tkali40");
					for (int i = 0; i < lst_banana.size(); i++) {
						System.out.printf("%s\t%.2f\t\t%.0f\t\t%.2f", lst_apple.get(i).getName(),
								lst_apple.get(i).getPrice(), lst_banana.get(i).getPrice(),
								lst_banana.get(i).getKali40());
						System.out.println();
					}
				}
			} else if (c == 2) {
				System.out.println("Nhap so tien: ");
				double money = input.nextDouble();
				System.out.println("Voi so tien do ban co the mua 1 trong cac lua chon sau: ");
				for (int i = 0; i < lst_fruit.size(); i++) {
					int number = (int) (money / lst_fruit.get(i).getPrice());
					if (number > lst_fruit.get(i).getQuantity()) {
						number = (int) lst_fruit.get(i).getQuantity();
					}
					System.out.printf("%d.%s: %d", i, lst_fruit.get(i).getName(), number);
					System.out.println("");
				}
				System.out.println("Ban muon mua gi:");
				c = input.nextInt();
				int number = (int) (money / lst_fruit.get(c).getPrice());
				if (number > lst_fruit.get(c).getQuantity()) {
					number = (int) lst_fruit.get(c).getQuantity();
				}
				System.out.printf("Ban da mua thanh cong %d %s", number, lst_fruit.get(c).getName());
				lst_fruit.get(c).updateQuantity(number);
				System.out.println("");
			}
		}
	}
}
