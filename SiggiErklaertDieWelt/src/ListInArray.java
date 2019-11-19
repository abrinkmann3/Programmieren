import java.util.ArrayList;

public class ListInArray {

	public static void main(String[] args) {
		
		ArrayList<Student> slist = new ArrayList<Student>();
		
		slist.add(new Student("Peter", "05.09.1978", 7653));
		slist.add(new Student("Wolfgang", "07.04.1958", 9489));
		slist.add(new Student("Marie", "12.19.1990", 2234));
		
		Student[] arrayshit = slist.toArray(new Student[slist.size()]);
		
		for(Student s:arrayshit) {
			System.out.println(s);
		}

	}

}
