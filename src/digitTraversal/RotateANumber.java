package digitTraversal;

public class RotateANumber {

    public static int rotate(int x, int k) {
       int nod = 0;
       int num = x;
       while(num > 0) {
           nod++;
           num = num/10;
       }
       //for large k
       k=k%nod;
       //for negative
       if(k<0) k+=nod;

       int last = x%(int)Math.pow(10, k);
       x=x/(int)Math.pow(10, k);
       last = last  * (int)Math.pow(10, nod-k);
       x = last + x;
       return x;
    }
}
