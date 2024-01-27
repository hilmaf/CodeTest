import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 10번
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
        // 기준이 되는 문자를 제외한 단어만 추출
        String word = str.substring(0, str.length()-2);

        int p=101; // 문자열의 길이는 100을 넘지 않는다
        char[] wordArr = word.toCharArray(); // 단어 char 배열
        int[] pArr = new int[word.length()]; // 거리값 배열

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