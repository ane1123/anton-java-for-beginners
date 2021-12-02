package bullsandcows;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();

        String alphabet = "abcdef";

      char latter = (alphabet.charAt(r.nextInt(alphabet.length())));
      int a = (int) ((Math.random() * ((9))) + 0);
      int s  = (int) ((Math.random() * ((9))) + 0);
      int c = (int) ((Math.random() * ((9))) + 0);
      String num1 = Integer.toString(a);
      String num2 = Integer.toString(s);
      String num3 = Integer.toString(c);



      int u = (int) ((Math.random() * ((4))) + 1);


      if(u == 1){
          System.out.println(latter + num1 + num2 + num3 );
      }if (u == 2){
            System.out.println( num1 + latter+ num2 + num3 );
        }if (u == 3){
            System.out.println( num1 + num2 + latter + num3 );
        }if (u == 4){
            System.out.println( num1 +  num2 + num3 + latter );
        }
    }
}
