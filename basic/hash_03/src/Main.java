import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력받기
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] sales = new int[n];
        for (int i = 0; i < n; i++) {
            sales[i] = sc.nextInt();
        }

        /////////////////////////////////////////

        // 슬라이딩 윈도우 사용
        int lt = 0;
//        HashSet<Integ?er> set = new HashSet<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int rt = 0; rt < sales.length; rt++) {
//            set.add(sales[rt]);
            map.put(sales[rt], map.getOrDefault(sales[rt], 0)+1);

            // lt에서 rt까지의 개수가 k개일 때
            if(rt-lt+1 == k) {
                System.out.print(map.size() + " ");

                // lt 오른쪽으로 한칸 이동
                map.put(sales[lt], map.get(sales[lt])-1);
                if(map.get(sales[lt])==0) {
                    map.remove(sales[lt]);
                }

//                System.out.print?(set.size() + " ");
//                set.remove(sales[lt]);
                lt++;
            }
        }
    }
}