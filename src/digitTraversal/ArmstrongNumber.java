package digitTraversal;

public class ArmstrongNumber {

    public static boolean armstrongNumber(int n) {
        int num = n;
        int sum = 0;
        while(num>0){
            int rem = num%10;
            num/=10;
            sum+= rem*rem*rem;
        }
        return sum==n;
    }
}
