package jSnacks;
import java.util.Random;
public class JSnack3 {

	public static void main(String[] args) {
		 String[] nomi= {"Peppe","Tonino","Armando"};
		 String[] cognomi= {"Maresca","Esposito","E Molto Bello"};
		 Random random=new Random();
		 for (int i=0;i<3;i++)
		 {
			 int nom=random.nextInt(3);
			 int cog=random.nextInt(3);
			 System.out.println(nomi[nom]+cognomi[cog]);
		 }
		 
		 }
	}

