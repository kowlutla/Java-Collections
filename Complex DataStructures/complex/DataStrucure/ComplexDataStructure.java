package complex.DataStrucure;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ComplexDataStructure {
	
	public static String[] vehical= {"Ambulance","Helicopter","lifeboat"};
	
	public static String[][]drivers= {
			{"Fred","Sue","Pete"},
			{"Sue","Richard","Bob","Fred"},
			{"Pete","Mary","bob"}
	};
	

	
	
	public static void main(String[] args) {
		
		HashMap<String,Set<String>>map=new HashMap<String,Set<String>>();
		
		for(int i=0;i<vehical.length;i++)
		{
			String veh=vehical[i];
			Set<String>driverSet=new HashSet<String>();
			String []vehicalList=drivers[i];
			
			for(String d:vehicalList)
			{
				driverSet.add(d);
			}
			
			map.put(veh, driverSet);
		}
		
		System.out.println("- - - - Vehical And Drivers List - - - -\n ");
		
		Iterator<String>iter=map.keySet().iterator();
		
		while(iter.hasNext())
		{
			String veh=iter.next();
			System.out.println("Vehical: "+veh);
			System.out.print("Drivers: "+map.get(veh));
			System.out.println();
		}
	}
	
	
	
	

}
