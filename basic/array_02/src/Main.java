import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        sc.nextLine();

        int[] heights = new int[num];
        for (int i = 0; i < num; i++) {
            heights[i] = sc.nextInt();
        }

        Main m = new Main();
        String result = m.solution(heights);
        System.out.println(result);

    }

    public String solution(int[] heights) {
        int visible = 0;

        int max = Integer.MIN_VALUE;
        for(int x : heights) {
            if(x > max) {
                max = x;
                visible++;
            }
        }

        return String.valueOf(visible);
    }
}