package bullsandcows;

import java.util.Objects;
import java.util.Scanner;
import java.util.Random;

public class task4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random random = new Random();

        StringBuilder Num = new StringBuilder();
        StringBuilder userNum = new StringBuilder();

        System.out.println("введите длину ");
        int length = in.nextInt();

        if(length > 9){
            System.out.println("Max 9.");
            return;
        }

        int a = 1;

        int cow;
        int bull = 0;

        for (int i = 0; i < length; i++) {
            if(i == 0){
                Num.append(random.nextInt(9) + 1);
                continue;
            }
            String ranDig = Integer.toString(random.nextInt(9) + 1);
            if(Num.indexOf(ranDig) == -1){
                Num.append(ranDig);
            }
            else{
                i--;
            }
        }



        while(bull != Num.length()){
            bull = 0;
            cow = 0;

            System.out.println("попытка " + a + ":");
            userNum.append(in.nextLine());

            for (int i = 0; i < Num.length(); i++) {
                for (int j = 0; j < userNum.length(); j++) {
                    if(Num.charAt(i) == userNum.charAt(j)){
                        cow = i != j? cow + 1 : cow;
                        bull = i == j? bull + 1 : bull;
                    }
                }
            }

            if(bull != 0 && cow != 0){
                System.out.println("быков " + bull + "  and коров " + cow);
            }
            else if(bull != 0){
                System.out.println("быков " + bull );
            }
            else if(cow != 0){
                System.out.println("коров " + cow);
            }
            else {
                System.out.println("\n" +
                       " введите нормальный ответ");
            }

            a++;
            userNum.setLength(0);
        }

        System.out.println("\n" +
                "Поздравляю! Вы угадали секретный код.");
    }
}
