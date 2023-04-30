public class SecondQue
{
    public static boolean perfectsquare(int n, int a)
    {

        for(int i=0; i<=n/2; i++)
        {
            if(2*a == n)
            {                
                return true;
            }
            else{
                a=a*2;
            }
            
        }
        return false;
    }
    public static void main(String[] args) {
        int n =15;
        // int n =32;
        int a =2;
        System.out.println(perfectsquare(n ,a));
        
    }
}