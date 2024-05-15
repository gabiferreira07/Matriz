package Matriz;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int m[][] = new int [5][5];
		int soma = 0;
		
		//Entrada de dados
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				m[i][j] = (int)Math.round(Math.random()*20)*2;
				soma += m[i][j];
	
			}
		}
		//Saída de dados
		System.out.println("Os valores são:");
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				 System.out.print(m[i][j] + "\t");
            }
            System.out.println(); 
		}
		System.out.println("A soma de todos é: " + soma);
	}

}
