package numberSystem;

public class AnyBaseMultiplication {

    //251*21 = 251 + 5020 = 5271
    public static int anyBaseMultiply(int b, int n1, int n2){
        int ans = 0;
        int k = 1;
        while(n2>0){
            int digit = n2%10;
            n2/=10;
            int num1 = n1;
            int smallAns = 0;
            int carry = 0;
            int p=1;
            while(num1 > 0 || carry>0) {
                int d = num1%10;
                if(digit*d + carry >= b) {
                    int rem = (digit*d + carry)%b;
                    smallAns+=rem*p;
                    carry = (digit*d + carry)/b;
                }else{
                    smallAns+=(digit*d + carry)*p;
                    carry=0;
                }
                p*=10;
                num1/=10;
            }
            ans = AnyBaseAddition.anyBaseAddition(b, ans, smallAns*k);
            k*=10;
        }
        return ans;
    }
}
