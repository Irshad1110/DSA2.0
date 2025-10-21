package numberSystem;

public class AnyBaseSubtraction {

    //Main point is that when we subtract 2 numbers, along with borrow we need to add base.
    //for example if 122-98 is there , 2 will take borrow
    //but we need to do 0(borrow initially is 0) + 2 + 10(base is 10) then it will be 12 - 8 = 4
    //and borrow for next step will now become -1

    public static int anyBaseSubtraction(int b, int n1, int n2){
        int ans = 0;
        int borrow=0, p=1;
        while(n2>0) {
            int d1= n1%10;
            int d2=n2%10;
            if(d2-d1+borrow<0){
                ans+=(d2-d1+borrow+b)*p;
                borrow=-1;
            }else{
                ans+=(d2-d1+borrow)*p;
                borrow=0;
            }
            p*=10;n2/=10;n1/=10;
        }
        return ans;
    }
}
