package Exercise.Shape;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(true) {
			System.out.println("Chon hinh:");
			System.out.println("1. Triangle");
			System.out.println("2. Square"); 
			System.out.println("3. Rectangle");
			System.out.println("4. Parallelogram");
			int c = input.nextInt();
			if(c == 1) {
				Triangle tri = new Triangle();
				System.out.println("Moi ban nhap height va Height ");
				tri.setValues(input.nextDouble(), input.nextDouble());
				System.out.printf("Hinh nay co %d canh", tri.getNumberOfSides());
				System.out.println("");
				System.out.printf("Dien tich la: %f ", tri.getArea());
				System.out.println("");
			}
			else {
				Square sq = new Square();
				System.out.println("Moi ban nhap height va Height ");
				sq.setValues(input.nextDouble(), input.nextDouble());
				System.out.printf("Hinh nay co %d canh", sq.getNumberOfSides());
				System.out.println("");
				System.out.printf("Dien tich la: %f", sq.getArea());
				System.out.println("");
			}
			System.out.println("Ban muon tiep tuc: ");
			System.out.println("1. co");
			System.out.println("2. ko");
			int tiep = input.nextInt();
			if(tiep == 1) {
				continue;
			}
			else {
				break;
			}
		}
	}
}
