import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        /////////////////////////////////////////

        Stack<Character> stack = new Stack<>();
        char[] brackets = new char[str.length()];

        int stick = 0;
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == '(') {
                stack.push('(');
            } else {
                stack.pop();
                if(str.charAt(i-1) == '(') {
                    stick += stack.size();
                } else {
                    stick++;
                }
            }
        }

//        int stick = 0;
//        for (int i = 0; i < brackets.length; i++) {
//
//            if (brackets[i] == '(') {
//                stack.push('(');
//            } else {
//                stack.pop();
//                if(brackets[i-1] == '(') {
//                    stick += stack.size();
//                } else {
//                    stick++;
//                }
//            }
//        }

        System.out.println(stick);
    }
}