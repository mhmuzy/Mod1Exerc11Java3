package Hitss.Treinamento.Infra;

import java.util.Scanner;

public class Controller {
	public static void Play() {
		try {
			
		
		System.out.println("");
		System.out.println("       Hitss Treinamento");
		System.out.println("");
		System.out.println("--------------------------------------");
		System.out.println("Le�o");
		System.out.println("Cavalo");
		System.out.println("Homem");
		System.out.println("--------------------------------------");
		System.out.println("");
		System.out.println("Escolha um Animal");
		System.out.println("");
		Scanner teclado = new Scanner(System.in);
	    System.out.println("� um Quadr�pede?");
	    System.out.println("(1) - Sim");
	    System.out.println("(2) - N�o");
	    System.out.println("");
	    int resp = teclado.nextInt();
	    System.out.println("");
	    if (resp == 1) {
			System.out.println("");
			System.out.println("� um Herb�voro");
			System.out.println("(1) - Sim");
		    System.out.println("(2) - N�o");
			System.out.println("");
			resp = teclado.nextInt();
			System.out.println("");
			if (resp == 1) {
				System.out.println("");
				System.out.println("Ent�o o animal escolhido foi o Cavalo");
			} else {
				System.out.println("");
				System.out.println("Ent�o o animal escolhido foi o Le�o.");
			}
		} else {
			System.out.println("");
			System.out.println("Ent�o o Animal escolhido foi o Homem");
		}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
