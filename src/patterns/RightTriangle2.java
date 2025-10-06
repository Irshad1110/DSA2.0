package patterns;

public class RightTriangle2 {
//          *
//        * *
//      * * *
//    * * * *
//  * * * * *

    public static void rightTriangle2(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("\t");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
