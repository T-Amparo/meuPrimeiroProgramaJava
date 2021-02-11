/**
 * Este programa mostra ao aluno:
 * 1) Que um programa Java Ã© construido dentro de um projeto Java.
 * 2) Todo programa Java deve ter uma classe com um mÃ©todo main.
 * 3) Como exibir informaÃ§Ãµes no terminal (console) do Java.
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
public class Principal { // Classe que contém o metodo principal.
	public static void main(String[] args) {
		
		// Saldação e pergunta o nome.
		System.out.println("Hello Word!\nQual o seu nome?"); // Uso do println
		
		// Ler o nome.		
		Scanner in = new Scanner(System.in);
		String nome = in.nextLine();
		
		// Saldação especifica para o nome lido.		
		System.out.printf("Olá %s!\n", nome);			
		
		// Perguntar Idade
		System.out.printf("%s, Qual é a sua idade?", nome);
		
		//Ler Idade
		Integer idade = in.nextInt();
		System.out.printf("%d! Puxa! Como você é jovem!", idade);
		
		System.out.printf("%s, Qual o seu sobrenome?", nome);
		
		Scanner in1 = new Scanner(System.in);
		String sobrenome = in1.nextLine();
		
		System.out.printf("Seu sobrenome � %s!", sobrenome);		

	}

}
