package hashMapSorting;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class UnCoupledInteger 
{
	
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc=new Scanner(System.in);
        LinkedList<Integer>list=new LinkedList<Integer>();
        for(int i=0;i<10;i++)
        {
        	System.out.print("Enter number: ");
            list.add(sc.nextInt());
        }
        Collections.sort(list);
        for(int i=0;i<list.size()-1;i++)
        {
            if(list.get(i)==list.get(i+1))
            {
                i++;
            }
            else
            {
                System.out.println(list.get(i));
            }
        }
    }
}
