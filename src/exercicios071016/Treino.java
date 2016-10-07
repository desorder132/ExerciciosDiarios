package exercicios071016;

import java.util.Scanner;

public class Treino {
	
	public Treino() {
		exercicio1();
		
	}
		
		private void exercicio1(){
			
			int num1 = (new Scanner(System.in)).nextInt();
			int num2 = (new Scanner(System.in)).nextInt();
			
			if (num1 > num2){
				
				System.out.print("O numero 1 e o maior");
			}
			
			else{
				
				System.out.print("O numero 2 e o maior");
			}
		}
	

}
