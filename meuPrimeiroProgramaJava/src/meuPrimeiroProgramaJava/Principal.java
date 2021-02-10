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
public class Principal { // Classe que cont�m o metodo principal.
	public static void main(String[] args) {
		
		// Salda��o e pergunta o nome.
		System.out.println("Hello Word!\nQual o seu nome?"); // Uso do println
		
		// Ler o nome.		
		Scanner in = new Scanner(System.in);
		String nome = in.nextLine();
		
		// Salda��o especifica para o nome lido.		
		System.out.printf("Ol� %s!\n", nome);			
		
		// Perguntar Idade
		System.out.printf("%s, Qual � a sua idade?", nome);
		
		//Ler Idade
		Integer idade = in.nextInt();
		System.out.printf("%d! Puxa! Como voc� � jovem!", idade);
	}

}
