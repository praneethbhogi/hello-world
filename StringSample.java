import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

public class StringSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		
		System.out.println("Enter the number of Test cases");
		Scanner scan = new Scanner(System.in);
		n=scan.nextInt();
		
		String[] sArray=new String[n];
		for(int i=0;i<n;i++){
			sArray[i]=scan.next();
		}
		
		for(int j=0;j<n;j++){
			for(int i=0;i<sArray[j].length();i+=2){
			char c = sArray[j].charAt(i);
			System.out.print(c);
			}
			System.out.print("  ");
			for(int i=1;i<sArray[j].length();i+=2){
				char c = sArray[j].charAt(i);
				System.out.print(c);
			}
			System.out.println("");
			
		}
	}

}
