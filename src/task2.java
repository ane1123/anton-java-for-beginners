
import java.util.Scanner;
import java.util.Random;

public class task2 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner in = new Scanner(System.in);

        String randomcode = "0123456789";
        String a = "";
        StringBuilder sb = new StringBuilder("");

        System.out.println(sb);


        int randomindex = 0;

        int number = in.nextInt();
        String str2 = "";


        int i;
        for (i = 0; i < number; i++) {


            randomindex = (int) ( Math.random() * 10 );
            str2 = Integer.toString(randomindex);
            System.out.print(randomcode.charAt(randomindex));

            if (i == 0 & randomindex == 0)
            {


            }














        }



        String s = str2;
        System.out.println(s);












    }
}
