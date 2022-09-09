	package dbms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class StudentmanagmentsystemImp implements Studentmanagmentdatabasesystem{
	
	Scanner ip = new Scanner(System.in);
	
	LinkedHashMap<Integer, Student> db = new LinkedHashMap<Integer, Student>();

	@Override
	public void addStudent() {
		System.out.println("Enter Id, Name, Age and Marks");
		int id = ip.nextInt();
		String name = ip.next();
		int age = ip.nextInt();
		double marks = ip.nextDouble();
		
		Student s = new Student(id,name,age,marks);
		
		db.put(id, s);
		System.out.println("Student Record Sucessfully Inserted");
		
	}

	@Override
	public void removeStudent() {
		System.out.println("Enter a ID");
		int id = ip.nextInt();
		
		if(db.containsKey(id)) {
			db.remove(id);
			System.out.println("Student ID is removed");
		}
		else {
			try {
				throw new StudentNotFoundException("Student not found");
			}
			catch(StudentNotFoundException e) {
				System.out.println(e.getMessage());
			}
		}
		
	}

	@Override
	public void removeAllStudent() {
		db.clear();
		System.out.println("Student Record Sucessfully removed");
	}

	@Override
	public void displayStudent() {
		System.out.println("Enter a ID");
		int id = ip.nextInt();
		
		if(db.containsKey(id)) {
			Student std = db.get(id); //Student std = new Student(10,a,22,56.3)
			//System.out.println(std); //since toString is overridden
			System.out.println("ID :"+std.getId());
			System.out.println("Age:"+std.getAge());
			System.out.println("Name:"+std.getName());
			System.out.println("Marks:"+std.getMarks());
		} else {
			try {
				throw new StudentNotFoundException("Student not found");
			}
			catch(StudentNotFoundException e) {
				System.out.println(e.getMessage());
			}
			
		}
		
	}

	@Override
	public void displayAllStudent() {
		Set<Integer> s = db.keySet(); //creating set of student id's
		for(int key: s) {
			System.out.println(db.get(key));
		}
		
		// for(int key : s){
		// Student s = db.get(key);
		//System.out.println("id:"+s.getId()+"\tName:"+s.hetName());
		//System.out.println("\tAge:"+s.getAge()+" \tMarks:"+s.getMarks);
	    //}
	}

	@Override
	public void updateStudent() {
		System.out.println("Enter a Id");
		int id = ip.nextInt();
		
		if(db.containsKey(id)) {
			Student s = db.get(id);
			
			System.out.println("1:Upadate Age\n2: Upadte Name\n3.Update Marks");
			System.out.println("Enter choice");
			int choice = ip.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter age");
				int age = ip.nextInt();
				s.setAge(age);
				break;
			case 2:
				System.out.println("Enter name");
				String name = ip.next();
				s.setName(name);
				break;
			case 3:
				System.out.println("Enter marks");
				double marks = ip.nextDouble();
				s.setMarks(marks);
				break;
				default :
					System.out.println("invalid option");
			}
			
		}else {
			try {
				throw new StudentNotFoundException("Student not found");
			}
			catch(StudentNotFoundException e) {
				System.out.println(e.getMessage());
			}
		}
		
	}

	@Override
	public void countStudent() {
		System.out.println("No of Student Records Present : "+db.size());
	}

	@Override
	public void sortStudent() {
		
		ArrayList<Student> l = new ArrayList<Student>();
		
		Set<Integer> s = db.keySet();
		
		for(int id : s) {
			l.add(db.get(id));
		}
		System.out.println("1.Sort based on id\n2.Sort based on name\n3.Sort based on Age\n4.Sort based on marks ");
		System.out.println("Enter a choice");
		int choice = ip.nextInt();
		
		switch(choice) {
		
		case 1:
			Collections.sort(l, new SortStudentById());
			display(l);
			break;
		case 2:
			Collections.sort(l, new SortStudentByName());
			for(Student s2:l) {
				System.out.println(s2);
			}
			break;
		case 3:
			Collections.sort(l, new SortStudentByAge());
			for (Student s3 : l) {
				System.out.println(s3);
			}
			break;
		case 4:
			Collections.sort(l,new SortStudentByMarks());
			for(Student s4: l) {
				System.out.println(s4);
			}
			break;
			
			default :
				System.out.println("Enter a correct choice");
			}
		}
		private static void display(List<Student> l) {
			for(Student s1 : l) {
				System.out.println(s1);
			}
		}
	}

	

