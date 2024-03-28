import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // 5. K번째 큰 수
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // n장의 카드
        int k = sc.nextInt(); // k번째로 큰 수

        int[] cards = new int[n];
        for (int i = 0; i < n; i++) {
            cards[i] = sc.nextInt();
        }

        //////////////////////////////////////////////

        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());

        int sum = 0;
        for (int i = 0; i < cards.length-2; i++) {
            for (int j = i+1; j < cards.length-1; j++) {
                for (int l = j+1; l < cards.length; l++) {
                    sum = cards[i] + cards[j] + cards[l];
                    set.add(sum);
                }
            }
        }


        int answer = -1;
        int cnt = 0;
        for(int x : set) {
            cnt++;
            if(cnt == k) {
                answer = x;
                break;
            }
        }

        System.out.println(answer);
    }
}