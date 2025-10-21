package numberSystem;

public class AnyBaseAddition {

    //when we add any two numbers in any base, we add d1 + d2 + carry.
    //but if this comes out to be more than base, then we need to get the digit by % by base and carry by / by base
    //iteration of d1 and d2 will always be through division and % by 10 as we are just iterating over its digits.

    public static int anyBaseAddition(int b, int n1, int n2){
        int ans = 0, p=1;
        int carry = 0;
        while(n1>0 || n2>0 || carry>0) {
            int d1 = n1%10;
            int d2 = n2%10;
            if(d1+d2+carry < b) {
                ans+= (d1+d2+carry)*p;
                carry = 0;
            }else{
                int rem = (d1+d2+carry)%b;
                ans+= (rem)*p;
                carry = (d1+d2+carry)/b;
            }
            n1/=10;
            n2/=10;
            p*=10;

        }
        return ans;
    }
}
