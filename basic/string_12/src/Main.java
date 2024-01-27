import java.util.*;

public class Main {
    public static void main(String[] args) {
        //12번
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); sc.nextLine();
        String str = sc.nextLine();

        List<String> binaries = new ArrayList<String>();
        for (int i = 0; i < num; i++) {
            binaries.add(str.substring(0, 7).replace('*', '0').replace('#', '1'));
            str = str.substring(7);
        }

        Main m = new Main();
        String result = m.solution(binaries);
        System.out.println(result);

    }

    public String solution(List<String> binaries) {

        Iterator<String> binaryIterator = binaries.iterator();
        StringBuilder resultBuilder = new StringBuilder();

        while(binaryIterator.hasNext()) {
            char[] chars = binaryIterator.next().toCharArray();

            int decimal = 0;
            for (int i = 0; i < 7; i++) {
                decimal += (int)(Character.getNumericValue(chars[i]) * Math.pow(2, 6-i));
            }

            resultBuilder.append((char)decimal);
        }


        return resultBuilder.toString();
    }
}