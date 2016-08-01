import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter number of inputs ");
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		
		System.out.println("Printing the the array ");
		
		for(int j:arr)
		{
			System.out.println(arr[j]);
		}
		

	}

}
