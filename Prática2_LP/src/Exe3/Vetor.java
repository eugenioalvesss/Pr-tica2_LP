package Exe3;

import java.util.Arrays;
import java.util.Random;

public class Vetor {

	public static void main(String[] args) {
		
		  int [] imprime = new int[10];
	        Random random = new Random();
	        
	        for (int i = 0; i < imprime.length; i++){
	            int preencher = random.nextInt(0,100);
	            imprime[i] = preencher;
	        }
	        
	        Arrays.sort(imprime);
	        for (int i = 0;i < imprime.length; i++){
	            System.out.printf("%d\t",imprime[i]);
	        }
	    }
	}