package Exercise.School;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Subject> lst_sj = new ArrayList<Subject>();
		lst_sj.add(new Subject("Math"));
		lst_sj.add(new Subject("Biology"));
		lst_sj.add(new Subject("English"));

		ArrayList<Teacher> lst_teacher = new ArrayList<Teacher>();
		lst_teacher.add(new Teacher("A", 25, "123", lst_sj.get(0)));
		lst_teacher.add(new Teacher("B", 26, "234", lst_sj.get(1)));
		lst_teacher.add(new Teacher("C", 27, "345", lst_sj.get(2)));

		ArrayList<Security> lst_security = new ArrayList<Security>();
		lst_security.add(new Security("A", 25, "123", 100));
		lst_security.add(new Security("B", 25, "123", 200));
		lst_security.add(new Security("C", 25, "123", 300));

		ArrayList<Student> lst_student = new ArrayList<Student>();
		lst_student.add(new Student("A", 15, "123", 10));
		lst_student.add(new Student("B", 16, "123", 11));
		lst_student.add(new Student("C", 17, "123", 12));

		while(true) {
			Scanner input = new Scanner(System.in);
			System.out.println("Ban muon in danh sach nao:");
			System.out.println("1.Teacher");
			System.out.println("2.Student");
			System.out.println("3.Security");
			int choose = input.nextInt();
			if(choose == 1) {
				System.out.printf("name\tage\tCCCD\tsubject\n");
				for (int i = 0; i < lst_teacher.size(); i++) {
					System.out.println(lst_teacher.get(i).getName() + "\t" + lst_teacher.get(i).getAge() + "\t"
							+ lst_teacher.get(i).getCCCD() + "\t" + lst_teacher.get(i).getSubject().getName());
				}
			}
			else if(choose == 2) {
				System.out.printf("name\tage\tCCCD\tgrade\n");
				for (int i = 0; i < lst_teacher.size(); i++) {
					System.out.println(lst_student.get(i).getName() + "\t" + lst_student.get(i).getAge() + "\t"
							+ lst_student.get(i).getCCCD() + "\t" + lst_student.get(i).getGrade());
				}
			}
			else if(choose == 3) {
				System.out.printf("name\tage\tCCCD\tsalary\n");
				for (int i = 0; i < lst_security.size(); i++) {
					System.out.println(lst_security.get(i).getName() + "\t" + lst_security.get(i).getAge() + "\t"
							+ lst_security.get(i).getCCCD() + "\t" + lst_security.get(i).getSalary());
				}
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
