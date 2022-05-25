package ArrayListPrograms;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class SortingArrays 
{


	public static void main(String args[])throws Exception 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Array1 length: ");
		int len1=Integer.parseInt(br.readLine());
		System.out.print("Array2 length: ");
		int len2=Integer.parseInt(br.readLine());
		int array1[]=new int[len1];
		int array2[]=new int[len2];
		System.out.println("------------Enter elements to array1--------");
		for(int i=0;i<len1;i++)
		{
			System.out.print("Element "+(i+1)+" : ");
			array1[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("------------Enter elements to array2--------");
		for(int i=0;i<len2;i++)
		{
			System.out.print("Element "+(i+1)+" : ");
			array2[i]=Integer.parseInt(br.readLine());
		}
		ArrayList<Integer>list1=new ArrayList<Integer>(len1);
		for(int i=0;i<len1;i++)
		{
			list1.add(array1[i]);
		}
	///	ArrayList<Integer>list2=new ArrayList<Integer>(len2);
		for(int i=0;i<len2;i++)
		{
			list1.add(array2[i]);
		}
		Collections.sort(list1);
		for(int i: list1)
		{
			System.out.print(i+"  ");
		}
	}
}
