import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력받기
        int N = sc.nextInt(); // 왕자 명수
        int K = sc.nextInt(); // 호출 숫자

        ///////////

        Stack<Integer> stack = new Stack<>();

        int sum = N*(N+1)/2;

        int cnt = 0;

        while(stack.size() < N-1) {
            for(int i = 1; i <= N; i++) {
                if(!stack.contains(i)) {
                    cnt++;
                } // if

                if(cnt == K) {
                    stack.push(i);
                    cnt = 0;
                } // if
            } // for
        } // while

        while(!stack.isEmpty()) {
            sum -= stack.pop();
        }

        System.out.println(sum);
    }
}