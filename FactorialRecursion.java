import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FactorialRecursion {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int fact = scan.nextInt();
                
        System.out.println(factorial(fact));
    }
        
        static int factorial(int n){
            int output;
            if(n==1){
                return 1;
            }
            output = factorial(n-1)* n;
            return output;
        }
    }