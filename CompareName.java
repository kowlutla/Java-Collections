import java.util.Comparator;

public class CompareName implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.name.compareToIgnoreCase(o2.name)>0)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}

}
