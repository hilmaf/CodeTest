import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); sc.nextLine();
        String str = sc.nextLine();

        List<String> codes = new ArrayList<String>();
        for (int i = 0; i < num; i++) {
            codes.add(str.substring(0, 7));
            str = str.substring(7);
        }

        Main m = new Main();
        String result = m.solution(codes);
        System.out.println(result);

    }

    public String solution(List<String> codes) {

        Iterator<String> iterator = codes.iterator();
        List<String> binaries = new ArrayList<String>();

        while(iterator.hasNext()) {
            StringBuilder binary = new StringBuilder();
            char[] chars = iterator.next().toCharArray();
            for(char x : chars) {
                switch(x) {
                    case '#': binary.append(1); break;
                    case '*': binary.append(0); break;
                }
            }

            binaries.add(binary.toString());
        }

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