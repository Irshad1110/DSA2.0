package strings;

public class ReverseVowels {

    public boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A'
                || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }

    public String reverseVowels(String s) {
        int lo = 0;
        int hi = s.length()-1;
        StringBuilder sb = new StringBuilder(s);
        while(lo<hi){
            if(isVowel(sb.charAt(lo)) && isVowel(sb.charAt(hi))) {
                char temp = sb.charAt(lo);
                sb.setCharAt(lo, sb.charAt(hi));
                sb.setCharAt(hi, temp);
                lo++;
                hi--;
            }else if(isVowel(sb.charAt(lo)) && !isVowel(sb.charAt(hi))) {
                hi--;
            }else if (!isVowel(sb.charAt(lo)) && isVowel(sb.charAt(hi))) {
                lo++;
            }else {
                lo++;
                hi--;
            }
        }
        return sb.toString();
    }
}
