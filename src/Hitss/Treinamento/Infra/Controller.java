package Hitss.Treinamento.Infra;

import java.util.Scanner;

public class Controller {
	public static void Play() {
		try {
			
		
		System.out.println("");
		System.out.println("       Hitss Treinamento");
		System.out.println("");
		System.out.println("--------------------------------------");
		System.out.println("Leão");
		System.out.println("Cavalo");
		System.out.println("Homem");
		System.out.println("--------------------------------------");
		System.out.println("");
		System.out.println("Escolha um Animal");
		System.out.println("");
		Scanner teclado = new Scanner(System.in);
	    System.out.println("É um Quadrúpede?");
	    System.out.println("(1) - Sim");
	    System.out.println("(2) - Não");
	    System.out.println("");
	    int resp = teclado.nextInt();
	    System.out.println("");
	    if (resp == 1) {
			System.out.println("");
			System.out.println("É um Herbívoro");
			System.out.println("(1) - Sim");
		    System.out.println("(2) - Não");
			System.out.println("");
			resp = teclado.nextInt();
			System.out.println("");
			if (resp == 1) {
				System.out.println("");
				System.out.println("Então o animal escolhido foi o Cavalo");
			} else {
				System.out.println("");
				System.out.println("Então o animal escolhido foi o Leão.");
			}
		} else {
			System.out.println("");
			System.out.println("Então o Animal escolhido foi o Homem");
		}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
