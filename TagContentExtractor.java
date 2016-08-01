import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class TagContentExtractor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the tag value");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		Pattern p = Pattern.compile("<.+?>(.+?)</.+?>");
		Matcher m = p.matcher(str);
		
		List<String> l = new ArrayList<String>();
		
		
		while(m.find()){
		l.add(m.group(1));
		}
		
		for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i));
		}
		
		
		
		
	}

}
