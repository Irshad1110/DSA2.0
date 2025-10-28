package recursion;

public class TowerOfHanoi {

    public static void towerOfHanoi(int n, int from, int target, int aux) {
        if(n==1){
            System.out.println("Move disk " + n + " from " + from + " to " + target);
            return;
        }

        towerOfHanoi(n-1, from, aux, target);
        System.out.println("Move disk " + n + " from " + from + " to " + target);
        towerOfHanoi(n-1, aux, target, from);

    }

}
