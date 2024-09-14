import java.util.Scanner ;
class SubArray2 {

    static int subarray(int arr[], int n, int sum)
    {
        int currentsum = arr[0], begin = 0, i;

        // Always start with the initial index of an array  
        for (i = 1; i <= n; i++) {

            while (currentsum > sum && begin < i - 1) {
                currentsum = currentsum - arr[begin];
                begin++;
            }


            if (currentsum == sum) {

                System.out.println(
                        "Sum found between indexes " + (begin+1)
                                + " and " + i);
                return 1;
            }

            // Add this element to currentsum  
            if (i < n)
                currentsum = currentsum + arr[i];
        }

        System.out.println("No subarray found");
        return 0;
    }

    public static void main(String[] args)
    {

        int[] arr={0};
        int n=1,k=0;
        subarray( arr , n , k ) ;
    }
}  