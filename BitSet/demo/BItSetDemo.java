package demo;

import java.util.BitSet;

public class BItSetDemo {

	public static void main(String[] args) {
		BitSet set=null;
		try
		{
			set=new BitSet(-5);
		}
		catch(Exception e)
		{
			System.out.println("Don't have negative array size");
		}
		set.set(100);
//		for(int i=0;i<101;i++)
//		{
//			System.out.println(set.get(i));
//		}
		
		System.out.println(set);

	}

}
