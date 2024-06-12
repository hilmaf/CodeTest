import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        
        for(int i = 0; i < N; i++) {
            int repeat = sc.nextInt();
            String str = sc.next();
            
            for(char c : str.toCharArray()) {
                for(int j = 0; j < repeat; j++) {
                    System.out.print(c);
                }
            }
            
            System.out.println();
        }
    } // psvm
} // Main