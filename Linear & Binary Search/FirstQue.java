import java.util.*;
public class FirstQue
{
    public static int search(int arr[] , int search)
    {

        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] == search)
            {
                return i;
            }
        }
        return 0;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n= sc.nextInt();
        
        int arr[] = new int[n];
        System.out.println("Enter the elements in the array");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Your array is : "+Arrays.toString(arr));

        System.out.println("Enter the Element you want to search in the array");
        int search = sc.nextInt();

        int result = search(arr, search);

        if(result==0)
        {
            System.out.println("Element not found");
        }
        else{
            System.out.println("Index of the Element is : " + result);
        }

        sc.close();
    }
}