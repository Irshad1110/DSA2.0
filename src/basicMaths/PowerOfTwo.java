package basicMaths;

public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {

        for(int i=0;i<=30;i++){
            int num = (int)Math.pow(2, i);
            if(num == n) return true;
        }return false;
    }
}
