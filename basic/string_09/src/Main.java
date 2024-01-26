import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        Main m = new Main();
        int result = m.solution(str);

        System.out.println(result);
    }

    public int solution(String str) {

        String result = "";
        for(char x : str.toCharArray()) {
            if (Character.isDigit(x)) {
                result += String.valueOf(x);
            }
        }

        return Integer.parseInt(result);
    }
}