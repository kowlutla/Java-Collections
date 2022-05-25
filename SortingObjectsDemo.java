import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingObjectsDemo 
{

	public static void main(String[] args)
	{
		List<Student>list=new ArrayList<Student>();
		list.add(new Student("kowlu",19,9.8));
		list.add(new Student("hindu",6,9.7));
		list.add(new Student("roopa",9,9.2));
		list.add(new Student("deepu",20,9.3));
		list.add(new Student("aruna",29,6.8));
		list.add(new Student("hari",24,8));
		list.add(new Student("kowlutla",19,9.7));
		list.add(new Student("hari",24,9));
		System.out.println("Insertion order: ");
		for(Student s:list)
		{
			System.out.println(s);
		}
		System.out.println("--------------------------------\n");
		System.out.println("Sorting based on ages ascending order");
		Comparator<Student>compage=Comparator.comparing(Student::getAge);
		list.sort(compage);
		for(Student s:list)
		{
			System.out.println(s);
		}
		System.out.println("--------------------------------\n");
		System.out.println("Sorting based on ages descending order");
		Comparator<Student>compagedes=Comparator.comparing(Student::getAge);
		list.sort(compagedes.reversed());
		for(Student s:list)
		{
			System.out.println(s);
		}
		
		System.out.println("---------------------------------------");
		System.out.println("Sorting based on Names in reverse order ");
		//creating new class for constructer
		list.sort((student1,student2)->
		{
			if(student1.name.compareToIgnoreCase(student2.name)>0)
			{
				return 1;
			}
			else
			{
				return -1;
			}
		});
		for(Student s:list)
		{
			System.out.println(s);
		}
		System.out.println("---------------------------------------");
		System.out.println("Sorting based on Names ");
		//creating new class for constructer
		CompareName comp=new CompareName();
		Collections.sort(list, comp.reversed());
		for(Student s:list)
		{
			System.out.println(s);
		}
		System.out.println("--------------------------------------------");
		//using e->e.method()
		System.out.println("Sorting based on cgpa: ");
		list.sort(Comparator.comparing(e ->e.getCgpa()));
		for(Student s:list)
		{
			System.out.println(s);
		}
		System.out.println("--------------------------------------------");
		//using e->e.method()
		System.out.println("Sorting based on cgpa in reversed: ");
		list.sort(Comparator.comparing(Student :: getCgpa).reversed());
		for(Student s:list)
		{
			System.out.println(s);
		}
		System.out.println("---------------------------------");
		System.out.println("Sorting using multiple attributes: ");
		//sort based on ages if ages are same sort based on name if names are same sort based on cgpa
		Comparator<Student>commulti=Comparator.comparing(Student::getAge).thenComparing(Student::getName).reversed().thenComparing(Student::getCgpa);
		list.sort(commulti);
		for(Student s:list)
		{
			System.out.println(s);
		}
	}

}

class Student implements Comparable<Student>
{
	String name;
	int age;
	float cgpa;
	public Student(String name, int age, double d) {
		super();
		this.name = name;
		this.age = age;
		this.cgpa = (float) d;
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
	public float getCgpa() {
		return cgpa;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", cgpa=" + cgpa + "]";
	}
	public void setCgpa(float cgpa) {
		this.cgpa = cgpa;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + Float.floatToIntBits(cgpa);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (Float.floatToIntBits(cgpa) != Float.floatToIntBits(other.cgpa))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public int compareTo(Student o) {
		if(this.age>o.age)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
}