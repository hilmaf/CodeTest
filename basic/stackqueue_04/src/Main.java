import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        Stack<Integer> stack = new Stack<>();

        for (String x : str.split("")) {
            if(x.matches("[0-9]")) {
                stack.push(Integer.parseInt(x));
            } else {
                int a = stack.pop(), b = stack.pop();
                if (x.equals("+")) {
                    stack.push(a + b);
                } else if (x.equals("-")) {
                    stack.push(b - a);
                } else if (x.equals("*")) {
                    stack.push(a * b);
                } else {
                    stack.push(b / a);
                }
            }


        }

        System.out.println(stack.pop());
    }
}