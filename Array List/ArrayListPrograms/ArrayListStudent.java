package ArrayListPrograms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;

public class ArrayListStudent {

		public static void main(String args[]) throws Exception
		{
			try 
			{
				BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				ArrayList<Student>student=new ArrayList<Student>();
				Student s;
				System.out.print("Enter no of details to store: ");
				int n=Integer.parseInt(br.readLine());
				System.out.println("- - - Enter Details - - - ");
				for(int i=1;i<=n;i++)
				{
					System.out.println("- - - Details of Student "+i+" - - - ");
					System.out.print("Name: ");
					String name=br.readLine();
					System.out.print("Age: ");
					int age=Integer.parseInt(br.readLine());
					System.out.print("Cgpa: ");
					double cgpa=Double.parseDouble(br.readLine());
					s=new Student(name,age,cgpa);
					student.add(s);
				}
				System.out.println("-----------------------------------------");
				System.out.println("Writing data into file in ByteStream");
				File file=new File("data.txt");
				FileOutputStream fos=new FileOutputStream(file);
				ObjectOutputStream oos=new ObjectOutputStream(fos);
				oos.writeObject(student);
				fos.close();
				oos.close();
				
				
				System.out.println("Reading the Byte form data from file ");
				ArrayList<Student>student1=new ArrayList<Student>();
				
				FileInputStream fis=new FileInputStream(file);
				ObjectInputStream ois=new ObjectInputStream(fis);
				student1=(ArrayList<Student>)ois.readObject();
				ois.close();
				fis.close();
				System.out.println("-----------------------------");
				System.out.println("Details from file are: ");
				for(Student stu:student1)
				{
					System.out.println(stu.age);
				}
				System.out.println("------------------------------------");
				System.out.println("Sortin based on ages: ");
				Comparator<Student>compname=Comparator.comparing(Student::getAge);
				student.sort(compname);
				for(Student stu:student)
				{
					System.out.println(stu);
				}
			}
		catch(Exception e) {System.out.println(e);}

	}

}
	class Student implements Serializable
	{
		String name;
		int age;
		double cgpa;
		public Student(String name,int age,double cgpa)
		{
			this.name=name;
			this.age=age;
			this.cgpa=cgpa;
		}
		public String getName()
		{
			return name;
		}
		public int getAge()
		{
			return age;
		}
		public double getCgpa()
		{
			return cgpa;
		}
		public String toString()
		{
			return "Name: "+name+"\tAge: "+age+"\tCgpa: "+cgpa;
		}

	}
	
