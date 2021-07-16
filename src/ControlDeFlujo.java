import java.util.Scanner;

public class ControlDeFlujo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * if(condicion) si se cumple{
		 * codigo
		 * codigo
		 * codigo
		 * }
		 * 
		 * if(condicion) si se cumple{
		 * codigo
		 * codigo
		 * codigo
		 * }
		 * si no se cumple la condicion se ejecuta else
		 * else {
		 * codigo
		 * codigo
		 * codigo
		 * }
		 * 
		 * if(condicion) si se cumple{
		 * codigo
		 * codigo
		 * codigo
		 * }else {
		 * codigo
		 * codigo
		 * codigo
		 * }
		 */
			Scanner in = new Scanner(System.in);
			String nombre;
			
			System.out.println("Escribe tu o tus nombres: ");
			nombre = in.nextLine();
			System.out.println("Ingresa tu edad: ");
			int edad = Integer.parseInt(in.nextLine());
			String mensaje = aceptado(nombre,edad);
			
			System.out.println(mensaje);
			
		
	}
	public static String aceptado(String nombre,int edad) {
		String mensaje ="";
		if(edad >= 18 & edad <= 29) {
		mensaje = "Felicidades " + nombre + ", estas aceptado en el"
		+ " programa de generation Java Full Stack";
		} else {
		mensaje = "No cumples lo requisitos para el bootcamp Java Full Stack";
				
		}
		return mensaje;
	}
	/*public static String votar(int edad) {
		String mensaje="";
		if(edad>=18) {
			mensaje = "Felicidade puedes votar";
		} else {
			mensaje = "No puedes votar";
		}
		return mensaje;
	}
	*/
}
