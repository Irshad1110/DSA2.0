package patterns;

public class Pattern3 {

//    * * * * *
//      * * * *
//        * * *
//          * *
//            *


    public static void pattern3(int n) {
        for(int i=n;i>0;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print("\t");
            }
            for(int k=i;k>0;k--){
                System.out.print("*\t");
            }System.out.println();
        }
    }
}
