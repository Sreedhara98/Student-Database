package dbms;

import java.util.Scanner;

public class Registration {
	public static void main(String[] args) {
		
	Scanner ip = new Scanner(System.in);
	System.out.println("WEL COME");
	System.out.println("...........");
	
	Studentmanagmentdatabasesystem obj = new StudentmanagmentsystemImp();
	
	while(true) {
		System.out.println("1.ADD STUDENT\n2.REMOVE STUDENT");
		System.out.println("3.REMOVE ALL STUDENT\n4.DISPLAY STUDENT");
		System.out.println("5.DISPLAY ALL STUDENT\n6.UPDATE STUDENT");
		System.out.println("7.COUNT STUDENT\n8.SORT STUDENT\n9.EXIT");
		System.out.println("Enter choice");
		
		int choice = ip.nextInt();
		
		switch(choice) {
		
		case 1: 
			obj.addStudent();
			break;
			
		case 2:
			obj.removeStudent();
			break;
		
		case 3:
			obj.removeAllStudent();
			break;
		
		case 4:
			obj.displayStudent();
			break;
		case 5:
			obj.displayAllStudent();
			break;
		case 6:
			obj.updateStudent();
			break;
		case 7:
			obj.countStudent();
			break;
		case 8:
			obj.sortStudent();
			break;
		case 9:
			System.out.println("Thank You!!!");
			System.exit(0);
			
		default:
			System.out.println("Enter choice, Kindly Enter Valid Choice");
		}
		
		System.out.println("........");
	}
	
}
}