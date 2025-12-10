public class Envio{
	String numero;
	Float precio;
	
	//El constructor se llama igual que la clase
	//Sirve para inicializar los atributos del objeto.
	public Envio(String numero, Float precio){
		this.numero = numero; //Ponemos this pra decir que ya lo tenemos declarado
		this.precio = precio;
		System.out.println("Construyendo objeto Envio...");
	}
	
	public String verComoString(){
		String texto = this.numero + "\t\t" + this.precio + "€";
		return texto;
		
	}
}