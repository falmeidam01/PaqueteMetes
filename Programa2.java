/*
* Programa.java
*@author: Linus Torvalds
*/
import java.util.Scanner;
public class Programa2 {
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
						verInformeEnvios();
						break;
				case "3":
						enviar();
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
			System.out.println("\nAPLICACIÓN DE PaqueteMetes");
			System.out.println("\t1. Registrar Envío");
			System.out.println("\t2. Ver Informe de Envíos");
			System.out.println("\t3. Realizar Envio");
			System.out.println("\tx. Salir");
			System.out.println("\tOpción: ");
			return teclado.nextLine();
	}
	
	public static void registrarEnvio(){
		while(true){
				try{						
					System.out.println("\nRegistro de Envío");
					System.out.print("\tPulse ENTER para volver al menú o escriba número para registrar el envío: ");
					String numero = teclado.nextLine();
						if(numero.isEmpty()){
							System.out.println("Volviendo al menú...");
						break;
						}
					System.out.print("\tPrecio: ");
					Float precio = Float.valueOf(teclado.nextLine());
					
					Envio envio = new Envio(numero, precio); // lo ponemos entre parentesis porque metemos en la clase Envio
					
					envios[iEnvios++] = envio;

					System.out.println("Registro OK");
					
				}
				catch(Exception excepcion){
					System.out.println("Registro KO");
				}
		}
	}
	
	public static void verInformeEnvios(){
		
	System.out.println("\n\tINFORME DE ENVÍOS");
		

    Float total = 0.00f;

		for(int i = 0; i < iEnvios; i++){
			Envio numeroEnvios = envios[i];
			System.out.println((i+1) + ". " +  numeroEnvios.verComoString());
			total += numeroEnvios.precio;
		}

		System.out.println("--------------------------");
		
		System.out.println("Importe total: " + total + " €\n");
		}
	
	public static void enviar(){
		
		
	}
	
} 












