package dbms;

import java.util.Comparator;

public class SortStudentByName  implements Comparator<Student>{
	public int compare(Student x, Student y) {
		return x.getName().compareTo(y.getName());
	}

}
