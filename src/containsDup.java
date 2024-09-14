class containsDup {
    static boolean containsDuplicate(int[] nums) {
        int n=nums.length-1;
        int i=0;
        for(i=0;i<=n;i++){
            for(int j=i+1;j<=n;j++){
                if(nums[i]==nums[j]) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr={0,4,5,0,3,6};
        boolean ans=containsDuplicate(arr);
        System.out.println(ans);
    }
}
