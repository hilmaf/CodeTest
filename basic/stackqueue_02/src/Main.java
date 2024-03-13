import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        ///////////////////////////////////////

//        (A(BC)D)EF(G(H)(IJ)K)LM(N)
//        EFLM

        Stack<Character> stack = new Stack<>();
        char[] strArr = str.toCharArray();

        for (char x : strArr) {
            if (x == ')') {
                boolean pop = true;
                while(pop) {
                    if (stack.peek() == '(') { pop = false; }
                    stack.pop();
                }
                continue;
            }

            stack.push(x);
        }

        StringBuilder stringBuilder = new StringBuilder();
        while(!stack.isEmpty()) {
            stringBuilder.append(stack.pop());
        }

        System.out.println(stringBuilder.reverse());

    }
}