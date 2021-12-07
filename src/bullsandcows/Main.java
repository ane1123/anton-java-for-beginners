package bullsandcows;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner in = new Scanner(System.in);

        String alphabet = "abcdef";

      char latter = (alphabet.charAt(r.nextInt(alphabet.length())));
      int a = (int) ((Math.random() * ((9))) + 0);
      int s  = (int) ((Math.random() * ((9))) + 0);
      int c = (int) ((Math.random() * ((9))) + 0);
      String num1 = Integer.toString(a);
      String num2 = Integer.toString(s);
      String num3 = Integer.toString(c);

      boolean  tr = true;

      int u = (int) ((Math.random() * ((4))) + 1);

        System.out.println("код готов \n"
                + "**** \n");


      if(u == 1){
          System.out.println(latter + num1 + num2 + num3 );
      }if (u == 2){
            System.out.println( num1 + latter+ num2 + num3 );
        }if (u == 3){
            System.out.println( num1 + num2 + latter + num3 );
        }if (u == 4){
            System.out.println( num1 +  num2 + num3 + latter );
        }

       while (tr == true){
           System.out.println("введите код");
       }
       String user = in.nextLine();


 /*for (int i = 1; i <= 100; i++) {
            int z = a * i;
            z1 = String.valueOf(z);
            x = z1.length();
            System.out.println("qwe" + z1);

            for (int j = 0; j <= x; j++) {

                if (z1.charAt(j) == 1 || z1.charAt(j) == 0) {
                    System.out.println(z1);

                }
            }
        }*/
    }
}
