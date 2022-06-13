package jSnacks;

public class JSnack4 {

	public static void main(String[] args)
	{
		int [] lista = {1,2,3,4,5,6,7,8,9,10};
		int somma=0;
		for (int i=0;i<lista.length;i++)
		{
			if(i%2!=0)
			{
				somma=somma+i;
			}
     
	    }
		System.out.println("La somma e' "+somma);
    }
	
}
