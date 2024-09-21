public class ShortestPalindrome {
    public static String shortestPalindrome(String s) {
        String str=new StringBuilder(s).reverse().toString();

        for(int i=0;i<str.length();i++){
            String temp=str.substring(i);
            if(s.startsWith(temp))
                return str.substring(0,i)+s;
        }
        return str+s;
    }
    public static void main(String[] args) {
        String s="aacecaaa";
        System.out.println(shortestPalindrome(s));

    }
}
