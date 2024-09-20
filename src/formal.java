public class formal {
    private static int longestSegment(int n,String s) {
        char[] ch = s.toCharArray();

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (count == 0) {
                if (ch[i] == 'I') count++;
            } else if (count == 1 && ch[i] == 'I') {
                count = n - i;
                break;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(longestSegment(10, "FIFFIIFFFI")); // Output: 6
        System.out.println(longestSegment(8, "FFFFFFFF"));
    }
}
