package fiado;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Consumidor Consumidor = new Consumidor();
		Consumidor.fiados = new int[10];
		
  		Scanner scanner = new Scanner(System.in);
		System.out.print("Informe o nome do cliente: ");
		Consumidor.nome = scanner.nextLine();
		System.out.print("Informe o valor da compra: ");
		Consumidor.fiados[0] = Integer.valueOf(scanner.nextLine());
		
		int total = somaWhile(Consumidor.fiados);
		
		if (total > 100) {
		System.out.println("Cliente " + Consumidor.nome + " deve:  " + total + " ganhou brinde! ");
		} else {
			System.out.println("Cliente " + Consumidor.nome + " deve:  " + total);
		}
		
		
	}

	
	public static int somaWhile(int[] fiados) {
		int i = 0;
		int total = 0;
		while (i < fiados.length) {
			total += fiados[i];
			i++;
		}
		return total;
	}
	
	public static int somaFor(int[] fiados) {
		int total = 0;
		for (int i = 0; i < fiados.length; i++) {
			total += fiados[i];
		}
		
		return total;
	}	
		
	public static int somaForeach(int[] fiados) {
		int total = 0;
		for (int fiado : fiados) {
			total += fiado;
		}
		return total;
	}
	
}