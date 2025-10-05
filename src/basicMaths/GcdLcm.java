package basicMaths;

public class GcdLcm {
    public static int[] lcmAndGcd(int a, int b) {
        // code here
        int gcd = calculateGcd(a, b);
        int lcm = a*b/gcd;
        int[] arr = new int[2];
        arr[0] = lcm;
        arr[1] = gcd;
        return arr;
    }
    public static int calculateGcd(int a, int b) {
        while(b>0){
            int B = b;
            b=a%b;
            a=B;
            if(b==0) return a;
        }
        return 1;
    }
}
