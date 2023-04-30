public class FifthQue {

    public static boolean perfectsquare(int num) {
        int i = 1;
        while (i < num) {
            if (i * i == num) {
                System.out.println("Perfect Square of " + num + " is " + i);
                return true;
            }
            i++;
        }
        return false;
    }

    public static void main(String[] args) {
        int num = 16;
        // int num = 14;
        System.out.println(perfectsquare(num)); 
    }
}
