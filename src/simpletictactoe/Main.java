package simpletictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        char emptyCell = ' ';

        char[][] field = {{' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}};
        Scanner in = new Scanner(System.in);

        while (true) {

            System.out.println("введите место X от 1 до 3:");
            int b = in.nextInt() - 1;
            if (b < 0 || b > 2) {
                System.out.println("введите место от 1 до 3:");
                System.exit(b);
            } else {
                System.out.println("введите место O от 1 до 3:");
                int a = in.nextInt() - 1;
                if (a < 0 || a > 2) {
                    System.out.println("введите место от 1 до 3:");
                    System.exit(a);
                } else {


                    if (field[b][a] != ' ') {
                        System.exit(a);
                        System.out.println("эта клетка занита");
                    } else {
                        field[b][a] = 'x';

                        System.out.println("_______");
                        for (int i = 0; i < 3; i++) {
                            System.out.print(field[i][0] + " ");
                            for (int j = 0; j < 3; j++) {
                                System.out.print(field[i][j] + " ");
                            }
                            System.out.println();
                        }
                        System.out.println("_______");

                        String win = "";
                        int u = 2;
                        if (field[0][0] == field[1][1] && field[0][0] == field[2][2] && field[0][0] != emptyCell) {

                            System.out.println("win " + field[0][0]);
                            System.exit(u);
                            u = 1;


                        }
                        if (field[0][2] == field[1][1] && field[1][1] == field[2][0] && field[0][2] != emptyCell) {

                            System.out.println("win " + field[0][2]);
                            System.exit(u);
                            u = 1;
                        }
                        if (field[0][0] == field[1][0] && field[1][0] == field[0][2] && field[0][0] != emptyCell) {

                            System.out.println("win " + field[1][0]);
                            System.exit(u);
                            u = 1;
                        }
                        if (field[0][1] == field[1][1] && field[1][1] == field[2][1] && field[0][1] != emptyCell) {

                            System.out.println("win " + field[2][1]);
                            System.exit(u);
                            u = 1;
                        }
                        if (field[0][2] == field[1][2] && field[1][2] == field[2][2] && field[0][2] != emptyCell) {

                            System.out.println("win " + field[1][2]);
                            System.exit(u);
                            u = 1;
                        }
                        if (field[0][0] == field[0][1] && field[0][1] == field[0][2] && field[0][0] != emptyCell) {

                            System.out.println("win " + field[0][1]);
                            System.exit(u);
                            u = 1;
                        }
                        if (field[1][0] == field[1][1] && field[1][1] == field[2][1] && field[1][0] != emptyCell) {

                            System.out.println("win " + field[1][1]);
                            System.exit(u);
                            u = 1;
                        }
                        if (field[2][0] == field[2][1] && field[2][1] == field[2][2] && field[2][0] != emptyCell) {

                            System.out.println("win " + field[2][0]);
                            System.exit(u);
                            u = 1;
                        }







                        System.out.println("введите место 0 от 1 до 3:");
                        int c = in.nextInt() - 1;
                        if (c < 0 || c > 2) {
                            System.out.println("введите место от 1 до 3:");
                            System.exit(c);
                        } else {


                            System.out.println("введите место 0 от 1 до 3:");
                            int d = in.nextInt() - 1;
                            if (d < 0 || d > 2) {
                                System.out.println("введите место от 1 до 3:");
                                System.exit(d);
                            } else {


                                if (field[c][d] != ' ') {
                                    System.exit(c);
                                    System.out.println("эта клетка занита");
                                } else {

                                    field[c][d] = '0';

                                    System.out.println("________________");
                                    for (int i = 0; i < 3; i++) {
                                        System.out.print(field[i][0] + "|  ");
                                        for (int j = 0; j < 3; j++) {
                                            System.out.print(field[i][j] + "  ");
                                        }
                                        System.out.println();
                                    }
                                    System.out.println("________________");


                                    if (field[0][0] == field[1][1] && field[0][0] == field[2][2] && field[0][0] != emptyCell) {

                                        System.out.println("win " + field[0][0]);
                                        u = 1;


                                    }
                                    if (field[0][2] == field[1][1] && field[1][1] == field[2][0] && field[0][2] != emptyCell) {

                                        System.out.println("win " + field[0][2]);
                                        System.exit(u);
                                        u = 1;
                                    }
                                    if (field[0][0] == field[1][0] && field[1][0] == field[0][2] && field[0][0] != emptyCell) {

                                        System.out.println("win " + field[1][0]);
                                        System.exit(u);
                                        u = 1;
                                    }
                                    if (field[0][1] == field[1][1] && field[1][1] == field[2][1] && field[0][1] != emptyCell) {

                                        System.out.println("win " + field[2][1]);
                                        System.exit(u);
                                        u = 1;
                                    }
                                    if (field[0][2] == field[1][2] && field[1][2] == field[2][2] && field[0][2] != emptyCell) {

                                        System.out.println("win " + field[1][2]);
                                        System.exit(u);
                                        u = 1;
                                    }
                                    if (field[0][0] == field[0][1] && field[0][1] == field[0][2] && field[0][0] != emptyCell) {

                                        System.out.println("win " + field[0][1]);
                                        System.exit(u);
                                        u = 1;
                                    }
                                    if (field[1][0] == field[1][1] && field[1][1] == field[2][1] && field[1][0] != emptyCell) {

                                        System.out.println("win " + field[1][1]);
                                        System.exit(u);
                                        u = 1;
                                    }
                                    if (field[2][0] == field[2][1] && field[2][1] == field[2][2] && field[2][0] != emptyCell) {

                                        System.out.println("win " + field[2][0]);
                                        System.exit(u);
                                        u = 1;
                                    }
                                    if (u != 2) {



                                        if (field[0][0] != ' ') {
                                            if (field[0][1] != ' ') {
                                                if (field[1][0] != ' ') {
                                                    if (field[0][2] != ' ') {
                                                        if (field[1][1] != ' ') {
                                                            if (field[1][2] != ' ') {
                                                                if (field[2][0] != ' ') {
                                                                    if (field[2][1] != ' ') {
                                                                        if (field[2][2] != ' ') {
                                                                            System.out.println("ничья мест нету");
                                                                            System.exit(u);


                                                                        }
                                                                    }


                                                                }
                                                            }
                                                        }

                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }

                    }

                }
            }
        }
    }
}