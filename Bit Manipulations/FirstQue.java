public class FirstQue
{
    public static void main(String[] args) {
        // int n =5;
        int arr[] = new int[40];
        int indx=0;
        int n = 10;

       while(n>0)
       {
        arr[indx++] = n%2;
        n= n/2;
       }
       for(int i= indx-1; i>=0; i--)
       {
        System.out.print(arr[i]);
       }
    }
}