package NewTask;

// By Simao Domingos
/*
 Make a consultation program by the person's numerical position:
   read people's names, the amount being determined by the user.
    Right after the entry ask the user in what position he
    I would like to consult the name.
     After your answer, display the name in the position provided.
Draw the user's attention in case of an invalid query, that is,
  with numbers less than or equal to zero, or greater
  than the registered quantity. 
 
 */

import java.util.Arrays;
import java.util.Scanner;

public class Posicoes_Nomes {

	public static void main(String[] args) {
		 int i;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("  Enter number of people: ");
		 int n = sc.nextInt();
		 String nomes[] = new String[n]; 
		 	for(i=0; i< nomes.length; i++) {
		 	
		 		System.out.println(" enter the person's name: "+(i+1)+": ");
		 		Scanner ps = new Scanner(System.in);
		 		nomes[i] = ps.nextLine();	
		 		
		 	
		 } 
		 	System.out.println(" in what position is the name found:  ");
		 	int posicao=i;
		 	Scanner ps = new Scanner(System.in);
	 		 posicao = ps.nextInt(); 
		 	for( i=0; i< nomes.length; i++) {
		 		if (posicao<n) {
		 			
		 		System.out.println(" Name found in position --> " +(posicao)+ " is: "); 
		 		System.out.println(nomes[posicao]); 
		 		System.out.println("  TESTANDO O GIT E O GITHUB ");
		 		break;
		 		}
		 		
		 		else
		 	
	 			System.out.println("  Inserted position does not exist ");
		 		
		 		
		 		break;
		 	}
		 	
		  
		}
	}



