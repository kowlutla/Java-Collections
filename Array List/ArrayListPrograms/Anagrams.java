package ArrayListPrograms;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Anagrams {

	public static void main(String[] args) throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Sentence 1:");
		String s1=br.readLine();
		System.out.print("Enter Sentence 2:");
		String s2=br.readLine();
		s1=s1.replaceAll("\\s","").toLowerCase();
		s2=s2.replaceAll("\\s","").toLowerCase();
		
		//take all the characters of string 1 into list1
		ArrayList<Character>list1=new ArrayList<Character>();
		for(int i=0;i<s1.length();i++)
		{
			
			list1.add(s1.charAt(i));
		}
		ArrayList<Character>list2=new ArrayList<Character>();
		//take all the characters of string 2 into list2
		for(int i=0;i<s2.length();i++)
		{
			list2.add(s2.charAt(i));
		}
		Collections.sort(list1);
		Collections.sort(list2);
		if(list1.equals(list2))
		{
			System.out.println("Anagrams");
		}
		else
		{
			System.out.println("Not Anagrams");
		}
		

	}

}
