import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());

        int[] results = new int[num];
        for (int i = 0; i < num; i++) {
            results[i] = sc.nextInt();
        }

        /////////////////////////////////////////

        int[] points = new int[num];
        points[0] = results[0];
        for (int i = 1; i < results.length; i++) {
            if(results[i] == 1) {
                switch(results[i-1]) {
                    case 0: points[i] = 1; continue;
                    case 1: points[i] = points[i-1] + 1; continue;
                }
            } else {
                points[i] = 0;
            }
        }

        int totalPoint = 0;
        for(int x : points) {
            totalPoint += x;
        }

        System.out.println(totalPoint);
    }
}