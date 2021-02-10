/**
 * Este programa mostra ao aluno:
 * 1) Que um programa Java � construido dentro de um projeto Java.
 * 2) Todo programa Java deve ter uma classe com um m�todo main.
 * 3) Como exibir informa��es no terminal (console) do Java.
 * 4) Como ler um String (console) do Java.
 * 
 */
package meuPrimeiroProgramaJava;
import java.util.Scanner;

/**
 * @author Thiago
 * Data: 03/02/2021
 *
 */
public class Principal { //Classe que cont�m o m�todo principal.
	public static void main(String[] args) {
		
		System.out.println("Hello Word!\nQual � o seu nome?"); // Uso do println
		
		// Ler um string usando a biblioteca Scanner.		
		Scanner in = new Scanner(System.in);
		String nome = in.nextLine();
		
		// Exibir uma String printf.		
		System.out.printf("Ol� %s!\n", nome);
		in.close();			
	}

}
