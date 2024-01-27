import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        sc.nextLine();

        int[] ints = new int[num];
        for(int i=0; i<num; i++) {
            ints[i] = sc.nextInt();
        }

        Main m = new Main();
        String result = m.solution(ints);
        System.out.println(result);
    }

    private String solution(int[] ints) {

        int minInt = Integer.MIN_VALUE;

        StringBuilder resultBuilder = new StringBuilder();
        for(int i=0; i<ints.length; i++) {
            if(minInt < ints[i]) {
                resultBuilder.append(ints[i]);
                resultBuilder.append(" ");
            }
            minInt = ints[i];
        }

        return resultBuilder.toString();
    }
}