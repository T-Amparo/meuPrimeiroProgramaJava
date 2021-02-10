/**
 * Este programa mostra ao aluno:
 * 1) Que um programa Java é construido dentro de um projeto Java.
 * 2) Todo programa Java deve ter uma classe com um método main.
 * 3) Como exibir informações no terminal (console) do Java.
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
public class Principal { //Classe que contém o método principal.
	public static void main(String[] args) {
		
		//Saldação e pergunta o nome.
		System.out.println("Hello Word!\nQual é o seu nome?"); // Uso do println
		
		// Ler o nome.		
		Scanner in = new Scanner(System.in);
		String nome = in.nextLine();
		
		// Saldação específica para o nome lido.		
		System.out.printf("Olá %s!\n", nome);
		in.close();			
	}

}
