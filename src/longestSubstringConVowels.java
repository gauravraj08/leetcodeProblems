import java.util.HashMap;
import java.util.Map;

public class longestSubstringConVowels {
    public static int findTheLongestSubstring(String s) {
        int n=s.length();
        int mask=0,max=0;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);

        for(int i=0;i<n;i++){
            char c=s.charAt(i);

            if(isVowel(c)){
                if(c=='a') mask^=1;
                else if(c=='e') mask^=2;
                else if(c=='i') mask^=4;
                else if(c=='o') mask^=8;
                else if(c=='u') mask^=16;
            }
            if(!map.containsKey(mask)) map.put(mask,i);
            else max=Math.max(max,i-map.get(mask));
        }
        return max;
    }
    private static boolean isVowel(char ch){
        return ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u';
    }

    public static void main(String[] args) {
        String s="leetcodeisgreat";
        int ans=findTheLongestSubstring(s);
    }
}
