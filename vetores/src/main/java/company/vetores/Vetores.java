
package company.vetores;

import java.util.Scanner;

public class Vetores {
   public static void main(String[] args) {
		int[] vet=new int[5];
		preenche(vet);
		mostra(vet);
		System.out.println(contaN(vet, 5));

	}

	public static void preenche(int[] v) {
		Scanner sc=new Scanner(System.in);
		for(int i=0; i<v.length; i++) {
			v[i]=sc.nextInt();
		}
	}
	
	public static void mostra(int[] v) {
		for(int i=0; i<v.length; i++) {
			System.out.print(v[i]+" ");
		}
		System.out.println();
	}
	
	public static int contaN(int[] v, int n) {
		int cont=0;
		for(int i=0; i<v.length; i++) {
			if(v[i]==n) {
				cont++;
			}
		}
		return cont;
	}
}
