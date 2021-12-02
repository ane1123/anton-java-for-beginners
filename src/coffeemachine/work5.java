package coffeemachine;

import java.util.Arrays;
import java.util.Scanner;
class work5 {
    public static void main(String[] args) {



        Scanner in = new Scanner(System.in);
        int Cup = 9;
        int j;
        int w2 = 0;
        int с2 = 0;
        int m2 = 0;
        int cu2 = 0;
        int l = 0;
        int w = 0;
        int q = 0;
        int z = 0;




        int mm;

        int cof;
        int v = 0;

        int water = 2000;
        int milk = 500;
        int coffee = 150;
        int wzq = q + w + z;
        String cappuccino = "cappuccino";

        int water2 = water + w2;
        int milk2 = milk + m2;
        int coffee2 = coffee + с2;

        int cup2 = Cup + v - wzq;


        System.out.println(water2 +" ml of water: "  );
        System.out.println(milk2 + " ml of milk ");
        System.out.println(coffee2 + " g of coffee beans" );
        System.out.println(cup2 +" disposable cups " );
        System.out.println( "$" + l + " of money" );

        while (true) {

            System.out.println("\n" +
                    "что вы хотите сделать" +
                    " buy-1,fill-2,take-3,exit-4,remaining-5");

            water = 2500; // 2 литра воды в кофе варке
            milk = 500; // 0.5 литров молока в кофе варке
            coffee = 150; // 0.15 грамм коффе




            int m3 = 0;


            int esm = 0;
            int lam = 0;
            int cam = 0;

            int water3 = 2000;
            int milk3 = 500;
            int coffee3 = 150;
            int m;
            int n;
            int b;
            int zx;
            int u;
            int t;
            int qw;
            int as;
            int er;
            int qa,ws,ed;


            String buy = "buy";
            String remaining = "remaining";
            String back = "back - to main menu";

            String latte = "latte";
            String expr = "cespresso";
            String cap = "cappuccino";

            String p = in.nextLine();


            if (p.equals(buy)) {

                System.out.println("espresso,latte,cappuccino");
                String a = in.nextLine();


                if (a.equals(expr)) {
                    System.out.println("espresso стоит 4$");
                    System.out.println("сколько порций");
                    q = in.nextInt();
                    esm = q * 4;
                    l = esm + l;
                    m = q * 16;
                    n = q * 50;
                    b = q * 250;
                    ed = cup2 - q;
                    cup2 = ed;




                    water3 = water2 - b;
                    coffee3 = coffee2 - m;
                    milk3 = milk2 - n;
                    water2 = water3;
                    coffee2 = coffee3;
                    milk2 = milk3;
                    if (water2 < water3){
                        System.out.println("EROR");
                    } else if (water2 > water3){
                        System.out.println("ok");
                    }




                    System.out.println(esm + " $ цена");
                }

                else if (a.equals(latte)) {
                    System.out.println("latte стоит 7$");
                    System.out.println("сколько порций");
                    z = in.nextInt();
                    lam = z * 7;
                    l = lam + l;

                    zx = z * 350;
                    u = z * 75;
                    t = z * 20;



                    water3 = water2 - zx;
                    coffee3 = coffee2 - t;
                    milk3 = milk2 - u;
                    water2 = water3;
                    coffee2 = coffee3;
                    milk2 = milk3;


                    qa = cup2 - z;
                    cup2 = qa;


                    System.out.println(lam + " $ цена");
                } else if (a.equals(cap)) {
                    System.out.println("cappuccino стоит 6$");
                    System.out.println("сколько порций");
                    w = in.nextInt();
                    cam = w * 6;
                    l = cam + l;

                    qw = w * 200;
                    as = w * 100;
                    er = w * 12;



                    water3 = water2 - qw;
                    coffee3 = coffee2 - er;
                    milk3 = milk2 - as;

                    water2 = water3;
                    coffee2 = coffee3;
                    milk2 = milk3;

                    ws = cup2 - w;
                    cup2 = ws;



                    System.out.println(cam + " $ цена");
                }

            }



String fill = "fill";
String wa1ter = "water";
String coffe1e = "coffee";
String cu1p = "cup";
String mils = "milk";

            if (p.equals(fill)) {
                System.out.println("какие ингридиенты вы хотите добавить");
                System.out.println("water,milk,coffee,cup");
                int i = in.nextInt();
                if (p.equals(wa1ter)) {

                    System.out.println("сколько воды вы хотите добавить");
                    w2 = in.nextInt();
                    System.out.println(water + w2 + " в итоге");


                } else if (p.equals(mils)) {
                    System.out.println("сколько молока кофе вы хотите добавить");
                    m2 = in.nextInt();
                    System.out.println(milk + m2 + " в итоге");

                } else if (p.equals(coffe1e)) {
                    System.out.println("сколько г кофе вы хотите добавить");
                    с2 = in.nextInt();
                    System.out.println(coffee + с2 + "в итоге");


                } else if (p.equals(cu1p)) {
                    System.out.println("сейчас " + Cup + " хотите добавить ");
                    v = in.nextInt();
                    System.out.println(v + Cup + "стакана");
                }
            }

/*
            if (p == 3) {
                System.out.println("есть " + l + "$");
                System.out.println("сколько хотите снять число должно быть меньше " + l);
                mm = in.nextInt();
                l = l - mm;


                if (mm < l) {
                    System.out.println("EROR");
                } else if (m3 > l) {
                    System.out.println("у вас осталось " + l);
                }




            }




            if (p == 4) {
                System.exit(p);
                System.out.println("пока");

            }






            if (p == 5) {


                System.out.println("The coffee machine has:\n" +
                        water3 + " ml of water\n" +
                        milk3 + " ml of milk\n" +
                        coffee3 + " g of coffee beans\n" +
                        cup2 + " disposable cups\n" +
                        l + "$ of money\n"
                );
            }*/

        }



    }
}




