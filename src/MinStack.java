import java.util.Stack;

class MinStack {

    private static Stack<Integer> s=new Stack<>();
    static int min=Integer.MAX_VALUE;

//    public MinStack() {
//        s=new Stack<>();
//    }

    public static void push(int val) {
        if(val <= min){
            s.push(min);
            min=val;
        }
        s.push(val);
    }

    public static void pop() {
        if(s.pop()==min) min=s.pop();
    }

    public static int top() {
        if(!s.isEmpty()) return s.peek();
        return 0;
    }

    public static int getMin() {
        return min;
    }

    public static void main(String[] args) {
        push(-2);
        push(0);
        push(-3);
        System.out.println(getMin());
        pop();
        top();
        System.out.println(getMin());
    }
}
