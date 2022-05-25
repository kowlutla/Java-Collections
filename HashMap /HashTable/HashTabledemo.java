package HashTable;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashTabledemo 
{

	public static void main(String[] args)
	{
		Hashtable<Integer,String>hashtable=new Hashtable<Integer, String>();
		hashtable.put(1,"kowlutla");
		hashtable.put(4,"Deepu");
		hashtable.put(7,"Roopa");
		hashtable.put(3,"Hindu");
		hashtable.put(9,"Hari");
		System.out.println(hashtable);
		System.out.println("Using Iterator:");
		Iterator<Integer> iterator=hashtable.keySet().iterator();
		while(iterator.hasNext())
		{
			int key= iterator.next();
			System.out.println(key+"= = > "+hashtable.get(key));
		}
		System.out.println("-------------------------------------------------");
		System.out.println("Using Entry:");
		for(Entry<Integer, String> e:hashtable.entrySet())
		{
			System.out.println(e.getKey()+"= = > "+e.getValue());
		}
		System.out.println("-------------------------------------------------");
		System.out.println("Using Entry Iterator:");
		Iterator<Entry<Integer,String>> entryiterator=hashtable.entrySet().iterator();
		while(entryiterator.hasNext())
		{
			Entry<Integer,String>entry=entryiterator.next();
			System.out.println(entry.getKey()+"= = > "+entry.getValue());
		}
		System.out.println("-------------------------------------------------");
		System.out.println("Using Enumerator: ");
		Enumeration<String> enumeration =hashtable.elements();
		while(enumeration.hasMoreElements())
		{
			System.out.println(enumeration.nextElement());
		}
		System.out.println("-------------------------------------------------");
		System.out.println("After removing one element using key :");
		hashtable.remove(1);
		for(Entry<Integer, String> e:hashtable.entrySet())
		{
			System.out.println(e.getKey()+"= = > "+e.getValue());
		}
		System.out.println("-------------------------------------------------");
		System.out.println("After adding  new  element  :");
		hashtable.put(1,"Aruna");
		for(Entry<Integer, String> e:hashtable.entrySet())
		{
			System.out.println(e.getKey()+"= = > "+e.getValue());
		}
		System.out.println("-------------------------------------------------");
		System.out.println("Searching for object  :");
		if(hashtable.containsValue("Aruna"))
		{
			System.out.println("Table contain aruna");
		}
		else
		{
			System.out.println("Doesn't contains aruna");
		}
		
	}
}
