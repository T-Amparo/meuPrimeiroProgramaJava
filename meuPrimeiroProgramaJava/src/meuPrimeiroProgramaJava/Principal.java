/**
 * Este programa mostra ao aluno:
 * 1) Que um programa Java ÃƒÂ© construido dentro de um projeto Java.
 * 2) Todo programa Java deve ter uma classe com um mÃƒÂ©todo main.
 * 3) Como exibir informaÃƒÂ§ÃƒÂµes no terminal (console) do Java.
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
public class Principal { // Classe que contÃ©m o metodo principal.
	public static void main(String[] args) {
		
		// SaldaÃ§Ã£o e pergunta o nome.
		System.out.println("Hello Word!\nQual o seu nome?"); // Uso do println
		
		// Ler o nome.		
		Scanner in = new Scanner(System.in);
		String nome = in.nextLine();
		
		// SaldaÃ§Ã£o especifica para o nome lido.		
		System.out.printf("OlÃ¡ %s!\n", nome);			
		
		// Perguntar Idade
		System.out.printf("%s, Qual Ã© a sua idade?", nome);
		
		//Ler Idade
		Integer idade = in.nextInt();
		System.out.printf("%d! Puxa! Como vocÃª Ã© jovem!", idade);
		
		//Não esquecer de implementar a pergunta sobrenome
		
	}

}
