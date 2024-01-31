import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        Main m = new Main();
        int[] numbers = m.solution(num);

        for(int x : numbers) {
            System.out.print(x + " ");
        }
    }

    private int[] solution(int num) {

        int[] numbers = new int[num];
        numbers[0] = 1;
        numbers[1] = 1;
        for (int i = 2; i < num; i++) {
            numbers[i] = numbers[i-2] + numbers[i-1];
        }

        return numbers;
    }
}