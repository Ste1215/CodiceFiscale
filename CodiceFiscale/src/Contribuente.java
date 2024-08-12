
public class Contribuente extends Cittadino{

	private String codiceFiscale;
	
	
	public Contribuente() {
		super();
		codiceFiscale="";
	}
	public Contribuente(String nome,String cognome,String indirizzo,String cap,String città,String dataNascita,String sesso,String comuneNascita,String telefono,String codiceFiscale) {
		super(nome,cognome,indirizzo,cap,città,dataNascita,sesso,comuneNascita,telefono);
		this.codiceFiscale=codiceFiscale;
	}
	
public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale=codiceFiscale;
}
public String getCodiceFiscale() {
		return codiceFiscale;
}
private String calcolaCampoNome(String nomeInserito) {
    String nomeCalcolato = "";
    int contConsonanti = 0;
    	char carattere;
    for (int i = 0; i < nomeInserito.length(); i++) {
         carattere = Character.toLowerCase(nomeInserito.charAt(i));
        if (carattere != 'a' && carattere != 'e' && carattere != 'i' && carattere != 'o' && carattere != 'u') {
            contConsonanti++; 
            if (contConsonanti == 1 || contConsonanti == 3 || contConsonanti == 4) {
                nomeCalcolato += carattere;
            }
        }
    }

    
    while (nomeCalcolato.length() < 3 ) {
        for (int i = 0; i < nomeInserito.length(); i++) {
             carattere = Character.toLowerCase(nomeInserito.charAt(i));
            if (carattere == 'a' || carattere == 'e' || carattere == 'i' || carattere == 'o' || carattere == 'u') {
                nomeCalcolato += carattere;
            }
        }
        contConsonanti++;
    }

   
    while (nomeCalcolato.length() < 3 ) {
        nomeCalcolato += 'X';
    }

    return nomeCalcolato;
}

private String[] CalcolaCampoCognome(String cognomeInserito) {
	char carattere1= '\0';
    char carattere2= '\0';
    char carattere3= '\0';
    int cont=0;
    
for (int i=0; i < cognomeInserito.length(); i++) {
	 char carattere = cognomeInserito.charAt(i);
	  if (carattere != 'a' && carattere != 'e' && carattere != 'i' && carattere != 'o' && carattere != 'u') {
          if (cont == 0) {
              carattere1 = carattere;
          } else if (cont == 1) {
              carattere2 = carattere;
          } else if (cont == 2) {
              carattere3 = carattere;
          }
          cont++;
      }
}
while (cont < 3) {
    for (int i = 0; i < cognomeInserito.length(); i++) {
        char carattere = cognomeInserito.charAt(i);
        if (carattere == 'a' || carattere == 'e' || carattere == 'i' || carattere == 'o' || carattere == 'u') {
            if (cont == 0) {
                carattere1 = carattere;
            } else if (cont == 1) {
                carattere2 = carattere;
            } else if (cont == 2) {
                carattere3 = carattere;
            }
            cont++;
            break; 
        }
    }
}
String[] v = {String.valueOf(carattere1), String.valueOf(carattere2), String.valueOf(carattere3) };
return v;
}
private String calcolaCampoAnno(String annoNascita) {
	String annoCalcolato="";
    if (annoNascita.length() >= 2) {
        int indice = annoNascita.length() - 2;
        annoCalcolato = annoNascita.substring(indice);
    }
    return annoCalcolato;
}
private String calcolaCampoMese(String Mese){
	String MeseCalcolato="";
	if(Mese.length() == 2){
		MeseCalcolato=Mese;
	}else if(Mese.length() < 2) {
		System.out.println("il mese inserito non è valido ");
	}
	switch (MeseCalcolato){
		case "01":
			MeseCalcolato="A";
			break;
		case "02": 
			MeseCalcolato="B";
			break;
		case "03": 
			MeseCalcolato="C";
			break;
		case "04": 
			MeseCalcolato="D";
			break;
		case "05": 
			MeseCalcolato="E";
			break;
		case "06": 
			MeseCalcolato="H";
			break;
		case "07": 
			MeseCalcolato="L";
			break;
		case "08": 
			MeseCalcolato="M";
			break;
		case "09": 
			MeseCalcolato="P";
			break;
		case "10": 
			MeseCalcolato="R";
			break;
		case "11": 
			MeseCalcolato="S";
			break;
		case "12": 
			MeseCalcolato="T";
			break;
	}
	return MeseCalcolato;
}

