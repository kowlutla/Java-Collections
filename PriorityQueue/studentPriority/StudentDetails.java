package studentPriority;

import java.util.PriorityQueue;
import java.util.*;

public class StudentDetails {

	public static void main(String[] args) {
		
		PriorityQueue<Student>q=new PriorityQueue<Student>(Comparator.comparing(Student::getCGPA).thenComparing(Student::getName).reversed());
		q.add(new Student("kowlutla",9.8));
		q.add(new Student("aruna",9.2));
		q.add(new Student("deepu",9.7));
		q.add(new Student("hindu",9.3));
		q.add(new Student("roopa",9.0));
		q.add(new Student("hari",9.0));
		
		
		for(Student s:q)
		{
			System.out.println(s);
		}
		
		
		PriorityQueue<String>q1=new PriorityQueue<String>(Collections.reverseOrder().reversed());
		q1.add("kowlutla");
		q1.add("hindu");
		q1.add("deepu");
		q1.add("roopa");
		q1.add("hari");
		System.out.println(q1);

		System.out.println("roopa".compareTo("kowlutla"));
		
	}

}

class Student implements Comparable<Student>
{
	//private int id;
	private String name;
	private double cgpa;
	
	public Student(String name,double cgpa)
	{
		
		this.name=name;
		this.cgpa=cgpa;
	}
	
	
	public String getName()
	{
		return name;
	}
	
	public double getCGPA()
	{
		return cgpa;
	}

	
	public int compareTo(Student s2)
	{
		if(this.getName().compareTo(s2.getName())>0)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
	
	@Override
	public String toString() {
		return "Student [  name=" + name + ", cgpa=" + cgpa + "]";
	}
	
}
