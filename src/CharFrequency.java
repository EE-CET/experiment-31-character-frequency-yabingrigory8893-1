import java.util.Scanner;

public class CharFrequency {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            if (!sc.hasNextLine()) return;
            String s = sc.nextLine();
            
            if (!sc.hasNext()) return;
            char c = sc.next().charAt(0);
            
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == c) {
                    count++;
                }
            }
            
            System.out.println(count);
        }
    }
}
