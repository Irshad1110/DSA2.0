package patterns;

public class BackwardSlash {

//    *
//        *
//            *
//                *
//                    *
//                         *

    public static void backwardSlash(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                if(i!=j) System.out.print("\t");
                else System.out.println("*");
            }
        }
    }
}
