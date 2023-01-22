import java.util.*;
public class BinarySearch2 {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
     int n=sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target element : ");
        int x=sc.nextInt();
        System.out.println(search(x,arr,n));
    }
    public static int search(int x,int arr[],int n)
    {
        int start=0;
        int end=n-1;
       while(start<=end)
       {
           int mid=start+(end-start)/2;
           for(int i=0;i<n-1;i++)
           {
               if(arr[mid]==x)
               {
                   return mid;
               }
               if(arr[mid]<x)
               {
                 end=mid-1;
               }
               else
               {
                   start=mid+1;
               }
           }
       }
       return -1;
    }
}
