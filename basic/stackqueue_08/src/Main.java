import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    // 8 응급실
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력받기
        int N = sc.nextInt(); // 대기 환자수
        int M = sc.nextInt(); // M번째 환자
        sc.nextLine();
        int[] priorities = new int[N]; // 환자의 위험도
        for (int i = 0; i < N; i++) {
            priorities[i] = sc.nextInt();
        }
        solution(N, M, priorities);
        sc.close();
    }

    private static void solution(int N, int M, int[] priorities) {
        int answer = 0;
        Queue<Person> queue = new LinkedList<>();

        for (int i = 0; i < N; i++){ // 큐에 환자 추가
            queue.add(new Person(i, priorities[i]));
        }

        while(!queue.isEmpty()){
            Person tmp = queue.poll(); // 환자 1명 뽑기
            boolean priorityHigh = false;

            for (Person p : queue) {
                if (p.risk > tmp.risk) { // p의 위험도와 뽑은 환자의 위험도 비교
                    priorityHigh = true; // p가 크면 true
                    break;
                }
            }

            if (priorityHigh) {
                queue.add(tmp); // 위험도가 높은 환자가 있으면 다시 대기 목록의 끝에 추가
            } else { // p가 작으면
                answer++;
                if (tmp.num == M) { // M번째 환자의 진료 순서일 때 break
                    break;
                }
            }
        }
        System.out.println(answer);
    }

    public static class Person{
        int num;
        int risk;

        public Person(int num, int risk){
            this.num = num;
            this.risk = risk;
        }
    }

}