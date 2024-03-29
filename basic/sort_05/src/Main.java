import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력 받기
        Scanner sc=new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        ///////////////////////////////////

        String answer = "U";
        for(int i = 0; i < N/2; i++) {
            for(int j = i+1; j < N; j++) {
                if(arr[i] == arr[j]) {
                    answer = "D";
                }
            }
        }

        System.out.println(answer);
    }
}