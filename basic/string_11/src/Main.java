import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        Main m = new Main();
        String result = m.solution(str);
        System.out.println(result);
    }

    public String solution(String str) {
        char[] strArr = str.toCharArray();
        StringBuilder resultBuilder = new StringBuilder();

        int num = 1;
        char formerLetter = ' ';
        for(int i=0; i<strArr.length; i++) {
            if(strArr[i] == formerLetter) {
                num++;

                if(i == strArr.length-1) {
                    resultBuilder.append(num);
                    break;
                }

            } else {
                if(num!=1) {
                    resultBuilder.append(num);
                }

                resultBuilder.append(strArr[i]);
                formerLetter = strArr[i];
                num = 1;
            }
        }

        return resultBuilder.toString();
    }
}