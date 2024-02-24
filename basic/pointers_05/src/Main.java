import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // 포인터 두 개를 일단 첫번째 인덱스에 위치시킨다
        // 포인터 한 개를 오른쪽으로 순차적으로 이동시키면서 합이 N이 되는지 체크한다
        // 합이 N일 떄 cnt++
        // 합이 N이 아닐 때는 두 가지 케이스로 나뉠 수 있음
        // 합이 N보다 작을 때는 오른쪽 포인터++ N과 같은지 판별
        // 합이 N보다 클 때는 왼쪽 포인트++ 해서 N과 같은지 판별

        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());

        int[] nums = new int[N];
        int num = 1;
        for (int i = 0; i < N; i++) {
            nums[i] = num;
            num++;
        }

        /////////////////////////////////////////////////////

        int pnt1 = 0;
        int sum = 0;
        int cnt = 0;

        for (int pnt2 = 0; pnt2 < N; pnt2++) {
            sum += nums[pnt2];

            if(sum == N) { cnt++; }

            while(sum >= N) {
                sum -= nums[pnt1++];
                if(sum == N && pnt1 != N-1) { cnt++; }
            }

        }

        System.out.println(cnt);

    }
}