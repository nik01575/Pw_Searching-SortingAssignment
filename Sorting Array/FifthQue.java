public class FifthQue {
    public static int sort(int arr[])
    {
        int count =0;
        int n =arr.length;
        for(int i=0; i<n-1; i++)
        {
            int min_indx=i;
            for(int j=i+1 ; j<n; j++)
            {
                if(arr[j]>arr[min_indx])
                {
                    min_indx = j;
                    
                }
            }
            if(min_indx!=i)
            {
                //swap
                int temp = arr[i];
                arr[i] = arr[min_indx];
                arr[min_indx] = temp;
            }
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {3,5,1,6,0};
        System.out.println("No of Iterations to sort an array : " + sort(arr));

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
}
