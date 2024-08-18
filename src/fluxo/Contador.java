package fluxo;

import java.util.Scanner;


public class Contador {
	
	public static void main(String[] args){
		Scanner terminal = new Scanner(System.in);
		
		System.out.println("Digite o parametro um:");
		int parametroUm=terminal.nextInt();
		
		System.out.println("Digite o parametro dois");
		int parametroDois=terminal.nextInt();
		
		try {
		contar(parametroUm, parametroDois);
		}catch(ParametrosInvalidosException e) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}
	
	
	} static void contar(int parametroUm, int parametroDois)throws ParametrosInvalidosException{
				if(parametroDois>parametroUm) {
				int a = parametroDois-parametroUm;
				for(int contagem=1; contagem<=a; contagem++) {
					System.out.println("Os numeros da subtração são : " + contagem);
					}
				}else 
					throw new ParametrosInvalidosException();
					
					
			}
			
	}
		


