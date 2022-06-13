package jSnacks;
import java.util.Scanner;
public class JSnack1 
{

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		int numero;
		int somma=0;
		int i=1;
		//for(i=1;i<=5;i++) 
		//{
		//   System.out.println("Inserisci un numero: ");
		  // numero=scanner.nextInt();
		   //somma=somma+numero;
		   
		//}
     //System.out.println("La somma e' " +somma);
		while(i<=5) 
		{
		   System.out.println("Inserisci un numero:  ");
		   numero=scanner.nextInt();
		   somma=somma+numero;
		   i++;
	    }
		System.out.println("La somma e' " +somma);
	}
}
