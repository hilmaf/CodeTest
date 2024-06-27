import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.StringTokenizer;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        Map<String, String> map = new HashMap<>();
        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            map.put(st.nextToken(), st.nextToken());
        }
        
        String targetValue = "enter";
        map.entrySet().stream()
            .filter(entry -> targetValue.equals(entry.getValue()))
            .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
            .forEach(entry -> System.out.println(entry.getKey()));
    }
}