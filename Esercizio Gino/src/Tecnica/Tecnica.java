package Tecnica;
import java.util.*;


public class Tecnica {
	

	Scanner s=new Scanner(System.in);

//Menù
	public void stampaMenù()
	{
		System.out.println("1 - Conversione Maiuscolo - Minuscolo");
		System.out.println("2 - Conversione Minuscolo - Maiuscolo");
		System.out.println("3 - Conversione Numero - Stringa");
		System.out.println("4 - Nominativo");
		System.out.println("5 - While con flag - False");
		System.out.println("6 - While con Flag - Dispari");
		System.out.println("7 - While con Flag - True - Break");
		System.out.println("8 - Esci");
	}
	
	
	
//1	
	public void maiuscoloMinuscolo()
	{
		
		char c=leggiChar("Inserisci Lettera Maiuscola da convertire: ");
		c+=32;
		System.out.println(c);
	}
	
//2	
	public void minuscoloMaiuscolo()
	{
		
		char c=leggiChar("Inserisci Lettera Minuscola da convertire: ");
		c-=32;
		System.out.println(c);
	
	}
	
//3
	public void stringaNumero()
	{
		
		String S1=leggiStringa("Inserisci Stringa da Convertire: ");
	
		double somma=0;
		int esponente=0;
	
		for(int i=(S1.length())-1; i>=0; i--)//i Minore della lunghezza della stringa perchè stringa=vettore di char(partire dal ultimo char)
		{									//i-- Perchè cosi vai dal ultima al primo char.
			
			double N1=S1.charAt(i)-48;// -48 Posizione/Offset da Stringa a Numero
			N1=(int) N1;//Converti da Double a Intero
			
			int base=10;//Inizializzo Base
			
			double potenza=Math.pow(base,esponente);//Unisco base e esponente con Funzione
			double pot2=N1*potenza;//esempio --> 5*10^0 / 5*10^1 etc..
			
			esponente++;
			somma=somma+pot2;//Somma + prodotto della potenza di prima.
		}
		
		System.out.println(somma);
		
		
	}
	
	
//4
	public void	Nominativo()//con Metodo
	{
		
		String Nome=leggiStringa("Inserisci Nome");
		String Cognome=leggiStringa("Inserisci Cognome: ");
		int Età=leggiIntero("Inserisci Età: ");
		
		String s = String.valueOf(Età);
		
		String Nominativo = Nome+Cognome+s;
		System.out.println(Nominativo);
		
	}
	
//5
	public void whileFlagFalse()
	{
		int cont=0;
		boolean flag=true;
		
			do{
					cont++;
					System.out.println(cont);	
						
					if(cont==10)
					{
						flag=false;
					}
						
			}while(cont<10);
			
		System.out.println(flag);
		System.out.println("L'esercizio ha avuto successo!! UwU");
	}
	
//6
	public void whileFlagDispari()
	{
		
		int cont=0;
		boolean flag=true;
		
			do{
				
					cont++;
						
					if(cont%2==0)
					{
						continue;
					}
					else
					{
						System.out.println(cont);
						
					}
			
				flag=false;
			}while(cont<10);
			
		System.out.println(flag);
		System.out.println("L'esercizio ha avuto successo!! UwU");
		
	}

//7
	public void whileFlagTrue()
	{
		
		int cont=0;
		boolean flag=true;
		
			do{
					cont++;
					System.out.println(cont);	
						
					if(cont==10)
					{
						break;
					}
						
			}while(cont<10);
			
		System.out.println(flag);
		System.out.println("L'esercizio ha avuto successo!! UwU");
		
	}
	
//Other
	
// |--------------------------------------------------------------------------------------------|
// |--------------------------------------------------------------------------------------------|
	
//Leggi Char
		
		public char leggiChar(String s1)
		{
			System.out.println(s1);
			char x;
			x=s.next().charAt(0);
			return x;
		}
 
		
//Leggi Intero
		
		public int leggiIntero(String n1)
		{
			System.out.print(n1);
			
			int num1=0;
			num1 =Integer.parseInt(s.nextLine());
			return num1;
		}
		
		
//Leggi Stringa
		
		public String leggiStringa(String s1)
		{
			System.out.println(s1);
			return s.nextLine();
		}

}
