public class UserMainCode {

    public int longestSegment(int input1, String input2) {
        // Finding the first occurrence of 'I'
        int firstI = input2.indexOf('I');
        String temp=input2;
        temp=temp.substring(0,firstI+1);
        input2=input2.substring(firstI+1);

        temp=temp.replace('I','F');

        input2=temp+input2;

        // If there are no 'I's, return 0 as all are formally dressed
        if (firstI == -1) {
            return 0;
        }

        // Finding the last occurrence of 'I'
        int lastI = input2.indexOf('I');

        temp=input2.substring(lastI);

        // Calculate the length of the segment to remove
        return temp.length();
    }

    public static void main(String[] args) {
        UserMainCode obj = new UserMainCode();

        // Test cases
        System.out.println(obj.longestSegment(10, "FIFFIIFFFI")); // Output: 6
        System.out.println(obj.longestSegment(8, "FFFFFFFF")); // Output: 0
    }
}