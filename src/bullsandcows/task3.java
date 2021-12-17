package bullsandcows;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int length = in.nextInt();
        StringBuilder ranNum = new StringBuilder();

        if(length > 10){
            System.out.println("Error: can't generate a secret number");
            return;
        }

        for (int i = 0; i < length; i++) {
            if(i == 0){
                ranNum.append((int)(Math.random() * 10) + 1);
                continue;
            }
            String ranDig = Integer.toString((int)(Math.random() * 10));
            if(ranNum.indexOf(ranDig) == -1){
                ranNum.append(ranDig);
            }
            else{
                i--;
            }
        }
        System.out.println(ranNum);
    }
}