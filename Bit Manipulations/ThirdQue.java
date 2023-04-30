public class ThirdQue {
    public static void checkEvenOdd(int n)
    {
        int no = 1;
        if((n & no) == 0)
        {
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
    public static void main(String[] args) {
        int n =3;
        checkEvenOdd(n);
    }
}
