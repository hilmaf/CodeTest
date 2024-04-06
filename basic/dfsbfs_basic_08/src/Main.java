import java.util.Scanner;

public class Main {

    static int cnt;

    public static int jump(int hyunSoo, int cow) {
        // 송아지와 현수의 위치가 같으면 return
        // 송아지와 현수의 거리가 5 이상이면 앞으로 5
        // 그 외에는 앞으로 1 or 뒤로 1
        if(hyunSoo == cow) {
            return cnt;
        }

        if(cow - hyunSoo >= 5) {
            cnt++;
            return jump(hyunSoo+5, cow);
        } else if(hyunSoo > cow) {
            cnt++;
            return jump(hyunSoo-1, cow);
        } else {
            cnt++;
            return jump(hyunSoo+1, cow);
        }

    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int hyunSoo = sc.nextInt();
        int cow = sc.nextInt();

        ///////////////////////////////////
        jump(hyunSoo, cow);

        // 출력하기
        System.out.println(cnt);
    }
}