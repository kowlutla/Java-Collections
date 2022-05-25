package hashMapSorting;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;
public class HashMapSorting 
{

	public static void main(String[] args) 
	{
		HashMap<String,Student>hashmap=new HashMap<String,Student>();
		hashmap.put("R151337", new Student("Kowlutla",19));
		hashmap.put("R151129", new Student("Sudeepthi",19));
		hashmap.put("R151335", new Student("Hari",24));
		hashmap.put("R151338", new Student("Hindu",6));
		hashmap.put("R151339", new Student("Roopa",8));
		hashmap.put("R151333",new Student("Kowlutla",2));
		hashmap.put("R151334",new Student("Kowlutla",36));
		Iterator<Entry<String,Student>>iterator=hashmap.entrySet().iterator();
		while(iterator.hasNext())
		{
			Entry<String,Student>e=iterator.next();
			System.out.println(e.getKey()+"==>"+e.getValue());
		}
		System.out.println("-------------------------------------------------");
		System.out.println("Sorting based on keys: ");
		Set<String>set=new TreeSet<String>(hashmap.keySet());
		for(String s:set)
		{
			System.out.println(s+"==>"+hashmap.get(s));
		}
		System.out.println("-------------------------------------------------");
		System.out.println("Sorting based on values of Student Name: ");
		sortByStudentName(hashmap);
		System.out.println("---------------------------------------------");
		System.out.println("Sorting based on values of Student Age: ");
		sortByStudentAge(hashmap);
		System.out.println("--------------------------------------------------");
		System.out.println("\nSorting based on values of student age and name: ");
		sortByStudentAgeThenName(hashmap);
		
		System.out.println("\nSize of HashMap is: "+hashmap.size());
		
		System.out.println("kowlutla".compareTo("sudeepthi"));
		
	}

	//sort map based on value of student age
	private static void sortByStudentAge(HashMap<String, Student> hashmap)
	{
		List<Entry<String,Student>>list=new LinkedList<Entry<String,Student>>(hashmap.entrySet());
		Collections.sort(list,(Entry<String, Student> o1, Entry<String, Student> o2)->
		{
				
				if(o1.getValue().getAge()>(o2.getValue().getAge()))
				{
					return 1;
				}
				else
				{
					return -1;
				}
		});
		Iterator<Entry<String,Student>>iter=list.iterator();
		while(iter.hasNext())
		{
			Entry<String,Student>e=iter.next();
			System.out.println(e.getKey()+"- - >"+e.getValue());
		}
	}

	
	//sort map based on value of student name
	private static void sortByStudentName(HashMap<String, Student> hashmap)
	{
		List<Entry<String,Student>>list=new ArrayList<Entry<String,Student>>(hashmap.entrySet());
		Collections.sort(list,(Entry<String, Student> o1, Entry<String, Student> o2)->
				{
						
						if(o1.getValue().getName().compareTo(o2.getValue().getName())>0)
						{
							return 1;
						}
						else
						{
							return -1;
						}
				});
		
			Iterator<Entry<String,Student>>iter=list.iterator();
			while(iter.hasNext())
			{
				Entry<String,Student>e=iter.next();
				System.out.println(e.getKey()+"= = > "+e.getValue());
			
			}
	}
	
	
	
	private static void sortByStudentAgeThenName(HashMap<String,Student> map)
	{
		List<Entry<String,Student>>list=new ArrayList<Entry<String,Student>>(map.entrySet());
//		Collections.sort(list, new Comparator<Entry<String,Student>>()
//		{
//				public int compare(Entry<String,Student> e1,Entry<String,Student> e2)
//				{
//					if(e1.getValue().getAge()>e2.getValue().getAge())
//					{
//						return 1;
//					}
//					else if(e1.getValue().getAge()<e2.getValue().getAge())
//					{
//						return -1;
//					}
//					else
//					{
//						if(e1.getValue().getName().compareTo(e2.getValue().getName())>0)
//						{
//							return 1;
//						}
//						else
//						{
//							return -1;
//						}
//					}
//				}
//		}
//		.thenComparing(new Comparator<Entry<String,Student>>()
//				{
//					public int compare(Entry<String,Student>s1,Entry<String,Student>s2)
//					{
//						if(s1.getValue().getName().compareTo(s2.getValue().getName())>0)
//						{
//							return 1;
//						}
//						else
//						{
//							return -1;
//						}
//					}
//				}
//				)
//		);
		
		Collections.sort(list, new Comparator<Entry<String,Student>>()
				{
						public int compare(Entry<String,Student> e1,Entry<String,Student> e2)
						{
							return e1.getValue().getName().compareTo(e2.getValue().getName());
						}
				}.thenComparing(new Comparator<Entry<String,Student>>()
						{
							public int compare(Entry<String,Student> s1,Entry<String,Student> s2)
							{
								if(s1.getValue().getAge()>(s2.getValue().getAge()))
								{
									return 1;
								}
								else
								{
									return -1;
								}
							}
						}
						));
		
		Iterator<Entry<String,Student>>iter=list.iterator();
		while(iter.hasNext())
		{
			Entry<String,Student>e=iter.next();
			System.out.println(e.getKey()+"= = > "+e.getValue());
		
		}
	}
	
	
	

}
class Student
{
	String name;
	int age;
	public Student(String name, int age) 
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
	
}
