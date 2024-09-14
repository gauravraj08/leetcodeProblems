import java.util.*;
class intersec {
//    static int[] intersection(int[] nums1, int[] nums2) {
//        int n1 = nums1.length;
//        int n2 = nums2.length;
//        int n = Math.min(n1, n2);
//        ArrayList<Integer> ans = new ArrayList<>();
//        for (int i = 0; i < n; i++) {
//            if (nums1[i] == nums2[i]) {
//                ans.add(nums1[i]);
//            }
//        }
//        int[] result = null;
//        result=ans.toArray(result[ans.size()]);
//        return result;
//    }
    static char findTheDifference(String s, String t) {
        int[] freq=new int[256];
        for(int i=0; i<t.length() ; i++){
            freq[t.charAt(i)]++;
        }
        for(int i=0; i<s.length() ; i++){
            freq[s.charAt(i)]--;
        }
        for(int i=0; i<256 ; i++){
            if(freq[i]!=0){
                return (char)(i);
            }
        }
        return ' ';
    }

    public static void main(String[] args) {
//        int[] arr1={1,2,2,1};
//        int[] arr2={2,2};
//        int[] ans=intersection(arr1,arr2);
        String s1="abcd";
        String s2="abcde";
        char res=findTheDifference(s1,s2);
        System.out.println(res);
    }
}