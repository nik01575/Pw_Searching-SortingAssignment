public class ThirdQue {
    public static int totalOne(int arr[])
    {
        int count = 0;
        for(int i=0;i<arr.length; i++)
        {
            if(arr[i]==1)
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        // int arr [] = {0, 0, 0, 0, 1, 1, 1, 1, 1, 1,};

        int arr [] = {0, 0, 0, 0, 0, 1, 1};
        int res = totalOne(arr);
        System.out.println("Total No of 1 is : " + res);
    }
}
