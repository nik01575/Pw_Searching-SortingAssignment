public class ForthQue {
    public static int setbit(int n , int key)
    {
        int bitmask = 1<<key;
        return n | bitmask;
    }
    
    public static void main(String[] args) {
       
            System.out.println(setbit(10, 2));
        
    }
}
