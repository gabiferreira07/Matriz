package Matriz;

import java.util.Scanner;

public class Diagonal {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int m[][] = new int [4][4];
		
		for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j) { 
                    m[i][j] = (int)Math.round(Math.random()*10);; 
                }
            }
        }
        System.out.println("Os valores na diagonal são:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println(); 
    }
}
}