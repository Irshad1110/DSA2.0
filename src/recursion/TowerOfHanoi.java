package recursion;

public class TowerOfHanoi {


    //Main trick in this one is that for the smaller problem we have to assume that n-1 disks can be moved
    //from any rod to any rod using the third rod.
    //so we can simply move n-1 disks initially to aux rod using target as third rod
    //then just move nth disk to target
    //then move n-1 disks from aux to target using source as third rod.
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
