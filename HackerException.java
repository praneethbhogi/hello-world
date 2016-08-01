import java.util.Scanner;

class myCalculator extends Exception{
    
    int power(int n, int p) throws Exception
    {
        
        double res;
        if(n < 0 || p < 0)
        {
            throw new Exception("n and p should be non-negative");
        }
        else
        {
         
        res=Math.pow(n,p);
        int res1 = (int) res;
        return res1;
        }
    }
    
}

public class HackerException {
	public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);

        while(in.hasNextInt())
        {
            int n = in.nextInt();
            int p = in.nextInt();
            myCalculator M = new myCalculator();
            try
            {
                System.out.println(M.power(n,p));
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }

    }

}
