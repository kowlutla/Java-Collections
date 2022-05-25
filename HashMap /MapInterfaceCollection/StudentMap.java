package MapInterfaceCollection;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class StudentMap 
{

	public static void main(String[] args) throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		HashMap<String,String>map=new HashMap<>();
		map.put("name", "kowlutla");
		map.put("village","P.kota Konda");
		map.put("father","keshavaiah");
		map.put(null, null);
//		map.put("village","kurnool"); 
		
		//Printing using set
		Set<String>keys=map.keySet();
		for(String key:keys)
		{
			System.out.println(key+"\t"+map.get(key));
		}
		System.out.println("Printing using entryset()");
		for(Entry<String,String> e:map.entrySet())
		{
			System.out.println(e.getKey()+"\t"+e.getValue());
		}
		System.out.println("Using iterator: ");
		Iterator<String> iter=map.keySet().iterator();
		while(iter.hasNext())
		{
			String key=(String) iter.next();
			System.out.println(map.get(key));
		}
		System.out.println("Entry Iterator------");
		Iterator<Entry<String,String>>it=map.entrySet().iterator();
		while(it.hasNext())
		{
			Entry<String,String>entry=it.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		System.out.println("------------------------------------");
		System.out.println("using enumearation---------");
//		Enumeration en=((Hashtable<String, String>) map).elements();
//		while(en.hasMoreElements())
//		{
//			System.out.println(en.nextElement());
//		}
		System.out.println("Hash code: "+map.hashCode());
		System.out.println("---------------------------------------------Cloned Objects");
		Map<String,String>map1=new HashMap<String,String>();
		map1=(Map<String, String>) map.clone();
		System.out.println(map1);
//		Map<String,Student>stumap=new HashMap<String,Student>();
//		System.out.print("No of details: ");
//		int n=Integer.parseInt(br.readLine());
//		for(int i=1;i<=n;i++)
//		{
//			System.out.println("Student "+i+" Details---- ");
//			System.out.print("Id: ");
//			String id=br.readLine();
//			System.out.print("Name: ");
//			String name=br.readLine();
//			System.out.println("Age: ");
//			int age=Integer.parseInt(br.readLine());
//			stumap.put(id, new Student(name,age));
//		}
//		System.out.println("-------------------------------------\nStudents details are:");
//		for(Entry<String,Student> e:stumap.entrySet())
//		{
//			System.out.println(e.getKey()+"- - > "+e.getValue());
//		}
//		System.out.println(stumap.containsKey("r151337"));
//		
		br.close();
	}

}
