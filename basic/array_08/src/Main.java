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

        for (int i = 0; i < num; i++) {
            System.out.print(m.solution(numbers)[i] + " ");
        }


    }

    private int[] solution(int[] numbers) {

        int[] ranks = new int[numbers.length];
        int cnt = 1;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if(numbers[i] < numbers[j]) {
                    cnt++;
                }
            }
            ranks[i] = cnt;
        }

        return ranks;
    }
}