import java.util.*;
public class gcd {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(gcd(a,b));
    }
   static int gcd(int a,int b)
   {
       if(b==0)
       {
           return a;
       }
       else {
           return gcd(b,Math.abs(a-b));
       }
   }
}
