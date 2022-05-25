package ArrayListPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListSorting {

	public static void main(String[] args) {
		
		ArrayList<Employee>list=new ArrayList<Employee>();
		list.add(new Employee("Kowlutla",19,50000));
		list.add(new Employee("Sudeepthi",20,5000));
		list.add(new Employee("Hari ",24,30000));
		list.add(new Employee("Aruna",29,40000));
		list.add(new Employee("Renuka",22,20000));
		
		System.out.println("- - - - Normal List - - - - - ");
		
		for(Employee e:list)
		{
			System.out.println(e);
		}
		
		Collections.sort(list);
		
		System.out.println("\n- - - List After Sorting Based on Age Using Comparable - - -");
		
		for(Employee e:list)
		{
			System.out.println(e);
		}
		
		
			
			Collections.sort(list,(Employee e1,Employee e2)->
				{
					if(e1.getName().compareTo(e2.getName())>0)
					{
						return 1;
					}
					else
					{
						return -1;
					}
				}
			);
			System.out.println("\n- - - - List after sorting based on names- - -  ");
				
			for(Employee e:list)
			{
				System.out.println(e);
			}

			System.out.println("\n. . . . List After Sorintg based on Salaey . . . ");
			Collections.sort(list,Comparator.comparing(Employee::getSalary));
			
			for(Employee e:list)
			{
				System.out.println(e);
			}
	}
	
	

}

class Employee implements Comparable<Employee>
{
	private String name;
	private int age;
	private int salary;
	public Employee(String name, int age, int salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
	@Override
	public int compareTo(Employee e2)
	{
		if(this.getAge()>e2.getAge())
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
	
}
