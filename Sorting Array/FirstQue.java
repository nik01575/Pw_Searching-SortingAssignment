//Bubble Sort

public class FirstQue {
    public static void sort(int arr[])
    {
        int n= arr.length;

        for(int i=0;  i<n; i++)
        {
            for(int j=0; j<n-1-i;  j++)
            {
                if(arr[j]<arr[j+1])
               {
                //swap
                int temp = arr[j+1];
                arr[j+1] = arr[j];
                arr[j] = temp;

               }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = { 3, 5, 1, 6, 0 };
        sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
}
