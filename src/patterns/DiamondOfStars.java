package patterns;

public class DiamondOfStars {

//        *
//      * * *
//    * * * * *
//      * * *
//        *

    public static void diamondOfStars(int n) {
        int top = n/2 + 1;
        for(int i=1;i<=top;i++){
            for(int j=top-i;j>0;j--){
                System.out.print(" ");
            }
            for(int p=1;p<=2*i-1;p++){
                System.out.print("*");
            }
            System.out.println();
        }
        int bottom = n/2;
        for(int x=bottom;x>0;x--){
            for(int m=bottom-x+1;m>0;m--){
                System.out.print(" ");
            }
            for(int y=2*x-1;y>0;y--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
