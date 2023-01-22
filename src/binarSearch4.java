// Order Agnostic search: means we have to also find in which order the array is sorted whether in ascending or decending order....



import java.util.*;
public class binarSearch4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        System.out.println("Enter the element the array: ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target");
        int x=sc.nextInt();
        System.out.println(search1(x,n,arr));
    }
    public static int search1(int x,int n,int arr[])
        {
        int start=0;
        int end=n-1;
        while(start<=end)
        { int mid=start+(end-start)/2;
            for(int i=0;i<n;i++)
            {
                if(arr[mid]==x)
                {
                    return mid;
                }
              if(arr[start]<arr[end])
              {
                  if (arr[mid] < x)
                  {
                      start=mid+1;
                  }
                  else {
                      end=mid-1;
                  }
              }
              else
              {
                  if (arr[mid] < x)
                  {
                      end=mid-1;
                  }
                  else
                  {

                      start=mid+1;
                  }

              }
            }
        }
        return -1;
        }
}
