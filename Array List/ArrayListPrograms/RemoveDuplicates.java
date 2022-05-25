package ArrayListPrograms;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer>list=new ArrayList<Integer>();
		System.out.print("Enter no of elements: ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.print("Element "+i+" : ");
			int num=sc.nextInt();
			list.add(num);
		}
		System.out.println("Actual List: ");
		for(Integer i:list)
		{
			System.out.print(i+" " );
		}
		System.out.println("\nAfter removing duplicates: ");
		Set<Integer>set=new LinkedHashSet<Integer>(list);
		for(Integer i:set)
		{
			System.out.print(i+" ");
		}
		

	}

}



// How to remove duplicate elements from ArrayList in java?