private String calcolaCampoGiorno(String Giorno,String sesso){
	String GiornoCalcolato="";
	int giorno=0;
	if(Giorno != null && Giorno.length() == 2){
		  giorno = Integer.parseInt(Giorno);
		if(sesso != null && sesso.equalsIgnoreCase("F")) {
			giorno+=40;
		}
		GiornoCalcolato = String.valueOf(giorno);
	}
	return GiornoCalcolato;
}
private String calcolaCampoComune(String ComuneInserito){
	String ComuneCalcolato="";
	switch (ComuneInserito.toLowerCase()) {
		case "genova":
		case "ge":
			ComuneCalcolato= "D969";	
		break;
		case "milano":
		case "mi":
			ComuneCalcolato= "F205";	
		break;
        case "roma":
        case "rm" :
        	ComuneCalcolato = "H501";
            break;
        case "napoli":
        case "na":
        	ComuneCalcolato = "F839";
            break;
        case "palermo":
        case "pa":
        	ComuneCalcolato = "G273";
            break;
        case "firenze":
        case "fi":
            ComuneCalcolato = "D612";
            break;
        case "bologna":
        case "bo":
            ComuneCalcolato = "A944";
            break;
        case "torino":
        case "to":
            ComuneCalcolato = "L219";
            break;
        default:
            System.out.println("Il comune inserito non è valido.");
            break;
	}
	return ComuneCalcolato;
}

