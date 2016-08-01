import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CountWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "This is praneeth i am just testing testing";
		String[] wcount = str.split(" ");
		int length = wcount.length;
		System.out.println(length);
		Set<String> mySet = new HashSet<String>(Arrays.asList(wcount));
		
		Iterator itr = mySet.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		int length1 = mySet.size();
		System.out.println(length1);
		
		
		
		
		
		
		

	}

}
