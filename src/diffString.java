public class diffString {
//    static char findDiff(String s,String t){
//        int sum=0;
//        for(char c:t.toCharArray()){
//            sum=sum+c;
//        }
//
//        for (char c:s.toCharArray()){
//            sum=sum-c;
//        }
//        return (char) sum;
//    }
    static char findDiff(String s,String t){
        int xor=0;
        for(char c:t.toCharArray()){ xor = xor^c;}
        for(char c:s.toCharArray()){ xor = xor^c;}
        return  (char) xor;
    }
    public static void main(String[] args) {
        String s="abcp";
        String t="abcop";
        char ans=findDiff(s,t);
        System.out.println(ans);
    }
}
