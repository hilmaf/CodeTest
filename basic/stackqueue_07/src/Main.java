import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String required = sc.nextLine();
        String str = sc.nextLine();

        //////////////////////////////////////////

        Stack<Character> stack = new Stack<>();

        List<Character> list = new ArrayList<>();
        for (int i = required.length()-1; i >=0; i--) {
            list.add(required.charAt(i));
        }

        for (int i = 0; i < str.length(); i++) {
            if (list.contains(str.charAt(i))) {
                stack.push(str.charAt(i));
            }
        }

        String answer = "YES";

        for (Character c : list) {
            if (!stack.isEmpty() && stack.pop() != c) {
                answer = "NO";
            }
        }

        System.out.println(answer);
    }
}