package edu.menuClinica.servicios;

import java.util.Scanner;

/**
 * Implementacion de la interfaz menu
 * @author Jal-061023
 */
public class MenuImplementacion implements MenuInterfaz {

	@Override
	public int mostrarMenuYSeleccion(Scanner comunicacionTecladoM) {
		
		
		int opcionSeleccionada;
		
		System.out.println("#########################");
		System.out.println("0. Cerrar aplicacion");
		System.out.println("1. Registro de paciente");
		System.out.println("2. Ingreso de paciente");
		System.out.println("3. Alta paciente");
		System.out.println("4. Resumen de ingresos y altas");
		System.out.println("5. Historial del paciente");
		System.out.println("###########################");
		System.out.println("Elija una opcion: ");
		
		opcionSeleccionada=comunicacionTecladoM.nextInt();
		
		return opcionSeleccionada;
	}

}
