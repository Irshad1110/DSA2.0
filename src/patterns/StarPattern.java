package patterns;

public class StarPattern {

//    *               *
//        *       *
//            *
//        *        *
//     *               *


    public static void starPattern(int n){
        for(int i=n;i>0;i--){
            for(int j=1;j<=n;j++){
                if(i==j || i+j==n+1){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }System.out.println();
        }
    }
}
