import java.util.Scanner;
public class Programa {
	static Scanner teclado = new Scanner(System.in);
	static Envio[] envios = new Envio[50];
	static Integer iEnvios = 0;
	public static void main(String arguments[]) {
		Boolean repetirMenu = true;
		
		do{
			
			switch(verMenu()){
				case "1":
						registrarEnvio();
						break;
				case "2":
				
						break;
				case "x":
				case "X":
						repetirMenu = false;
						break;
				default: 
						System.out.println("Opcion desconocida.");
			}
				
		}while(repetirMenu);
		
		teclado.close();
		System.out.println("Fin del programa. Espero volver a verle pronto.");
	}
	
	public static String verMenu(){
			System.out.println("APLICACIÓN DE PaqueteMetes 1.0;
			System.out.println("\t1. Registrar Envío");
			System.out.println("\t2. Ver Informe de Envíos");
			System.out.println("\tx. Salir");
			System.out.println("\tOpción: ");
			return teclado.nextLine();
	}
	
	public static void registrarEnvio(){
		while(true){
				try{						
					System.out.println("\nRegistro de Envío");
					System.out.print("\tNúmero: ");
					String numero = teclado.nextLine();
					System.out.print("\tPrecio: ");
					Float precio = Float.valueOf(teclado.nextLine());
					
					Envio envio = new Envio();
					envio.numero = numero;
					envio.precio = precio;
					envios[iEnvios++]= envio;
					
					System.out.println("Registro OK");
				}
				catch(Exception excepcion){
					System.out.println("Registro KO");
				}
		}
	}
	

	
} 












