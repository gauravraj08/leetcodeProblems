public class minStringLen {
    public static int minLength(String s) {
        int i=1,len=0;
        while(i<s.length()){
            String temp=""+s.charAt(i-1)+s.charAt(i);
            if(temp.equals("AB") || temp.equals("CD")){
                String s1=s.substring(0,i-1);
                String s2=s.substring(i+1);
                s=s1+s2;
                i=1;
                len=s.length();
            }
            else i++;
        }
        return len;
    }

    public static void main(String[] args) {
        System.out.println(minLength("ABFCACDB"));
    }
}
