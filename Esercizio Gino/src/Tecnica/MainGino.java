package Tecnica;

public class MainGino {

	public static void main(String[] args) {
		
		 Tecnica w= new Tecnica();
		 String ripeti=null;

		 	do {
		 		
		 	
			w.stampaMenù();
			
			int scelta = w.leggiIntero("Inserisci un Numero: ");
			
					
			switch(scelta) {
			case 1:		
				w.maiuscoloMinuscolo();		
				break;
			case 2:				
				w.minuscoloMaiuscolo();							
				break;
			case 3:
				do {
				w.stringaNumero();	
				ripeti=w.leggiStringa("Vuoi tornare al Menù? Si/No ");
				}while(ripeti.equals("No"));
				break;
			case 4:	
				do {
				w.Nominativo();		
				ripeti=w.leggiStringa("Vuoi tornare al Menù? Si/No ");
				}while(ripeti.equals("No"));
				break;
			case 5:		
				do {
				w.whileFlagFalse();	
				ripeti=w.leggiStringa("Vuoi tornare al Menù? Si/No ");
				}while(ripeti.equals("No"));
				break;
			case 6:
				do {
				w.whileFlagDispari();
				ripeti=w.leggiStringa("Vuoi tornare al Menù? Si/No ");
				}while(ripeti.equals("No"));
				break;
			case 7:
				do {
				w.whileFlagTrue();
				ripeti=w.leggiStringa("Vuoi tornare al Menù? Si/No ");
				}while(ripeti.equals("No"));
				break;
			case 8:System.out.println("Sei Uscito dal Programma UwU");
				break;
			default:
				break;
			}
			
			
			if(scelta!=8)
			{
			ripeti=w.leggiStringa("Vuoi ripetere l'esericizio?? Si/No ");
			}
			else
			{
				ripeti="No";
			}
			
			
			}while(ripeti.equals("Si") );
					
		
	
	}

}
	

