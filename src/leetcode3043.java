import java.util.HashMap;

public class leetcode3043 {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashMap<String,Integer> prefix=new HashMap<>();

        for(int num:arr1){
            String str=Integer.toString(num);
            String pre="";
            for(char ch:str.toCharArray()){
                pre+=ch;
                prefix.put(pre,prefix.getOrDefault(pre,0)+1);
            }
        }
        int max=0;

        for(int num:arr2){
            String str=Integer.toString(num);
            String pre="";
            for(char ch:str.toCharArray()){
                pre+=ch;
                if(prefix.containsKey(pre)){
                    max=Math.max(max,pre.length());
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        leetcode3043 ob=new leetcode3043();
        int[] arr1={1,10,100};
        int[] arr2={1000};
        System.out.println(ob.longestCommonPrefix(arr1,arr2));
    }
}
