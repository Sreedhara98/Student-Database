package dbms;

public class Student {
	private int id;
	private String name;
	private int age;
	private Double marks;
	
	public Student(int id, String name, int age, double marks) {
		
		this.id = id;
		this.name = name;
		this.age = age;
		this.marks = marks;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Double getMarks() {
		return marks;
	}
	public void setMarks(Double marks) {
		this.marks = marks;
	}
	
	public String toString() {
		return "Id:"+id+"\tName:"+name+"\tAge:"+age+"\tMarks:"+marks;
	}
	

}
