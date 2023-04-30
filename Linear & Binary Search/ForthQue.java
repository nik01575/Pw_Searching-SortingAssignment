public class ForthQue {

    public static int duplicates(int arr[] , int target)
    {
        int count=0;
        for(int i=0;i<arr.length; i++)
        {
            if(arr[i]==target)
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        // int nums[] = {2, 5, 5, 5, 6, 6, 8, 9, 9, 9};
        // int target = 5;

        int nums[] = {2, 5, 5, 5, 6, 6, 8, 9, 9, 9};
        int target = 6;

        int res = duplicates(nums, target);
        System.out.println("Target " + target + " occurs " + res + " times.");
    }
}
