public class FifthQue {

    public static int count(int arr[])
    {
        int i=0;
        for (i = 0; i < arr.length; i++) 
        {
            int count = 0;
            for (int j = 0; j < arr.length; j++) 
            {
                if (arr[i] == arr[j])
                
                    count++;
            }
            if (count % 2 != 0)
                return arr[i];
        }
        return -1;
        
    }

    public static void main(String[] args) {
        int arr[] = { 4, 3, 6, 2, 6, 4, 2, 3, 4, 3, 3 };

        System.out.println(count(arr));
    }
}
