import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        try {
            int num = Integer.parseInt(br.readLine());

            for(int i = 0; i < num; i++) {
                sb.append(checkVps(br.readLine())).append('\n');
            }
            System.out.print(sb);
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    public static String checkVps(String str) {
        char[] strArr = str.toCharArray();

        Stack<Character> stack = new Stack<>();

        for(char x : strArr) {
            if(stack.isEmpty()) {
                stack.push(x);
                continue;
            }

            if(x == '(') {
                stack.push(x);
            } else {
                if (stack.peek() == x) {
                    stack.push(x);
                } else {
                    stack.pop();
                }
            }
        }

        if(stack.isEmpty()) {
            return "YES";
        } else {
            return "NO";
        }


    }
}