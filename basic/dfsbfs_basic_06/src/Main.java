public class Main {
    static int n; // 부분 집합 원소 개수
    static int[] ch; // 사용 여부 체크할 배열

    public void Dfs(int L) {
        if (L == n + 1) {
            String temp = "";
            for (int i = 1; i <= n; i++) {
                if (ch[i] == 1) { temp += (i + " "); }
            }
            if (temp.length() > 0) {
                System.out.println(temp);
            }
        } else {
            ch[L] = 1; // 사용 o
            Dfs(L + 1);
            ch[L] = 0; // 사용 x
            Dfs(L + 1);
        }
    }

    public static void main(String[] args) {
        Main m = new Main();
        n = 3;
        ch = new int[n + 1];
        m.Dfs(1);
    }
}