import java.util.Random;
import java.util.Scanner;

public class tas {
    public static void main(String[] args) {
       Random r = new Random();


        int countBulls = 0;
        int countCows = 0;
        String code = "9305";
        System.out.println("введите число");
        Scanner in = new Scanner(System.in);
        String userCode = in.nextLine();

        for (int j = 0; j < code.length(); j++) {
            char codeChar = code.charAt(j);
            char userCodeChar = userCode.charAt(j);

            if (codeChar == userCodeChar) {
                countBulls++;
                continue;
            }

            if (userCode.indexOf(codeChar) != -1) {
                countCows++;
            }
        }

        System.out.println("счет быков: " + countBulls + "  коров: " + countCows);

    }
}