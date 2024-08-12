
public class Cittadino {

	protected String nome;
	protected String cognome;
	private String indirizzo;
	private String cap;
	private String città;
	protected String dataNascita;
	protected String sesso;
	protected String comuneNascita; 
	private String telefono; 
	
	
public Cittadino(){
	nome="";
	cognome="";
	indirizzo="";
	cap="";
	città="";
	dataNascita="";
	sesso="";
	comuneNascita="";
	telefono="";
	
}
public Cittadino(
	String nome,String cognome,String indirizzo,
	String cap,String città,String dataNascita,
	String sesso,String comuneNascita,String telefono) 
{
	this.nome=nome;
	this.cognome=cognome;
	this.indirizzo=indirizzo;
	this.cap=cap;
	this.città=città;
	this.dataNascita=dataNascita;
	this.sesso=sesso;
	this.comuneNascita=comuneNascita;
	this.telefono=telefono;
}

public String GetNome(){
	return nome;
}
public String getCognome() {
    return cognome;
}

public String getIndirizzo() {
    return indirizzo;
}

public String getCap() {
    return cap;
}
public String getCittà() {
    return città;
}
public String getDataNascita() {
    return dataNascita;
}
public String getSesso() {
    return sesso;
}
public String getComuneNascita() {
    return comuneNascita;
}
public String getTelefono(){
	return telefono;
}

//metodi set
public void setNome(String nome) {this.nome = nome;}
public void setCognome(String cognome) {this.cognome = cognome;}
public void setIndirizzo(String indirizzo) {this.indirizzo=indirizzo;}
public void setCap(String cap) {this.cap=cap;}
public void setCittà(String città) {this.città=città;}
public void setDataNascita(String dataNascita) {this.dataNascita=dataNascita;}
public void setSesso(String sesso) { this.sesso=sesso;}
public void setComuneNascita(String comuneNascita) {this.comuneNascita=comuneNascita;}
public void setTelefono(String telefono){this.telefono=telefono;}

public void visualizzaDatiPersonali() {
    System.out.println("Nome: " + nome);
    System.out.println("Cognome: " + cognome);
    System.out.println("Data di nascita: " + dataNascita);
    System.out.println("Sesso: " + sesso);
    System.out.println("Comune di nascita: " + comuneNascita);
}

public void visualizzaRecapiti() {
    System.out.println("Indirizzo: " + indirizzo);
    System.out.println("CAP: " + cap);
    System.out.println("Città: " + città);
    System.out.println("Telefono: " + telefono);
}


}
