import java.util.Scanner;
public class bubbleSort
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();
        System.out.println("Enter the elements in the array: ");
        int arr[]=new int[n];
        for (int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        // for displaying the elements in the array:
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        bubbleSort bb=new bubbleSort();
        bb.BubbleSort(arr);
        System.out.print("Sorted Array: ");
        bb.printArray(arr);

    }
   void BubbleSort(int arr[])
   {
       for(int i=0;i< arr.length-1;i++)
       {
           for (int j=0;j< arr.length-1-i;j++)
           {
               if(arr[j]>arr[j+1])
               {
                   int temp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
               }
           }
       }

   }
   void printArray(int arr[])
   {
       for(int i=0;i< arr.length;i++)
       {
           System.out.print(arr[i]+" ");
       }
   }

}
