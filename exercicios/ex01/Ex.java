package Ex01;

import java.util.Scanner;

public class Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matriz [] [] = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("Digite um numero");
                matriz [i] [j] = sc.nextInt();
            }
        }
    }
}
