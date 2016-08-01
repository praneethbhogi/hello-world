import java.math.BigInteger;
import java.util.Scanner;

public class AddingLargeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		String num1=scan.nextLine();
		String num2=scan.nextLine();
		
		
		BigInteger a = new BigInteger(num1);
		BigInteger b = new BigInteger(num2);
		BigInteger sum;
		BigInteger mul;
		
		sum = a.add(b);
		mul = a.multiply(b);
		
		
		System.out.println(sum);
		
		
		
	}

}
