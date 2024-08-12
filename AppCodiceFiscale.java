import java.util.*;
public class AppCodiceFiscale {
	public static void main(String[] args){
	
		  String nome="  ";
		  String cognome="";
		  String indirizzo="";
		  String cap="";
		  String anno="";
		  String mese="";
		  String giorno="";
		  String città="";
		  String dataNascita="";
		  String sesso="";
		  String comuneNascita="";
		  String telefono="";
		  String scelta="";
		  String continuoUscita="";
		  Scanner in = new Scanner(System.in); 
		  
		 System.out.println("Benvenuto nel programma per calcolare il codice fiscale!");
do{
          System.out.println("Come desideri procedere?");
          System.out.println("1.Inserire i dati di un cittadino e successivamente decidere se calcolare il codice fiscale");
          System.out.println("2.Calcolare il codice fiscale");
          System.out.println("3.Uscire");
          System.out.print("Scelta: ");
          scelta=in.next();
		  Contribuente contribuente= new Contribuente();
		 switch (scelta) {
          		case "1":
          			System.out.println("Inserisci il Nome: ");
          			nome = in.next();
          			in.nextLine();
          			System.out.println("Inserisci il Cognome: ");
          			cognome = in.next();
          			in.nextLine();
          			System.out.println("-----------------");
	            	
          			System.out.println("Inserisci l'indirizzo: ");
          			indirizzo = in.next();
          			in.nextLine();
          			System.out.println("Inserisci il Codice di avviamento Postale (CAP): ");
          			cap = in.next();	    
          			in.nextLine();
          			
		            System.out.println("-----------------");
		            
		            
		            System.out.println("Inserisci la cittá: ");
		             città = in.next();	  
		             in.nextLine();
		            System.out.println("Inserisci la tua data di nascita (giorno,mese,anno): ");
		            
		            System.out.println("giorno: ");
		             giorno= in.next();
		             
		             
		            System.out.println("-----------------");
		            
		            
		            System.out.println("mese: ");
		             mese= in.next();	
		             
		            System.out.println("-----------------");
		             
		            System.out.println("anno: ");
		             anno= in.next();
		            
		            dataNascita = giorno + "/" + mese + "/" + anno;
		            
		            
		            System.out.println("-----------------");
		            
		            
		            System.out.println("Inserisci il sesso (M/F): ");
		             sesso = in.next();
		            
		            System.out.println("Inserisci il comune di nascita : ");
		            comuneNascita = in.next();
		            in.nextLine();
		            System.out.println("-----------------");
		            
		            System.out.println("Inserisci il  numero di telefono : ");
		           	telefono= in.next();
		           	in.nextLine();
		           	Cittadino cittadino = new Cittadino(nome,cognome,indirizzo,cap,città,dataNascita,sesso,comuneNascita,telefono);   
				     System.out.println("\n Ecco i dati personali del cittadino:");
				     cittadino.visualizzaDatiPersonali();
				  	 System.out.println("\n Ecco i recapiti del cittadino:");
				     cittadino.visualizzaRecapiti();
				     System.out.println("Ora... vuoi calcolare il Codice Fiscale? (SI/NO): ");
			         String sceltaCalcoloCF= in.next();
			         if (sceltaCalcoloCF.equalsIgnoreCase("SI") || sceltaCalcoloCF.equalsIgnoreCase("S")) {
			 	             if(contribuente.checkCodiceFiscale(nome,cognome,comuneNascita,anno,mese,giorno,sesso)){
			 	            	 System.out.println("Calcolo del codice fiscale in corso...");
			 	            	String CodiceFiscale= contribuente.calcolaCodiceFiscale(nome,cognome,comuneNascita,anno,mese,giorno,sesso);
			 	            	 System.out.println("Codice Fiscale: "+CodiceFiscale);
			 	             }
			         }else if(sceltaCalcoloCF.equalsIgnoreCase("NO") || sceltaCalcoloCF.equalsIgnoreCase("N")){
            	   		System.out.println("Arrivederci!");
            	   		break;
			         }
			         	break;
          		case "2":
              	 System.out.println("Inserisci il tuo nome: ");
              	 	nome=in.next();
              	 	in.nextLine();	
	             System.out.println("Inserisci il tuo cognome: ");
	               cognome = in.next();
	               	in.nextLine();
	             System.out.println("-----------------");
	            
	             System.out.println("Inserisci la tua data di nascita (giorno,mese,anno): ");
	            
	             System.out.println("giorno: ");
	                 giorno= in.next();
	               
	             System.out.println("-----------------");
	            	
	             System.out.println("mese: ");
	                mese= in.next();	
	                
	             System.out.println("-----------------");
	             
	             System.out.println("anno: ");
	                anno= in.next();
	                
	             System.out.println("-----------------");
	             
	             System.out.println("Inserisci il sesso (M/F): ");
	                sesso = in.next();
	                in.nextLine();
	             System.out.println("-----------------");
	             
	            System.out.println("Inserisci il comune di nascita : ");
	               comuneNascita = in.next();
	               in.nextLine();
	             	if(contribuente.checkCodiceFiscale(nome,cognome,comuneNascita,anno,mese,giorno,sesso)) {
	             		System.out.println("Calcolo del codice fiscale in corso...");
	             		System.out.println("Codice Fiscale corretto!");
	             		String CodiceFiscale= contribuente.calcolaCodiceFiscale(nome,cognome,comuneNascita,anno,mese,giorno,sesso);
	             		System.out.println("Codice Fiscale: "+CodiceFiscale);
	             	}
              break;
          case "3":
              System.out.println("Arrivederci!");
              break;
          default:
              System.out.println("Scelta non valida.");
              
      }
		 System.out.println("vuoi continuare o vuoi uscire? (continuo/uscita)");
		  continuoUscita=in.next();
	}while(!scelta.equals("3") && continuoUscita.equals("continuo"));	 
	    	 
	    
	      in.close();
	      
	      
	      
	      
	}
}
