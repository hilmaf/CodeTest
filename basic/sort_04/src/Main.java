import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // 입력 받기
        Scanner sc=new Scanner(System.in);
        int size = sc.nextInt(); // 캐시 크기
        int N = sc.nextInt(); // 작업 개수

        int[] tasks = new int[N]; // 작업 배열
        for(int i = 0; i < N; i++) {
            tasks[i] = sc.nextInt();
        }
        ///////////////////////////////////////
        int[] cache = new int[size]; // 캐시 배열
        // cache 초기화
        for(int i = 0; i < size; i++) {
            cache[i] = 0;
        }

        for(int task : tasks) { // tasks for문
            boolean found = false;
            int index = -1;
            // task 있는지 여부 확인
            for(int j = 0; j < size; j++) {
                if (cache[j] == task) {
                    found = true;
                    index = j;
                    break;
                }
            }

            if (found) { // 있으면
                for(int k = index; k >= 1; k--) {
                  cache[k] = cache[k-1];
                }
            } else { // 없으면
                for(int j = size-1; j >= 1; j--) {
                    cache[j] = cache[j - 1];
                }
            }
            cache[0] = task;
       }
        // 출력하기
        for(int i = 0; i < size; i++) {
            System.out.print(cache[i] + " ");
        }
    }
}