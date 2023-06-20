import java.util.Stack;

public class BasicStack {
    public static void main(String[] args) {

        Stack<Integer> stck = new Stack<>();

        stck.push(10);
        stck.push(20); // Adds elements to the stacks
        stck.push(01);
        stck.push(2);
        stck.pop(); // remove the last element stack;
        System.out.println(stck);
    }
}
