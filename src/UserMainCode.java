public class UserMainCode {

    public int longestSegment(int input1, String input2) {
        // Finding the first occurrence of 'I'
        int firstI = input2.indexOf('I');



        // Replace only the first occurrence of oldChar
        input2= input2.substring(0, firstI) + 'F' + input2.substring(firstI + 1);


        // If there are no 'I's, return 0 as all are formally dressed
        if (firstI == -1) {
            return 0;
        }

        // Finding the last occurrence of 'I'
        int lastI = input2.indexOf('I');

        // Calculate the length of the segment to remove
        return lastI - firstI + 1;
    }

    public static void main(String[] args) {
        UserMainCode obj = new UserMainCode();

        // Test cases
        System.out.println(obj.longestSegment(10, "FIFFIIFFFI")); // Output: 6
        System.out.println(obj.longestSegment(8, "FFFFFFFF")); // Output: 0
    }
}