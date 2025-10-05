package digitTraversal;

public class ReverseANumber {

    public static int reverse(int x) {
        int ans = 0;
        while(x!=0){
            int rem = x%10;
            x = x/10;
            //This is the trick, if we do multiply by 10 it will store wrong value(because of data loss)
            //so we need to check like this
            if(ans > Integer.MAX_VALUE/10 || ans < Integer.MIN_VALUE/10) return 0;
            ans = ans*10 + rem;
        }

        return ans;
    }
}
