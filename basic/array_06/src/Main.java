import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = Integer.parseInt(sc.nextLine());

        int[] numbers = new int[num];
        for (int i = 0; i < num; i++) {
            numbers[i] = sc.nextInt();
        }

        Main m = new Main();
        ArrayList<Integer> results = m.solution(num, numbers);

        for(int x : results) {
            System.out.print(x + " ");
        }
    }

    private ArrayList<Integer> solution(int num, int[] numbers) {

        ArrayList<Integer> answer = new ArrayList<Integer>();

        for (int i = 0; i < num; i++) {
            int tmp = numbers[i];
            int res = 0;
            while(tmp>0) {
                int t = tmp%10;
                res = res*10+t;
                tmp = tmp/10;
            }

            if(isPrime(res)) {
                answer.add(res);
            }
        }

        return answer;

    }

    private boolean isPrime(int num) {
        if(num==1) {
            return false;
        }

        for (int i = 2; i < num; i++) {
            if(num%i==0) {return false;}
        }

        return true;
    }
}