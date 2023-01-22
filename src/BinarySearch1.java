// If the array is sorted in the ascending  order:

import java.util.Scanner;

public class BinarySearch1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements in the array");
        // for entering the elements in the array:
        for(int i=0;i<n;i++)
        {

            arr[i]=sc.nextInt();

        }
        // for printing the array:
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println("Enter the target element that you wanted to search: ");
        int k=sc.nextInt();
        System.out.println(sort(n,k,arr));

    }
   public static int sort(int n,int k,int[] arr)
   {
       int start=0;
       int end=n-1;
       while(start<=end)
       {
           int mid=start+(end-start)/2;
           for(int i=0;i<n-1;i++)
           {
              if(arr[mid]==k)
              {
                  return mid;
              }
              if(arr[mid]<k)
              {
                 start=mid+1;
                // return start;
              }
              else{
                  end=mid-1;
                 // return end;
              }

           }
       }
       return -1;
   }

}
