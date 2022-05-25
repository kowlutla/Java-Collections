package hashMapSorting;
import java.util.Comparator;
import java.util.Map.Entry;

public class SortByAge implements Comparator<Entry<String,Student>>
{
	@Override
	public int compare(Entry<String, Student> o1, Entry<String, Student> o2) {
		
		if(o1.getValue().age>o2.getValue().age)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}

}
