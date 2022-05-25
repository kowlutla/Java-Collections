package MapInterfaceCollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HashCodeEquals 
{

	public static void main(String[] args)
	{
//		Student s1=new Student("Kowlutla",19);
//		Student s2=new Student("Deepu",19);
//		Student s3=s1;
//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(s3);
//		System.out.println(s1==s2);
//		boolean value=s1.equals(s3);
//		System.out.println(value);
//		String str1="kowlutla";
//		String str2="deepu";
//		String str3="KOWLUTLA";
//		System.out.println(str1.equalsIgnoreCase(str3));
		Student s1=new Student("kowlutla",19);
		Student s2=new Student("kowlutla",19);
		Student s3=new Student("kowlutla",19);
		Student s4=new Student("kowlutla",19);
		Scanner sc=new Scanner(System.in);
		Set<Student>list=new HashSet<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		Iterator<Student> it=list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("Seraching for object: ");
		System.out.print("Student name: ");
		String s=sc.next();
		System.out.print("Age: ");
		int age=sc.nextInt();
		Student obj=new Student(s,age);
		int count=0;
		for(Student stu:list)
		{
			if(stu.equals(obj))
			{
				count++;
			}
		}
		if(count==0)
		{
			System.out.println(obj+" not in list");
		}
		else
		{
			System.out.println(obj+" in the list");
		}
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		sc.close();
	}

}
class Student
{
	String name;
	int age;
	public Student(String name,int age)
	{
		this.name=name;
		this.age=age;
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
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
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
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equalsIgnoreCase(other.name))
			return false;
		return true;
	}
}
