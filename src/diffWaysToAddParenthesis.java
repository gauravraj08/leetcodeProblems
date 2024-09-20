import java.util.ArrayList;
import java.util.List;

public class diffWaysToAddParenthesis {

    public static List<Integer> solve(String s) {
        List<Integer> res=new ArrayList<>();

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);

            if(c=='+' || c=='-' || c=='*'){
                List<Integer> left=solve(s.substring(0,i));
                List<Integer> right=solve(s.substring(i+1));

                for(int x:left){
                    for(int y:right){
                        if(c=='+') res.add(x+y);
                        else if(c=='-') res.add(x-y);
                        else res.add(x*y);
                    }
                }
            }
        }
        if(res.isEmpty()) res.add(Integer.parseInt(s));

        return res;
    }

    public static List<Integer> diffWaysToCompute(String s) {
        return solve(s);
    }
    public static void main(String[] args) {
        String s="2-1-1";
        List<Integer> ans=diffWaysToCompute(s);
        System.out.println(ans);
    }
}
