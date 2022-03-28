package Exe1;

import java.util.Scanner;

public class Pagamento {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		double totalGasto;
		int opcaoPagamento;
		double desconto;
		int formaParcelamento;
		
		System.out.println("Qual foi o valor total gasto?");
		totalGasto = entrada.nextDouble();
		
		System.out.println("Selecione a forma de pagamento:");
		System.out.println("(1) À vista com 10% OFF");
		System.out.println("(2) Parcelado em 2x");
		System.out.println("(3) Parcelado de 3x até 6x");
		opcaoPagamento = entrada.nextInt();
		
		switch (opcaoPagamento){
        case 1:
            
            desconto = totalGasto*0.01;
            totalGasto = totalGasto - desconto;
            System.out.printf("O valor é: %.2f",totalGasto);
            System.out.println("");
            break;
            
        case 2:
            totalGasto = totalGasto/2;
            System.out.printf("2x de: %.2f",totalGasto);
            break;
            
        case 3:
            if(totalGasto<500){
                System.out.println("Parcelamento permitido apenas para compras a partir de R$500,00");
                break;
                
            }else{
            	
                System.out.println("Selecione o parcelamento desejado:");
                System.out.println("(3) 3x");
                System.out.println("(4) 4x");
                System.out.println("(5) 5x");
                System.out.println("(6) 6x");
                
                formaParcelamento = entrada.nextInt();
                switch (formaParcelamento){
                    case 3:
                        totalGasto = totalGasto / 3;
                        System.out.printf("3x de: %.2f" ,totalGasto);
                        System.out.println("");
                        break;
                        
                    case 4:
                        totalGasto = totalGasto / 4;
                        System.out.printf("4x de: %.2f",totalGasto);
                        System.out.println("");
                        break;
                        
                    case 5:
                        totalGasto = totalGasto/5;
                        System.out.printf("5x de: %.2f",totalGasto);
                        System.out.println("");
                        break;
                        
                    case 6:
                        totalGasto = totalGasto/6;
                        System.out.printf("6x de: %.2f",totalGasto);
                        System.out.println("");
                        break;
                        
                    default:
                        System.out.println("Opção Invalida!");

                }
            }

        default:
            System.out.println("Opção Invalida!");

    }
}

}
