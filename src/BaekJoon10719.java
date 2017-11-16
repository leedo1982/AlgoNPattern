import java.util.Scanner;

public class BaekJoon10719 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String text = sc.nextLine();
            if (text.length() <= 100) {
                System.out.println(text);
            }
        }
    }
}
