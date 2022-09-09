package dbms;

import java.util.Comparator;

public class SortStudentByAge implements Comparator<Student> {
	public int compare( Student x,Student y) {
		return x.getAge()-y.getAge();
	}

}
