package numberSystem;

public class DecimalToAnyBase {

    public static int decimalToAnyBase(int n, int b) {
        int ans = 0;
        int count = 0;
        while(n!=0){
            int rem = n%b;
            n=n/b;
            ans+=rem*(int)Math.pow(10, count);
            count++;
        }
        return ans;
    }
}
