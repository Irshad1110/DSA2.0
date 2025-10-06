package patterns;

public class RightAngledTriangle {
//    *
//    * *
//    * * *
//    * * * *
//    * * * * *

    public static void rightAngledTriangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*\t");
            }System.out.println();
        }
    }
}
