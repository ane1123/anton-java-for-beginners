package bullsandcows;

import java.util.Random;
import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random r = new Random();
        String a= "1234567890";

        StringBuilder sb = new StringBuilder("");
        String w = "123456789";


        int s = in.nextInt();
        int d = 0;
        for (int i = 0; i < s; i++) {
            char x = (a.charAt(r.nextInt(a.length())));
            sb.append(x);
            d++;


            int c = sb.indexOf(String.valueOf(x));

           /* if (c != -1){
                x = (a.charAt(r.nextInt(a.length())));
                sb.append(x);
            }*/

            if (sb.charAt(0) == 0){
                char q = (w.charAt(r.nextInt(w.length())));
                sb.setCharAt(0, q);
            }




        }
        System.out.println(sb);
    }
    }

