import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(1);

        list = solution(N, list);

        for (Integer i : list) {
            System.out.print(i + " ");
        }
    }

    private static List solution(int n, List list) {
        if (list.size() == n) {
            return list;
        } else {
            int a = (int)list.get(list.size() - 1);
            int b = (int) list.get(list.size() - 2);
            list.add(a + b);
            return solution(n, list);
        }
    }
}