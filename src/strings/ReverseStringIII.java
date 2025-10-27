package strings;

public class ReverseStringIII {

    public static String reverse(String s) {
        StringBuilder sb = new StringBuilder(s);
        int lo = 0;
        int hi = s.length()-1;
        while(lo<hi){
            char temp = s.charAt(lo);
            sb.setCharAt(lo, s.charAt(hi));
            sb.setCharAt(hi, temp);
            lo++;
            hi--;
        }
        return sb.toString();
    }

    public static String reverseWords(String s) {
        int lo=0;
        int hi = 0;
        if(s.length() < 2) return s;
        StringBuilder sb = new StringBuilder("");
        while(hi<s.length()){
            while(hi<s.length() && s.charAt(hi)!=' '){
                hi++;
            }
            sb.append(reverse(s.substring(lo, hi)));
            if(hi<s.length()) sb.append(' ');
            hi++;
            lo = hi;
        }
        return sb.toString();
    }
}
