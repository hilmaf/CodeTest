import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력받기
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());

        String str = sc.next();

        // 문자열 자르기
        String[] votes = str.split("");

        // A, B, C, D, E에 따른 cnt 수를 map에 담기
        Map<String, Integer> map = new HashMap<String, Integer>();
        String[] candidates = new String[]{"A", "B", "C", "D", "E"};
        for(String x : candidates) {
            map.put(x, 0);
        }

        for(String x : votes) {
            int cnt = map.get(x);
            map.put(x, ++cnt);
        }

        // map의 값 중 가장 큰 값을 출력하기
        Map.Entry<String, Integer> maxEntry = null;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (maxEntry == null || entry.getValue() > maxEntry.getValue()) {
                maxEntry = entry;
            }
        }

        System.out.println(maxEntry.getKey());
    }
}