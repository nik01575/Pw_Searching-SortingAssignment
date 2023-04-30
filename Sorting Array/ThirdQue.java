//Insertion Sort

public class ThirdQue {
    public static void sort(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            int j =i;
            while(j>0 && arr[j] > arr[j-1])
            {
                //swap
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;

                j--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,5,1,6,0};
        sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
}
