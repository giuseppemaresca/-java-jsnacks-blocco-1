package jSnacks;
import java.util.Scanner;
public class JSnack2 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int numero;
		System.out.println("Inserisci un numero: ");
		numero=scanner.nextInt();
		if(numero%2==0) 
		{
         System.out.println("Il tuo numero e' "+ numero);
       	}
		else {
			numero=numero+1;
			System.out.println("Il tuo numero e'  " +numero);
		}
		scanner.close();
	}
}
