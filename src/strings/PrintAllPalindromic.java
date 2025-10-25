package strings;

public class PrintAllPalindromic {

    public static boolean isPalindrome(String str) {
        int lo = 0;
        int hi = str.length()-1;
        while(lo<hi){
            if(str.charAt(lo)!=str.charAt(hi)) return false;
            lo++;
            hi--;
        }
        return true;
    }

    public static void printAllPalindromicSubstrings(String str){
        for(int i=0;i<str.length();i++){
            for(int j = i;j<str.length();j++){
                String substring = str.substring(i, j+1);
                if(isPalindrome(substring)){
                    System.out.println(substring);
                }
            }
        }

    }
}
