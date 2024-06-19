import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int constructor = 0;
        for(int i = 1; i < N; i++) {

            // 자릿수 합 구하기
            int digitSum = i%10;
            int i_ = i;
            while(i_ / 10 > 0) {
                i_ = (i_ - (i_ % 10)) / 10;
                digitSum += i_ % 10;
            }

            if(i + digitSum == N) {
                constructor = i;
                break;
            }
        }

        System.out.println(constructor);
    }
}