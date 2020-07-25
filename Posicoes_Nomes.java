package NewTask;

// By Simao Domingos
/*
 Faça um programa de consulta pela posição numérica da pessoa:
  leia nomes de pessoas, sendo a quantidade determinada pelo usuário.
   Logo após a entrada pergunte ao usuário em que posição ele 
   gostaria de consultar o nome.
    Após sua resposta, exiba o nome que fica na posição informada.
Chame atenção do usuário em caso de uma consulta inválida, ou seja,
 com números menores ou iguais a zero, ou maiores 
 do que a quantidade cadastrada.
 
 */

import java.util.Arrays;
import java.util.Scanner;

public class Posicoes_Nomes {

	public static void main(String[] args) {
		 int i;
		 Scanner sc = new Scanner(System.in);
		 System.out.println(" Insira número  de pessoas: ");
		 int n = sc.nextInt();
		 String nomes[] = new String[n]; 
		 	for(i=0; i< nomes.length; i++) {
		 	
		 		System.out.println("insira  o nome da pessoa "+(i+1)+": ");
		 		Scanner ps = new Scanner(System.in);
		 		nomes[i] = ps.nextLine();	
		 		
		 	
		 } 
		 	System.out.println("Em que posicao se encintra o nome: ");
		 	int posicao=i;
		 	Scanner ps = new Scanner(System.in);
	 		 posicao = ps.nextInt(); 
		 	for( i=0; i< nomes.length; i++) {
		 		if (posicao<n) {
		 			
		 		System.out.println("Nome encontrado na posicao--> " +(posicao)+ " eh: "); 
		 		System.out.println(nomes[posicao]); 
		 		System.out.println("  TESTANDO O GIT E O GITHUB ");
		 		break;
		 		}
		 		
		 		else
		 	
	 			System.out.println(" Posicao inserida  nao existe  ");
		 		
		 		
		 		break;
		 	}
		 	
		  
		}
	}



