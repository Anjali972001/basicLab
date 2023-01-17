import java.util.*;
public class factorial {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        System.out.println("Factorial of the give number is "+ factorial(n));
    }
    static int factorial (int n)
    {
        if(n==0)
        {
            return 1;
        }
        return n*factorial(n-1);
    }
}
