public class SecondQue {
    public static void lastOcuurence(int arr[], int target) {
        int count = -1;

        for (int i = 0; i < arr.length; i++) 
        {
            if (target != arr[i])
                continue;           
            count = i;
        }
        if (count != -1) {
            System.out.println("Last Occurrence = " + count);
        }
        else
            System.out.println(-1);
    }
    

    public static void main(String[] args) {
        int arr[] = { 1, 1, 1, 2, 3 , 4, 4, 5, 6, 6, 6, 6 };
        int target = 4;

        // int arr [] = {2, 2, 2, 6, 6, 18, 29, 30, 30, 30};
        // int target = 15;

        lastOcuurence(arr, target);

       
        
    }
}
