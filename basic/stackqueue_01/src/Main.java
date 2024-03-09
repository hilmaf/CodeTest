import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] strArr = str.toCharArray();
        String answer = "YES";
        int open = 0, close=0;
        for (int i = 0; i < strArr.length; i++) {
            if(open==close && strArr[i] == ')') {
                answer="NO";
                break;
            }

            switch(strArr[i]) {
                case '(': open++; break;
                case ')': close++; break;
            }

        }

        if(open != close) {
            answer = "NO";
        }

        System.out.println(answer);

    }
}