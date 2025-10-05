package digitTraversal;

public class SubtractProductAndSum {

    public static int subtractProductAndSum(int n) {
        if(n==0) return 0;
        int product=1;
        int sum = 0;
        while(n>0){
            int rem = n%10;
            n=n/10;
            product*=rem;
            sum+=rem;
        }
        return product-sum;

    }
}
