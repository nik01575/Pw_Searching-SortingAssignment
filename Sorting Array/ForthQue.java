public class ForthQue {
    public static void sort(int arr[])
    {
        int n= arr.length;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n-i-1; j++)
            {
                if(arr[j]<arr[j+1])
                {
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] = temp;
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

        System.out.println("\nSo, for the given array, the number of passes required to sort it in decreasing order is 4.");
    
    }
}
