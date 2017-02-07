package conexionesssh;

import java.util.Scanner;

public class DatosEntradaSalida {

	public void Iniciomenu(){
		int numeroOpcion = 0;
		
		System.out.println("Eliga una opcion: ");
		
		while(numeroOpcion != 5)
		{		
			System.out.println("\n1-Buscar Patologias por nombre");
			System.out.println("2-Buscar Sintomas por nombre");
			System.out.println("3-Listar patologias");
			System.out.println("4-Buscar patologias por sintoma");
			System.out.println("5-Salir\n");
			numeroOpcion = pedirNumero();
			try {
				menuAccion(numeroOpcion);
			} catch (Throwable e) {
				e.printStackTrace();
			}
		}
	}

	public static void menuAccion(int numeroMenu) throws Throwable{
		switch (numeroMenu) {
		case 1:
			Conexion.conexion(Consultas.PATOLOGIA_NOMBRE);
			break;
		case 2:
			Conexion.conexion(Consultas.SINTOMA_NOMBRE);
			break;
		case 3:
			Conexion.conexion(Consultas.LISTAR_PATOLOGIAS);
			break;
		case 4:
			Conexion.conexion(Consultas.LISTAR_PATOLOGIA_SINTOMA);
			break;
		default:
			System.out.println("Numero no valido");
			break;
		}
	}
	
	
	public static int pedirNumero() {
		int numero_introducido = 0;
		Scanner scanner = null;
		scanner = new Scanner(System.in);
		numero_introducido = scanner.nextInt();
		return numero_introducido;
	}
	public static String pedirNombre() {
		String n_introducido = null;
		Scanner scanner = null;
			scanner = new Scanner(System.in);
			n_introducido = scanner.nextLine();
		return n_introducido;
	}
}
