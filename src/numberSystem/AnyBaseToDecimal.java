package numberSystem;

public class AnyBaseToDecimal {

    public static int anyBaseToDecimal(int n, int b) {
        int ans=0;
        int p=0;
        while(n>0) {
            int rem = n%10;
            ans+=rem*(int)Math.pow(b, p);
            p++;
            n=n/10;
        }return ans;
    }
}
