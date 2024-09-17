import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class uncommonWordsTwo {
    public static String[] uncommonFromSentences(String s1, String s2) {
        String[] word1=s1.split(" ");
        String[] word2=s2.split(" ");
        Map<String,Integer> map=new HashMap<>();
        for(String word:word1)
            map.put(word,map.getOrDefault(word,0)+1);

        for(String word:word2)
            map.put(word,map.getOrDefault(word,0)+1);

        ArrayList<String> list=new ArrayList<>();
        for(String word:map.keySet()){
            if(map.get(word)==1) list.add(word);
        }

        return list.toArray(new String[list.size()]);
    }

    public static void main(String[] args) {
        String s1="this apple is sweet";
        String s2="this apple is sour";
//        String s1="apple apple";
//        String s2="banana";
        String[] ans=uncommonFromSentences(s1,s2);
        System.out.println(Arrays.toString(ans));
    }
}
