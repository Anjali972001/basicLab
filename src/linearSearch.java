import java.util.Scanner;
public class linearSearch {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array you want: ");
        int n=sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        int[] arr=new int[n];
        // Entering the elements in the array:
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        //for displaying the array:
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("Enter the target: ");
        int target=sc.nextInt();
        int answer=search(arr,target);
        System.out.println(answer);
    }
    static int search(int arr[],int target)
    {
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]==target)
            {
                return 1;

            }
        }
        return -1;
        // time complexity is O(1)
    }
}
