import java.util.Scanner;

public class ArrayEx1 {
	public static void main(String[] args) {
		
		//Criar vetor A e copiar seus valores para o vetor B.
		
		Scanner ask = new Scanner(System.in);
		
		int [] VetorA = new int [5];
		int [] VetorB = new int [5];
		
		for(int i = 0; i <=4; i++) {
			System.out.print("Digite um número: ");
			VetorA[i] = ask.nextInt();
			VetorB[i] = VetorA[i];
		}
		
		
		for(int i = 0; i <= 4; i++) {
			System.out.printf("Vetor A (posicao %d): %d \n", i, VetorA[i]);
		}
		for(int i = 0; i <= 4; i++) {
			System.out.printf("Vetor B (posicao %d): %d \n", i, VetorB[i]);
		}
		
	}
}
