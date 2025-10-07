package patterns;

public class ForwardSlash {

//                           *
//                        *
//                     *
//                  *
//               *
//            *

    public static void forwardSlash(int n) {
        for(int i=n;i>0;i--){
            for(int j=i-1;j>0;j--){
                System.out.print("\t");
            }System.out.println("*");
        }
    }
}
