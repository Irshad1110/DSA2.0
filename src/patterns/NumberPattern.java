package patterns;

public class NumberPattern {
//    1
//    2 3
//    4 5 6
//    7 8 9 10

    public static void numberPattern(int n){
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num++ + "\t");
            }System.out.println();
        }
    }

//    1
//    2 3
//    3 4 5
//    4 5 6 7
//    5 6 7 8 9
    public static void numberPattern2(int n){

        for(int i=1;i<=n;i++){
            int num=i;
            for(int j=1;j<=i;j++){
                System.out.print(num++ + "\t");
            }System.out.println();
        }
    }
}
