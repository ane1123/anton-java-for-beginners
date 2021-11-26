package simpletictactoe;
import java.util.Scanner;

public class tictac3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int j = 0;
        int k = 3;
        System.out.println("введите");
        String cells = in.nextLine();
        System.out.print("-----------");
        for(int i = 0; i < 3; i++){
            System.out.print("| ");
            for (; j < k; j++){
                System.out.print(cells.charAt(j) + "");
            }
            k += 3;
            System.out.println("|");
        }
        System.out.println("----------");
    }
}
