package Exe4;

import java.util.Scanner;

public class Operadora_Aerea {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
        int menu = 0;
        String nome;
        String cpf;
        int numVoo;
        int numPoltrona;
        
        boolean[] poltrona = new boolean[100];
        
        for(int i=0;i<poltrona.length;i++){
            poltrona[i]=true;
        }
        while (menu != 4) {
        	
        	System.out.println("1 - Cadastrar passageiro \n2 - Check in \n3 - Cancelar voo \n4 - Sair");
           
            menu = entrada.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("Tela Cadastro passageiro");
                    System.out.println("Escreva o nome do Passageiro: ");
                    nome = entrada.next();
                    System.out.println("Escreva o CPF do Passageiro: ");
                    cpf = entrada.next();
                    System.out.println("Escreva o numero do voo do Passageiro: ");
                    numVoo = entrada.nextInt();
                    System.out.println("Cadastro efetuado com sucesso! Seu voo é o " + numVoo + "." );
                    break;
                case 2:
                    System.out.println("Tela Check in ");
                    System.out.println("Escreva o CPF do Passageiro: ");
                    cpf = entrada.next();
                    System.out.println("Escreva o numero do voo do Passageiro: ");
                    numVoo = entrada.nextInt();
                    System.out.println("Escreva o numero da Poltrona : ");
                    numPoltrona = entrada.nextInt();
                    while (numPoltrona>poltrona.length){
                        System.out.println("Poltrona Invalida Escolha uma de 1-100");
                        numPoltrona = entrada.nextInt();
                    }
                    while(poltrona[numPoltrona-1]==false||numPoltrona>=poltrona.length){
                        if(poltrona[numPoltrona-1]==false)System.out.println("Poltrona já ocupada, Escolha outra ");
                        numPoltrona = entrada.nextInt();
                        if(poltrona[numPoltrona-1]==true){
                            poltrona[numPoltrona-1]=false;
                            break;
                        }
                    }
                    poltrona[numPoltrona-1]=false;
                    System.out.println("Check in realizado com sucesso!");
                    break;
                case 3:
                    System.out.println("Tela Cancelar voo");
                    System.out.println("Escreva o CPF do Passageiro: ");
                    cpf = entrada.next();
                    System.out.println("Escreva o numero do voo do Passageiro: ");
                    numVoo = entrada.nextInt();
                    System.out.println("Escreva o numero da Poltrona : ");
                    numPoltrona = entrada.nextInt();
                    while (numPoltrona>poltrona.length){
                        System.out.println("Poltrona Invalida Escolha uma de 1-100");
                        numPoltrona = entrada.nextInt();
                    }
                    poltrona[numPoltrona-1]=true;
                    System.out.println("Voo cancelado com sucesso!");
                    break;
                case 4:
                    System.out.println("SISTEMA ENCERRADO!");
                    break;
                default:
                    System.out.println("Opção Invalida!");
                    break;

            }
        }
    }

}


