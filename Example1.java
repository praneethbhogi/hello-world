import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int flaga=0;
		int flagb=0;
		int flagc=0;
		int flagd=0;
		
		System.out.println("Enter a String");
		
		Scanner scan = new Scanner(System.in);
		
		String s;
		s = scan.nextLine();
		
		for(int i =0; i<s.length();i++)
		{
			if(s.charAt(i)=='a')
			{
				flaga += 1;	
			}
			if (s.charAt(i)=='b')
			{
				flagb+=1;
			}
			 if (s.charAt(i)=='c')
			{
				flagc+=1;
			}
			if(s.charAt(i)=='d')
			{
				flagd+=1;
			}
		}
		
		//System.out.println(flaga + " "+flagb+" "+flagc+" "+flagd);
		
		int add_a_c=0;
		int add_b_d=0;
		
		add_a_c=flaga+flagc;
		add_b_d=flagb+flagd;
		
		if(add_a_c % 2 == 0 && add_b_d % 2==0)
		{
			System.out.println("String is Balanced");
		}
		
		else System.out.println("String is not Balanced");
		
		
		

	}

}
