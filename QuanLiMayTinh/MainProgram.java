package QuanLiMayTinh;

import java.util.Scanner;
import java.util.ArrayList;
import com.NITC.practice1.entities.CPU;
import com.NITC.practice1.entities.Hang;
import com.NITC.practice1.entities.Laptop;
import com.NITC.practice1.entities.Mainbroad;
import com.NITC.practice1.entities.Ram;

public class MainProgram {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Hang> lst_Hang = new ArrayList<Hang>();
		lst_Hang.add(new Hang("Dell"));
		lst_Hang.add(new Hang("Asus"));
		lst_Hang.add(new Hang("MSI"));

		ArrayList<CPU> lst_Cpu = new ArrayList<CPU>();
		lst_Cpu.add(new CPU("Ryzen 3 3500", lst_Hang.get(1),1));
		lst_Cpu.add(new CPU("Ryzen 4 3500", lst_Hang.get(1),2));
		lst_Cpu.add(new CPU("Intel core i 5 11500", lst_Hang.get(2),1));

		ArrayList<Ram> lst_Ram = new ArrayList<Ram>();
		lst_Ram.add(new Ram("2600 Ghz 8GB", lst_Hang.get(0),2));
		lst_Ram.add(new Ram("2700 Ghz 12GB", lst_Hang.get(1),3));
		lst_Ram.add(new Ram("3200 Ghz 16GB", lst_Hang.get(2),1));

		ArrayList<Mainbroad> lst_Main = new ArrayList<Mainbroad>();
		lst_Main.add(new Mainbroad("X881", lst_Hang.get(2),1));
		lst_Main.add(new Mainbroad("Z772", lst_Hang.get(2),2));
		lst_Main.add(new Mainbroad("B450M", lst_Hang.get(0),2));

		ArrayList<Laptop> lst_lapTop = new ArrayList<Laptop>();

		for (int i = 0; i < lst_Hang.size(); i++) {
			Laptop lap = new Laptop();
			System.out.println("Moi ban nhap cau hinh may tinh: ");
			System.out.println("Nhap ten hang: ");
			System.out.println("1. Dell");
			System.out.println("2. Asus");
			System.out.println("3. MSI");
			lap.setHang(lst_Hang.get(input.nextInt() - 1));
			System.out.println("Nhap ten cpu: ");
			System.out.println("1. Ryzen 3 3500");
			System.out.println("2. Ryzen 4 3500");
			System.out.println("3. Intel core i 5 11500");
			lap.setCpu(lst_Cpu.get(input.nextInt() - 1));
			System.out.println("Nhap ten RAM: ");
			System.out.println("1. 2600 Ghz 8GB");
			System.out.println("2. 2700 Ghz 12GB");
			System.out.println("3. 3200 Ghz 16GB");
			lap.setRam(lst_Ram.get(input.nextInt() - 1));
			System.out.println("Nhap ten mainbroad: ");
			System.out.println("1. X881");
			System.out.println("2. Z772");
			System.out.println("3. B450M");
			lap.setMainbroad(lst_Main.get(input.nextInt() - 1));
			System.out.println("Nhap so luong may tinh: ");
			lap.setSoLuong(input.nextInt());
			lst_lapTop.add(lap);
		}
		
		for (int i = 0; i < lst_Hang.size(); i++) {
			System.out.printf("%s %s %s %s %d", lst_lapTop.get(i).getHang().getName(),lst_lapTop.get(i).getCpu().getName(),lst_lapTop.get(i).getRam().getName(),lst_lapTop.get(i).getMainbroad().getName(),lst_lapTop.get(i).getSoLuong());
			System.out.println("");
		}
	}
		
}