import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arr = new int[N];
        for(int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
        }

        //////////////////////////////////////

        int lt=0;
        int cnt=0;
        int sum=0;

        for (int rt = 0; rt < N; rt++) {
            sum += arr[rt];

            if(sum==M) {
                cnt++;
            }

            while(sum>M){
                sum-=arr[lt];
                if(sum == M) {
                    cnt++;
                }
                lt++;
            }
        }

        System.out.println(cnt);
    }
}