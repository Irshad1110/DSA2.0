package digitTraversal;

public class PalindromeNumber {
    public int reverse(int n) {
        int rev = 0;
        while(n!=0) {
            int rem = n%10;
            rev=rev*10 +rem;
            n=n/10;
        }
        return rev;
    }

    public boolean isPalindrome(int x) {
        if(x<0) return false;
        return x == reverse(x);
    }
}
