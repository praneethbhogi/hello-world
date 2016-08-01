import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {10,5,3};
		int temp=0;
		
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=1;j<a.length-i-1;j++)
			{
				if(a[i]>a[j])
				{
				temp = a[i];
				a[i]=a[j];
				a[j]=temp;
				
				
				System.out.println(Arrays.toString(a));
				
				}
				System.out.println("i->" +i + "j->" +j);
			}
			
		}
		
		for(int j=0;j<a.length;j++)
		{
			System.out.print(a[j]+" ");
			
		}
	}

}
