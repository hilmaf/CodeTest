import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char c = str.charAt(str.length()-1);

        Main m = new Main();
        int[] result = m.solution(str, c);
        for(int x : result) {
            System.out.print(x + " ");
        }
    }

    public int[] solution(String str, char c) {
        String word = str.substring(0, str.length()-2);

        int p=101;
        char[] wordArr = word.toCharArray();
        int[] pArr = new int[word.length()];
        for(int i=0; i<wordArr.length; i++) {
            if(wordArr[i] == c) {
                p=0;
                pArr[i] = p;
            } else {
                p+=1;
                pArr[i] = p;
            }
        }

        for(int i= wordArr.length-1; i>=0; i--) {
            if(wordArr[i] == c) {
                p=0;
            } else {
                p+=1;

                if(pArr[i]>p) {
                    pArr[i] = p;
                }
            }
        }

        return pArr;
    }
}