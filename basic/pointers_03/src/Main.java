import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(sc.next());
        }

        ///////////////////////////////////////////////////////////////////

        int answer = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += arr[i];
            answer = sum;
        }

        for (int i = k; i < arr.length; i++) {
            sum = sum + arr[i] - arr[i-k];

            if(sum > answer) {
                answer = sum;
            }
        }

        System.out.println(answer);
    }
}