import java.time.temporal.ChronoField;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] strArr = str.toCharArray();

        String answer = "YES";
        Stack<Character> stack = new Stack<Character>();

//        stack.push(strArr[0]);

        for (int i = 0; i < strArr.length; i++) {

            if(strArr[i] == '(') {
                stack.push(strArr[i]);
            } else if(strArr[i] == ')') {
                if(!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else {
                    answer = "NO";
                    break;
                }
//                stack.push(!stack.isEmpty() && stack.peek() == '(' ? stack.pop() : strArr[i]);
            }
            
        }
        
//        for (int i = 1; i < strArr.length; i++) {
//            stack.push(strArr[i]);
//
//            if(stack.elementAt(0) == '(' && stack.peek() == ')') {
//                stack.pop();
//                stack.pop();
//            }
//        }

//        if(!stack.isEmpty()) {
//            answer = "NO";
//        }

        System.out.println(answer);

    }
}