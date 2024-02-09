import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        Main m = new Main();
        int result = m.solution(number);
        System.out.println(result);
    }

    private int solution(int number) {
        // 각 값을 배열에 할당하기
        // 2, 3, 5, 7의 배수는 자기자신을 제외하고는 값을 0으로 만들기
        int[] numbers = new int[number+1];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }

        // 0과 1은 애초에 소수가 아니기 때문에 0을 할당
        numbers[0] = numbers[1] = 0;

        // 제시된 수의 제곱근이 되는 수까지 for문 돌리기
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if(numbers[i]==0) { continue; }

            // 약수를 가지는 수에 0을 할당
            for (int j = i*i; j < numbers.length; j+=i) {
                numbers[j] = 0;
            }

        }

        // 배열 값이 0일 때 cnt++
        int cnt =0;
        for(int x : numbers) {
            if(x != 0) {
                cnt++;
            }
        }

        return cnt;
    }
}