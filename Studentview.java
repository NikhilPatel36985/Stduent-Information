package student.view;

import java.util.Scanner;

public class Studentview {

	public Scanner sc = new Scanner(System.in);

	public int showMenu() {
		System.out.println("Enter 1 for insert");
		System.out.println("Enter 2 for update");
		System.out.println("Enter 3 for delete");
		System.out.println("Enter 4 for show");
		System.out.println("Enter 5 for random data");
		System.out.println("Enter 6 for asc desc");
		System.out.println("Enter 7 for exit....");
		return sc.nextInt();
	}
	
	public int getID() {
		System.out.println("Enter the id");
		return sc.nextInt();
	}
	public String getName() {
		System.out.println("Enter the Name :");
		sc.nextLine();
		return sc.nextLine();
	}
	public int getAge() {
		System.out.println("Enter the Age : ");
		return sc.nextInt();
	}
	public String getSorting() {
		System.out.println("Enter the sorting namme :");
		return sc.nextLine();
	}
}
