import java.util.*;
public class BinarySearc {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the element that you want to search:");
        int x= sc.nextInt();
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        // Entering the elements in the array:
        System.out.println("Enter the elements in the array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        // printing the array:
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]+" ");
        }
        BinarySearc obj=new BinarySearc();
        int result=obj.binarySearch(arr,x,0,n-1);
        if(result==-1)
        {
            System.out.println("Element is not found.");
        }
        else
        {
            System.out.println("Element is found.");
        }
    }
    public int binarySearch(int arr[],int x,int left,int right)
    {
        if(right>=left) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] > x)
                return binarySearch(arr, x, left, mid - 1);

            return binarySearch(arr, mid + 1, right, x);
        }
        return -1;


        }
    }
    //Space and time complexity is O(log n)

