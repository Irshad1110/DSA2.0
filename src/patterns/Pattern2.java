package patterns;

public class Pattern2 {
//    * * * * *
//    * * * *
//    * * *
//    * *
//    *

    public static void pattern2(int n) {
        for(int i=n;i>0;i--){
            for(int j=i;j>0;j--){
                System.out.print("*\t");
            }System.out.println();
        }
    }
}