private char calcolaCarattereControllo(String cfParziale) {
    int sommaPari = 0;
    int sommaDispari = 0;
    
    for (int i = 0; i < cfParziale.length(); i++) {
        char carattere = Character.toUpperCase(cfParziale.charAt(i));
       
        int valore = 0;
        if ((i+1) % 2 == 0){
            switch (carattere) {
                case 'A': case '0': valore = 0; break;
                case 'B': case '1': valore = 1; break;
                case 'C': case '2': valore = 2; break;
                case 'D': case '3': valore = 3; break;
                case 'E': case '4': valore = 4; break;
                case 'F': case '5': valore = 5; break;
                case 'G': case '6': valore = 6; break;
                case 'H': case '7': valore = 7; break;
                case 'I': case '8': valore = 8; break;
                case 'J': case '9': valore = 9; break;
                case 'K': valore = 10; break;
                case 'L': valore = 11; break;
                case 'M': valore = 12; break;
                case 'N': valore = 13; break;
                case 'O': valore = 14; break;
                case 'P': valore = 15; break;
                case 'Q': valore = 16; break;
                case 'R': valore = 17; break;
                case 'S': valore = 18; break;
                case 'T': valore = 19; break;
                case 'U': valore = 20; break;
                case 'V': valore = 21; break;
                case 'W': valore = 22; break;
                case 'X': valore = 23; break;
                case 'Y': valore = 24; break;
                case 'Z': valore = 25; break;
                default: valore = -1000; 
            }
            sommaPari += valore;
        
        }else{
            switch (carattere) {
                case 'A': case '0': valore = 1; break;
                case 'B': case '1': valore = 0; break;
                case 'C': case '2': valore = 5; break;
                case 'D': case '3': valore = 7; break;
                case 'E': case '4': valore = 9; break;
                case 'F': case '5': valore = 13; break;
                case 'G': case '6': valore = 15; break;
                case 'H': case '7': valore = 17; break;
                case 'I': case '8': valore = 19; break;
                case 'J': case '9': valore = 21; break;
                case 'K': valore = 2; break;
                case 'L': valore = 4; break;
                case 'M': valore = 18; break;
                case 'N': valore = 20; break;
                case 'O': valore = 11; break;
                case 'P': valore = 3; break;
                case 'Q': valore = 6; break;
                case 'R': valore = 8; break;
                case 'S': valore = 12; break;
                case 'T': valore = 14; break;
                case 'U': valore = 16; break;
                case 'V': valore = 10; break;
                case 'W': valore = 22; break;
                case 'X': valore = 25; break;
                case 'Y': valore = 24; break;
                case 'Z': valore = 23; break;
                default: valore = -1000; 
            }
            sommaDispari += valore;
           
        }
    }
    
    int sommaTotale = sommaPari + sommaDispari;
    int resto= sommaTotale % 26;

    
    char carattereControllo;
    switch (resto){
        case 0: carattereControllo = 'A'; break;
        case 1: carattereControllo = 'B'; break;
        case 2: carattereControllo = 'C'; break;
        case 3: carattereControllo = 'D'; break;
        case 4: carattereControllo = 'E'; break;
        case 5: carattereControllo = 'F'; break;
        case 6: carattereControllo = 'G'; break;
        case 7: carattereControllo = 'H'; break;
        case 8: carattereControllo = 'I'; break;
        case 9: carattereControllo = 'J'; break;
        case 10: carattereControllo = 'K'; break;
        case 11: carattereControllo = 'L'; break;
        case 12: carattereControllo = 'M'; break;
        case 13: carattereControllo = 'N'; break;
        case 14: carattereControllo = 'O'; break;
        case 15: carattereControllo = 'P'; break;
        case 16: carattereControllo = 'Q'; break;
        case 17: carattereControllo = 'R'; break;
        case 18: carattereControllo = 'S'; break;
        case 19: carattereControllo = 'T'; break;
        case 20: carattereControllo = 'U'; break;
        case 21: carattereControllo = 'V'; break;
        case 22: carattereControllo = 'W'; break;
        case 23: carattereControllo = 'X'; break;
        case 24: carattereControllo = 'Y'; break;
        case 25: carattereControllo = 'Z'; break;
        default: carattereControllo = '?'; break;
    }
    
    return carattereControllo;
}





public boolean checkCodiceFiscale(String nomeInserito,String cognomeInserito ,String comuneInserito,String annoNascita, String Mese,String Giorno,String Sesso){
	String codicefiscaleCompleto=calcolaCodiceFiscale(nomeInserito, cognomeInserito , comuneInserito, annoNascita,  Mese, Giorno, Sesso);
	if(codicefiscaleCompleto.length() != 16) {
		 System.out.println("Il codice fiscale non è valido");
	        return false;
	}
	String CodiceParziale = codicefiscaleCompleto.substring(0,15);
	char carattereControllo= calcolaCarattereControllo(CodiceParziale);
	char carattereControlloEffettivo = codicefiscaleCompleto.charAt(15);
	if(carattereControllo != carattereControlloEffettivo) {
		System.out.println("Il codice fiscale non è valido");
		return false;
	}
	return true;
}

public String  calcolaCodiceFiscale(String nomeInserito,String cognomeInserito ,String comuneInserito,String annoNascita, String Mese,String Giorno,String Sesso){
 String nome= calcolaCampoNome(nomeInserito);
 String[] cognome= CalcolaCampoCognome(cognomeInserito);
 String anno= calcolaCampoAnno(annoNascita);
 String mese= calcolaCampoMese(Mese);
 String giorno = calcolaCampoGiorno(Giorno,Sesso);
 String comune = calcolaCampoComune(comuneInserito);
 String cfParziale = cognome[0] + cognome[1]+ cognome[2] + nome + anno + mese + giorno + comune;
 char carattereControllo = calcolaCarattereControllo(cfParziale);
 codiceFiscale = cognome[0] + cognome[1]+ cognome[2] + nome + anno + mese + giorno + comune +carattereControllo ;
 return codiceFiscale.toUpperCase();
}
}

