//Selection Sort

public class SecondQue {
    public static void sort(int arr[])
    {
        for (int i = 0; i < arr.length - 1; i++) {
            int min_indx = i;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] > arr[min_indx]) {
                    min_indx = j;
                }
            }
            if (min_indx != i) {
                // swap
                int temp = arr[i];
                arr[i] = arr[min_indx];
                arr[min_indx] = temp;
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
