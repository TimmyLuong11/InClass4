import java.util.ArrayList;
import java.util.LinkedList;

public class la 
{
	public static void main(String[] args)
	{
		int[] a = new int[2];
		a[0] = 0;
		a[1] = 1;
		
		String[] s = new String[2];
		s[0] = new String("one");
		s[1] = new String("two");
		
		ArrayList<Integer> ai = new ArrayList<>();
		ai.add(new Integer(1));
		ArrayList<Integer> a2 = new ArrayList<>(2);
		for(int index = 0; index < 10; ++index)
		{
			a2.add(new Integer(1));
		}
		
		LinkedList<Integer> ls = new LinkedList<>();
		for(int index = 0; index < 10; ++index)
		{
			ls.add(new Integer(1));
		}
		ls.addFirst(new Integer(0));
		
	}
}
