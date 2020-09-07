package fiado;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String nome;
		String telefone;
		ArrayList<Integer> fiados = new ArrayList<Integer>();
		int valor;
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.print("Cliente : "); 
		nome = sc.nextLine();
		System.out.print("Telefone : "); 
		telefone = sc.nextLine();
		System.out.print("valor: ");
		valor = sc.nextInt();
		
		
		Consumidor consumidor = new Consumidor(nome,fiados,telefone);

		while (valor > 0) {
			consumidor.adiciona(fiados, valor);
			System.out.print("Outro valor?: ");
			valor = sc.nextInt();
		}
		
		
		
		System.out.println(consumidor.getFiados());
		

	}

}