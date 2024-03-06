import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 4. 모든 아나그램 찾기
        // 입력받기
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String target = sc.next();

        /////////////////////////////////////////

        // target Map
        HashMap<Character, Integer> targetMap = new HashMap<>();
        for(char x : target.toCharArray()) {
            targetMap.put(x, targetMap.getOrDefault(x, 0)+1);
        }

        // 슬라이딩 윈도우
        char[] strArr = str.toCharArray();
        int lt = 0;
        int answer = 0;
        HashMap<Character, Integer> strMap = new HashMap<>();
        for (int rt = 0; rt < strArr.length; rt++) {
            strMap.put(strArr[rt], strMap.getOrDefault(strArr[rt], 0)+1);

                if(rt-lt+1 == target.length()) {
                    if(strMap.equals(targetMap)) {
                        answer++;
                    }
                    strMap.put(strArr[lt], strMap.get(strArr[lt])-1);

                    if(strMap.get(strArr[lt])==0) {
                        strMap.remove(strArr[lt]);
                    }

                    lt++;
                }

        }
        System.out.println(answer);
        }

}
