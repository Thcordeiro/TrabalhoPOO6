package questao6;

import java.util.Scanner;

public class atividade6 {
	public static void main(String[] args) {
		Scanner scanf=new Scanner(System.in);
		int A[]=new int[6];
		int B[]=new int[6];
		for(int i=0;i<A.length;i++) {
			System.out.println("Insira o "+(i+1)+" numero inteiro:");
			A[i]=scanf.nextInt();
			if(A[i]%2==0) {
				
				B[i]=1;
				
			}else {
				
				B[i]=0;
			}
			//System.out.println(B[i]);
			
		}
		System.out.println("Vetor B:");
		System.out.println("0=Impar\n1=Par");
		for(int i=0;i<B.length;i++) {
			System.out.print("["+B[i]+"]");
		}

	}


}
