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

        // target을 바탕으로 map 생성
        HashMap<Character, Integer> map = new HashMap<>();
        for(char x : target.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0));
        }

        // 슬라이딩 윈도우
        char[] strArr = str.toCharArray();
        int lt = 0;
        int answer = 0;
        for (int rt = 0; rt < strArr.length; rt++) {
            map.put(strArr[rt], map.getOrDefault(strArr[rt], -1)+1);

            if(rt-lt+1 == target.length()) {
                if(map.size() == target.length() && !map.containsValue(0)) {
                    answer++;
                }

                map.put(strArr[lt], map.get(strArr[lt])-1);

                if(map.get(strArr[lt])==-1) {
                    map.remove(strArr[lt]);
                }

                lt++;
            }

        }

        System.out.println(answer);
    }
}